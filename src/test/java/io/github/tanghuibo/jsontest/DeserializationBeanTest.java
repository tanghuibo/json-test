package io.github.tanghuibo.jsontest;

import com.alibaba.fastjson.JSON;
import io.github.tanghuibo.jsontest.adapter.JsonAdapter;
import io.github.tanghuibo.jsontest.adapter.impl.FastJsonAdapterImpl;
import io.github.tanghuibo.jsontest.adapter.impl.GsonAdapterImpl;
import io.github.tanghuibo.jsontest.adapter.impl.JacksonAdapterImpl;
import io.github.tanghuibo.jsontest.utils.JsonBeanUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * SerializeBeanTest
 *
 * @author tanghuibo
 * @date 2021/10/31 15:09
 */
public class DeserializationBeanTest {

    Logger log = LoggerFactory.getLogger(DeserializationBeanTest.class);

    @Test
    public void fastjsonTest() {
        log.info("result {}", JSON.toJSONString(performanceTest(new FastJsonAdapterImpl())));
    }

    @Test
    public void jacksonTest() {
        log.info("result {}", JSON.toJSONString(performanceTest(new JacksonAdapterImpl())));
    }

    @Test
    public void gsonTest() {
        log.info("result {}", JSON.toJSONString(performanceTest(new GsonAdapterImpl())));
    }

    @Test
    public void fastjsonOptimizeTest() {
        //字段排序后可以提升fastjson序列化性能
        log.info("result {}", JSON.toJSONString(performanceTestWithSort(new FastJsonAdapterImpl())));
    }

    public static Map<String, Long> performanceTest(JsonAdapter jsonAdapter) {
        Map<String, Long> map = new HashMap<>();

        for (int i = 1; i < 100; i++) {
            performanceTest(jsonAdapter, map, i);
        }
        return map;
    }

    private static void performanceTest(JsonAdapter jsonAdapter, Map<String, Long> map, int i) {
        String jsonString = JsonBeanUtils.buildJsonString(i);
        Class clazz = JsonBeanUtils.buildTestClass("de" + jsonAdapter.getTag(), i);
        long start = System.currentTimeMillis();
        jsonAdapter.toData(jsonString, clazz);
        map.put("init_" + i, System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            jsonAdapter.toData(jsonString, clazz);
        }
        map.put("run_" + i, System.currentTimeMillis() - start);
    }


    public static Map<String, Long> performanceTestWithSort(JsonAdapter jsonAdapter) {
        Map<String, Long> map = new HashMap<>();
        for (int i = 1; i < 100; i++) {
            performanceTestWithSort(jsonAdapter, map, i);
        }
        return map;
    }


    private static void performanceTestWithSort(JsonAdapter jsonAdapter, Map<String, Long> map, int i) {
        String jsonString = JsonBeanUtils.buildJsonString(i);
        Class clazz = JsonBeanUtils.buildTestClass("de" + jsonAdapter.getTag(), i);
        long start = System.currentTimeMillis();
        //重新排序
        jsonString = jsonAdapter.toJSONString(jsonAdapter.toData(jsonString, clazz));
        map.put("init_" + i, System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            jsonAdapter.toData(jsonString, clazz);
        }
        map.put("run_" + i, System.currentTimeMillis() - start);
    }
}
