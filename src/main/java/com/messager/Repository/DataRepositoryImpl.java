package com.messager.Repository;

import com.messager.Entity.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.HashSet;
import java.util.Set;

@org.springframework.stereotype.Repository("dataRepository")
public class DataRepositoryImpl implements DataRepository<Data> {

    @Autowired
    protected JdbcOperations jdbcOperations;

    @Override
    public void persist(Data object) {
/*
        Object[] params = new Object[] { object.getId(), object.getDescription() };
        int[] types = new int[] { Types.VARCHAR, Types.VARCHAR };
        jdbcOperations.update("UPDATE stocks SET Name = \"saas\" WHERE stocks.RecID = 138;");
        */
    }

    @Override
    public void delete(Data object) {
        jdbcOperations.update("DELETE FROM stocks WHERE RecID = 138;");
    }

    @Override
    public Set<String> getRandomData() {
        Set<String> result = new HashSet<>();
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT * FROM users;");
        while (rowSet.next()) {
            result.add(rowSet.toString());
        }
        return result;
    }
}
