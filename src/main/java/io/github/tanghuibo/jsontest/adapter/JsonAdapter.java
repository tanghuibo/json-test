package io.github.tanghuibo.jsontest.adapter;

/**
 * JsonTestAdapter
 *
 * @author tanghuibo
 * @date 2021/10/20 19:50
 */
public interface JsonAdapter {

    String toJSONString(Object data);

    <T> T toData(String json, Class<T> tClass);

    Object toMap(String json);

    String getTag();
}
