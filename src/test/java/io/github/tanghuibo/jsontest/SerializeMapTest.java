package io.github.tanghuibo.jsontest;

import com.alibaba.fastjson.JSON;
import io.github.tanghuibo.jsontest.adapter.JsonAdapter;
import io.github.tanghuibo.jsontest.adapter.impl.FastJsonAdapterImpl;
import io.github.tanghuibo.jsontest.adapter.impl.GsonAdapterImpl;
import io.github.tanghuibo.jsontest.adapter.impl.JacksonAdapterImpl;
import io.github.tanghuibo.jsontest.utils.GcUtils;
import io.github.tanghuibo.jsontest.utils.JsonBeanUtils;
import io.github.tanghuibo.jsontest.utils.WriteUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * SerializeMapTest
 *
 * @author tanghuibo
 * @date 2021/10/31 15:09
 */
public class SerializeMapTest {

    Logger log = LoggerFactory.getLogger(SerializeMapTest.class);

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

    public static Map<String, Long> performanceTest(JsonAdapter jsonAdapter) {
        Map<String, Long> map = new HashMap<>();
        for (int i = 1; i < 100; i++) {
            performanceTest(jsonAdapter, map, i, false);
        }
        for (int i = 1; i < 100; i++) {
            performanceTest(jsonAdapter, map, i, true);
        }
        WriteUtils.writeToFile("serialize/map/" + jsonAdapter.getTag() + ".json", JSON.toJSONString(map));
        return map;
    }

    private static void performanceTest(JsonAdapter jsonAdapter, Map<String, Long> map, int i, boolean needGc) {
        if(needGc) {
            GcUtils.gc();
        }
        Map<String, String> data = JsonBeanUtils.buildFullDataMap(i);
        long start = System.currentTimeMillis();
        jsonAdapter.toJSONString(data);
        map.put("init_" + i, System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            jsonAdapter.toJSONString(data);
        }
        map.put("run_" + i, System.currentTimeMillis() - start);
    }
}
