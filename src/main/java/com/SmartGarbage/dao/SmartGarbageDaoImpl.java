package com.SmartGarbage.dao;
import com.SmartGarbage.model.GarbageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "SmartGarbageDao")
public class SmartGarbageDaoImpl implements SmartGarbageDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public GarbageModel getGarbage() {
        String sqlQuery = "SELECT * from garbagedata";
        try{
            return jdbcTemplate.queryForObject(sqlQuery, new SmartGarbageRowMapper());
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }





}
