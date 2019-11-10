package com.SmartGarbage.dao;
import com.SmartGarbage.model.GarbageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "SmartGarbageDao")
public class SmartGarbageDaoImpl implements SmartGarbageDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<GarbageModel> getGarbage() {
        String sqlQuery = "SELECT * from garbagedata";
        try{
            List<GarbageModel> garbageList = jdbcTemplate.query(sqlQuery, new SmartGarbageRowMapper());
            return garbageList;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }






}
