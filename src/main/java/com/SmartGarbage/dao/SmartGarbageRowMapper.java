package com.SmartGarbage.dao;
import com.SmartGarbage.model.GarbageModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SmartGarbageRowMapper implements RowMapper<GarbageModel> {

    @Override
    public GarbageModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        GarbageModel garbageModel = new GarbageModel();
        garbageModel.setHouseID(rs.getInt("HouseId"));
        garbageModel.setHouseAddress(rs.getString("HouseAddress"));
        garbageModel.setZipCode(rs.getString("ZipCode"));
        garbageModel.setRecycledQuantity(rs.getInt("RecycledQuantity"));
        garbageModel.setLandfillQuantity(rs.getInt("LandfillQuantity"));
        garbageModel.setDate(rs.getString("DumpDate"));
        return garbageModel;
    }
}
