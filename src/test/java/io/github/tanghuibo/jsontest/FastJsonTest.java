package io.github.tanghuibo.jsontest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexerBase;
import io.github.tanghuibo.jsontest.utils.JsonBeanUtils;
import org.junit.Test;

/**
 * FastJsonTest
 *
 * @author tanghuibo
 * @date 2021/10/31 23:53
 */
public class FastJsonTest {

    @Test
    public void test() {
        JSON.parseObject(JsonBeanUtils.buildJsonString(62), JsonBeanUtils.buildTestClass("Json", 62));
        JSON.parseObject(JsonBeanUtils.buildJsonString(63), JsonBeanUtils.buildTestClass("Json", 63));
    }

    @Test
    public void test2() {
        scanFieldStringTest(62);
        scanFieldStringTest(62);
        scanFieldStringTest(63);
        scanFieldStringTest(63);


        scanFieldStringTest(62);
        scanFieldStringTest(62);
        scanFieldStringTest(63);
        scanFieldStringTest(63);

    }

    public void scanFieldStringTest(int count) {
        String json = JsonBeanUtils.buildJsonString(count);
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            DefaultJSONParser defaultJSONParser = new DefaultJSONParser(json);
            JSONLexerBase jsonLexerBase = ((JSONLexerBase)defaultJSONParser.lexer);
            for (int j = 0; j < count; j++) {
                jsonLexerBase.scanFieldString(("\"testFiled"+ j + "\":").toCharArray());
            }
        }
        System.out.println(count + ":" + (System.currentTimeMillis() - t1));
    }
}
