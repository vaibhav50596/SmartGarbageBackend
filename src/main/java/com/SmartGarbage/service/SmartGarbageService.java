package com.SmartGarbage.service;

import com.SmartGarbage.dao.SmartGarbageDao;
import com.SmartGarbage.model.GarbageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "SmartGarbageService") //when we annotate something, it converts to camel casing..

public class SmartGarbageService {
    @Autowired
    SmartGarbageDao smartGarbageDao;

    public List<GarbageModel> getGarbage(){
        return smartGarbageDao.getGarbage();
    }
}
