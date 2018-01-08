package com.FineDiary.json.ObjectList;

import com.FineDiary.json.JsonBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectListJsonBuilder implements JsonBuilder {
    private ObjectListEntityList list = new ObjectListEntityList();

    @Override
    public void addInfo(Object o) { list.getAccountObjects().add(o); }

    @Override
    public String createJson() throws JsonProcessingException {
        String serialized = new ObjectMapper().writeValueAsString(list);
        return serialized;
    }
}
