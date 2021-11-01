package io.github.tanghuibo.jsontest;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.util.BufferRecyclers;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import org.junit.Test;

import java.io.IOException;
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

    private int runCount = 100000;
    private int wordCount = 99;

    @Test
    public void fastjsonTest() {
        //896
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < runCount; i++) {
            SerializeWriter out = new SerializeWriter();
            for (int j = 0; j < wordCount; j++) {
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
    public void gsonTest() throws IOException {
        //1763
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < runCount; i++) {
            StringWriter stringWriter = new StringWriter();
            JsonWriter out = new JsonWriter(Streams.writerForAppendable(stringWriter));
            out.beginObject();
            for (int j = 0; j < wordCount; j++) {
                out.name("filedTest" + j);
                out.value("filedTest" + j);
            }
            out.endObject();
            stringWriter.toString();
        }
        System.out.println("gson:" + (System.currentTimeMillis() -  t1));
    }

    @Test
    public void jacksonTest() {
        //746
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < runCount; i++) {
            SegmentedStringWriter out = new SegmentedStringWriter(BufferRecyclers.getBufferRecycler());
            for (int j = 0; j < wordCount; j++) {
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
        for (int i = 0; i < runCount; i++) {
            StringBuilder out = new StringBuilder(3000);
            for (int j = 0; j < wordCount; j++) {
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
        for (int i = 0; i < runCount; i++) {
            String str = "";
            for (int j = 0; j < wordCount; j++) {
                str = str + "\"filedTest" + j + "\":\"filedTest" + j + "\",";

            }
        }
        System.out.println("string:" + (System.currentTimeMillis() -  t1));
    }

    @Test
    public void stringBufferTest() {
        //2199
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < runCount; i++) {
            StringBuffer out = new StringBuffer(3000);
            for (int j = 0; j < wordCount; j++) {
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

        for (int i = 0; i < runCount; i++) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
        }
        System.out.println("map read:" + (System.currentTimeMillis() -  t1));
    }

    private Map<String, Object> buildMap() {
        Map<String, Object> map = new HashMap<>(wordCount);
        for (int i = 0; i < wordCount; i++) {
            map.put("filedTest" + i, "filedTest" + i);
        }
        return map;
    }
}
