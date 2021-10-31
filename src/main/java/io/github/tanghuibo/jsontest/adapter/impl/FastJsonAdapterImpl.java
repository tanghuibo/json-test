package io.github.tanghuibo.jsontest.adapter.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import io.github.tanghuibo.jsontest.adapter.JsonAdapter;

import java.util.Map;

/**
 * JsonAdapterImpl
 *
 * @author tanghuibo
 * @date 2021/10/20 19:51
 */
public class FastJsonAdapterImpl implements JsonAdapter {
    @Override
    public String toJSONString(Object data) {
        return JSON.toJSONString(data, SerializerFeature.WriteClassName);
    }

    @Override
    public <T> T toData(String json, Class<T> tClass) {
        return JSON.parseObject(json, tClass, Feature.SupportAutoType);

    }

    @Override
    public Object toMap(String json) {
        return JSON.parseObject(json, Map.class);
    }

    @Override
    public String getTag() {
        return "fastjson";
    }
}
