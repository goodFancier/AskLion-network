package com.messager.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.messager.Model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class KafkaServiceImpl implements KafkaService {

    private final KafkaTemplate<Long, User> kafkaServiceTemplate;
    private final ObjectMapper objectMapper;


    private static final Logger logger = LoggerFactory.getLogger(KafkaServiceImpl.class);


    @Autowired
    public KafkaServiceImpl(KafkaTemplate<Long, User> kafkaServiceTemplate,
                               ObjectMapper objectMapper) {
        this.kafkaServiceTemplate = kafkaServiceTemplate;
        this.objectMapper = objectMapper;
    }

    @Override
    public User save(User dto) {
        return null;
    }

    @Override
    public void send(User dto) {
        logger.info("<= sending {}", writeValueAsString(dto));
        kafkaServiceTemplate.send("server.user", dto);
    }

    @Override
    @KafkaListener(id = "User", topics = {"server.user"}, containerFactory = "singleFactory")
    public void consume(User dto) {
        logger.info("=> consumed {}", writeValueAsString(dto));
    }

    private String writeValueAsString(User dto) {
        try {
            return objectMapper.writeValueAsString(dto);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("Writing value to JSON failed: " + dto.toString());
        }
    }
}
