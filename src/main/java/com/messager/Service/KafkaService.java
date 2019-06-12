package com.messager.Service;

import com.messager.Model.User;

public interface KafkaService {

    User save(User dto);

    void send(User dto);

    void consume(User dto);
}