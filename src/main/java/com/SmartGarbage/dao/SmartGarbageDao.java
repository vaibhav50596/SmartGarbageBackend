package com.SmartGarbage.dao;

import com.SmartGarbage.model.GarbageModel;

import java.util.List;

public interface SmartGarbageDao {
    public List<GarbageModel> getGarbage();
    public void postGarbage(GarbageModel model);
}
