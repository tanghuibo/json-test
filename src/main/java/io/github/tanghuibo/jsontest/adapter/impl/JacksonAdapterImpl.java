package io.github.tanghuibo.jsontest.adapter.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import io.github.tanghuibo.jsontest.adapter.JsonAdapter;

import java.util.Map;

/**
 * JacksonAdapterImpl
 *
 * @author tanghuibo
 * @date 2021/10/20 19:53
 */
public class JacksonAdapterImpl implements JsonAdapter {
    ObjectMapper mapper = new JsonMapper();

    @Override
    public String toJSONString(Object data) {
        try {
            return mapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> T toData(String json, Class<T> tClass) {
        try {
            return mapper.readValue(json, tClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object toMap(String json) {
        try {
            return mapper.readValue(json, Map.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getTag() {
        return "jackson";
    }
}
