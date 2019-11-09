package com.SmartGarbage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.SmartGarbage.model.GarbageModel;
import com.SmartGarbage.dao.SmartGarbageDao;
import com.SmartGarbage.service.SmartGarbageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmartGarbageController {
    @Autowired
    SmartGarbageService smartGarbageService;
    @GetMapping(value= "/getgarbage")
    public GarbageModel getGarbage(){
        GarbageModel garbageModel = smartGarbageService.getGarbage();
        return garbageModel;
    }


}
