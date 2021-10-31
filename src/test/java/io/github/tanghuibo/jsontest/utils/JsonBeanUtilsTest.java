package io.github.tanghuibo.jsontest.utils;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonBeanUtilsTest {

    Logger log = LoggerFactory.getLogger(JsonBeanUtils.class);

    @Test
    public void testBuildFullDataObject() {
        Object thbTest = JsonBeanUtils.buildFullDataObject("thbTest", 10);
        log.info("className {}, data {}", thbTest.getClass().getName(), JSON.toJSONString(thbTest));
    }

    @Test
    public void testBuildFullDataMap() {
        log.info("map {}", JSON.toJSONString(JsonBeanUtils.buildFullDataMap(10)));
    }

    @Test
    public void testBuildJsonString() {
        log.info("json {}", JsonBeanUtils.buildJsonString(10));
    }
}