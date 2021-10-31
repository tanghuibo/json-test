package io.github.tanghuibo.jsontest.adapter.impl;

import com.google.gson.Gson;
import io.github.tanghuibo.jsontest.adapter.JsonAdapter;

import java.util.Map;

/**
 * GsonAdapterImpl
 *
 * @author tanghuibo
 * @date 2021/10/20 19:54
 */
public class GsonAdapterImpl implements JsonAdapter {
    Gson gson = new Gson();
    @Override
    public String toJSONString(Object data) {
        return gson.toJson(data);
    }

    @Override
    public <T> T toData(String json, Class<T> tClass) {
        return gson.fromJson(json, tClass);
    }

    @Override
    public Object toMap(String json) {
        return gson.fromJson(json, Map.class);
    }

    @Override
    public String getTag() {
        return "gson";
    }
}
