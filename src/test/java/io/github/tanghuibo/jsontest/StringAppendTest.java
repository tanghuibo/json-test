package io.github.tanghuibo.jsontest;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.util.BufferRecyclers;
import org.junit.Test;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * StringAppendTest
 *
 * @author tanghuibo
 * @date 2021/11/1 10:38
 */
public class StringAppendTest {

    private final int RUN_COUNT = 100000;
    private final int WORD_COUNT = 99;

    @Test
    public void fastjsonTest() {
        //896
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < RUN_COUNT; i++) {
            SerializeWriter out = new SerializeWriter();
            for (int j = 0; j < WORD_COUNT; j++) {
                out.write("\"filedTest");
                out.write(j);
                out.write("\":\"filedTest");
                out.write(j);
                out.write("\",");
            }
            out.toString();
        }
        System.out.println("fastjson:" + (System.currentTimeMillis() -  t1));
    }

    @Test
    public void gsonTest() {
        //1763
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < RUN_COUNT; i++) {
            StringWriter out = new StringWriter();
            for (int j = 0; j < WORD_COUNT; j++) {
                out.append("\"filedTest");
                out.append(j + "");
                out.append("\":\"filedTest");
                out.append(j + "");
                out.append("\",");
            }
            out.toString();
        }
        System.out.println("gson:" + (System.currentTimeMillis() -  t1));
    }

    @Test
    public void jacksonTest() {
        //746
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < RUN_COUNT; i++) {
            SegmentedStringWriter out = new SegmentedStringWriter(BufferRecyclers.getBufferRecycler());
            for (int j = 0; j < WORD_COUNT; j++) {
                out.write("\"filedTest");
                out.write(j);
                out.write("\":\"filedTest");
                out.write(j);
                out.write("\",");
            }
            out.getAndClear();
        }
        System.out.println("jackson:" + (System.currentTimeMillis() -  t1));
    }


    @Test
    public void stringBuilder() {
        //1002
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < RUN_COUNT; i++) {
            StringBuilder out = new StringBuilder(3000);
            for (int j = 0; j < WORD_COUNT; j++) {
                out.append("\"filedTest");
                out.append(j);
                out.append("\":\"filedTest");
                out.append(j);
                out.append("\",");
            }
            out.toString();
        }
        System.out.println("string build:" + (System.currentTimeMillis() -  t1));
    }

    @Test
    public void stringTest() {
        //1002
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < RUN_COUNT; i++) {
            String str = "";
            for (int j = 0; j < WORD_COUNT; j++) {
                str = str + "\"filedTest" + j + "\":\"filedTest" + j + "\",";

            }
        }
        System.out.println("string:" + (System.currentTimeMillis() -  t1));
    }

    @Test
    public void stringBufferTest() {
        //2199
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < RUN_COUNT; i++) {
            StringBuffer out = new StringBuffer(3000);
            for (int j = 0; j < WORD_COUNT; j++) {
                out.append("\"filedTest");
                out.append(j);
                out.append("\":\"filedTest");
                out.append(j);
                out.append("\",");
            }
            out.toString();
        }
        System.out.println("string buffer:" + (System.currentTimeMillis() -  t1));
    }

    @Test
    public void mapTest() {
        Map<String, Object> map = buildMap();
        long t1 = System.currentTimeMillis();

        for (int i = 0; i < RUN_COUNT; i++) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
        }
        System.out.println("map read:" + (System.currentTimeMillis() -  t1));
    }

    private Map<String, Object> buildMap() {
        Map<String, Object> map = new HashMap<>(WORD_COUNT);
        for (int i = 0; i < WORD_COUNT; i++) {
            map.put("filedTest" + i, "filedTest" + i);
        }
        return map;
    }
}
