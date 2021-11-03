package io.github.tanghuibo.jsontest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.TypeUtils;
import io.github.tanghuibo.jsontest.fastjson.FastjsonASMDeserializerJson62;
import io.github.tanghuibo.jsontest.fastjson.FastjsonASMDeserializerJson63;
import io.github.tanghuibo.jsontest.fastjson.Json62;
import io.github.tanghuibo.jsontest.fastjson.Json63;
import io.github.tanghuibo.jsontest.utils.JsonBeanUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.awt.List;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * FastJsonTest
 *
 * @author tanghuibo
 * @date 2021/10/31 23:53
 */
public class FastJsonTest {

    @Test
    public void test1() {
        JSON.parseObject(JsonBeanUtils.buildJsonString(62), JsonBeanUtils.buildTestClass("Json", 62));
        JSON.parseObject(JsonBeanUtils.buildJsonString(63), JsonBeanUtils.buildTestClass("Json", 63));
    }

    @Test
    public void test2() {
        scanFieldStringTest(62);
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

    @Test
    public void test3() throws InterruptedException, InvocationTargetException, IllegalAccessException, IOException, InstantiationException, NoSuchMethodException {
        Method method = Arrays.stream(ClassLoader.class.getDeclaredMethods())
                .filter(item -> "defineClass".equals(item.getName()) && item.getParameterTypes().length == 4)
                .peek(m -> m.setAccessible(true))
                .findFirst()
                .orElse(null);

        FastjsonASMDeserializerJson62 fastjsonASMDeserializerJson62 = new FastjsonASMDeserializerJson62(
                ParserConfig.getGlobalInstance(), JavaBeanInfo.build(Json62.class,
                Json62.class,
                ParserConfig.getGlobalInstance().propertyNamingStrategy,
                false,
                TypeUtils.compatibleWithJavaBean,
                false));

        FastjsonASMDeserializerJson63 fastjsonASMDeserializerJson63 = new FastjsonASMDeserializerJson63(
                ParserConfig.getGlobalInstance(), JavaBeanInfo.build(Json63.class,
                Json63.class,
                ParserConfig.getGlobalInstance().propertyNamingStrategy,
                false,
                TypeUtils.compatibleWithJavaBean,
                false));

        Thread.sleep(5000);
        int runCount = 1000000;

        {
            String json62 = JsonBeanUtils.buildJsonString(62);
            for (int i = 0; i < 10000; i++) {
                DefaultJSONParser defaultJSONParser = new DefaultJSONParser(json62);
                fastjsonASMDeserializerJson62.deserialze(defaultJSONParser, Json62.class, null);
            }
            long t1 = System.currentTimeMillis();
            for (int i = 0; i < runCount; i++) {
                DefaultJSONParser defaultJSONParser = new DefaultJSONParser(json62);
                fastjsonASMDeserializerJson62.deserialze(defaultJSONParser, Json62.class, null);
            }
            System.out.println("rebuild class 62:" + (System.currentTimeMillis() - t1));
        }

        {
            byte[] bytes = FileUtils.readFileToByteArray(new File("src/main/mix/FastjsonASMDeserializer_1_Json62.class"));
            Class clazz = (Class) method.invoke(FastJsonTest.class.getClassLoader(),"com.alibaba.fastjson.parser.deserializer.FastjsonASMDeserializer_1_Json62", bytes, 0, bytes.length);
            Constructor constructor = clazz.getConstructor(ParserConfig.class, JavaBeanInfo.class);
            JavaBeanDeserializer deserializerJson62 = (JavaBeanDeserializer)constructor.newInstance(
                    ParserConfig.getGlobalInstance(),
                    JavaBeanInfo.build(
                            io.github.tanghuibo.test.Json62 .class,
                            io.github.tanghuibo.test.Json62.class,
                            ParserConfig.getGlobalInstance().propertyNamingStrategy,
                            false,
                            TypeUtils.compatibleWithJavaBean,
                            false));

            String json62 = JsonBeanUtils.buildJsonString(62);
            for (int i = 0; i < 10000; i++) {
                DefaultJSONParser defaultJSONParser = new DefaultJSONParser(json62);
                deserializerJson62.deserialze(defaultJSONParser, io.github.tanghuibo.test.Json62.class, null);

            }
            long t1 = System.currentTimeMillis();
            for (int i = 0; i < runCount; i++) {
                DefaultJSONParser defaultJSONParser = new DefaultJSONParser(json62);
                deserializerJson62.deserialze(defaultJSONParser, Json62.class, null);
            }
            System.out.println("original class 62:" + (System.currentTimeMillis() - t1));
        }

        {
            String json63 = JsonBeanUtils.buildJsonString(63);
            for (int i = 0; i < 10000; i++) {
                DefaultJSONParser defaultJSONParser = new DefaultJSONParser(json63);
                fastjsonASMDeserializerJson63.deserialze(defaultJSONParser, Json63.class, null);
            }
            long t1 = System.currentTimeMillis();
            for (int i = 0; i < runCount; i++) {
                DefaultJSONParser defaultJSONParser = new DefaultJSONParser(json63);
                fastjsonASMDeserializerJson63.deserialze(defaultJSONParser, Json63.class, null);
            }
            System.out.println("rebuild class 63:" + (System.currentTimeMillis() - t1));
        }

        {
            byte[] bytes = FileUtils.readFileToByteArray(new File("src/main/mix/FastjsonASMDeserializer_2_Json63.class"));
            Class clazz = (Class) method.invoke(FastJsonTest.class.getClassLoader(),"com.alibaba.fastjson.parser.deserializer.FastjsonASMDeserializer_2_Json63", bytes, 0, bytes.length);
            Constructor constructor = clazz.getConstructor(ParserConfig.class, JavaBeanInfo.class);
            JavaBeanDeserializer deserializerJson63 = (JavaBeanDeserializer)constructor.newInstance(
                    ParserConfig.getGlobalInstance(),
                    JavaBeanInfo.build(
                            io.github.tanghuibo.test.Json63 .class,
                            io.github.tanghuibo.test.Json63.class,
                    ParserConfig.getGlobalInstance().propertyNamingStrategy,
                    false,
                    TypeUtils.compatibleWithJavaBean,
                    false));

            String json63 = JsonBeanUtils.buildJsonString(63);
            for (int i = 0; i < 10000; i++) {
                DefaultJSONParser defaultJSONParser = new DefaultJSONParser(json63);
                deserializerJson63.deserialze(defaultJSONParser, io.github.tanghuibo.test.Json63.class, null);

            }
            long t1 = System.currentTimeMillis();
            for (int i = 0; i < runCount; i++) {
                DefaultJSONParser defaultJSONParser = new DefaultJSONParser(json63);
                deserializerJson63.deserialze(defaultJSONParser, Json63.class, null);
            }
            System.out.println("original class 63:" + (System.currentTimeMillis() - t1));
        }
    }

    @Test
    public void test4() {
        String json62 = JsonBeanUtils.buildJsonString(62);
        JSON.parseObject(json62, Json62.class);

        String json63 = JsonBeanUtils.buildJsonString(63);
        JSON.parseObject(json63, Json63.class);


    }

    @Test
    public void featurePrint() {
        java.util.List<Map<String, Object>> list = new ArrayList<>();
        for (Feature value : Feature.values()) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", value.name());
            map.put("mask", value.mask);
            list.add(map);
        }
        System.out.println(JSON.toJSONString(list));
    }

    @Test
    public void serializerFeaturePrint() {
        java.util.List<Map<String, Object>> list = new ArrayList<>();
        for (SerializerFeature value : SerializerFeature.values()) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", value.name());
            map.put("mask", value.mask);
            list.add(map);
        }
        System.out.println(JSON.toJSONString(list));
    }

    @Test
    public void test() {
        System.out.println(JSON.toJSONString(buildMap()));
    }

    private Map<String, Object> buildMap() {
        Map<String, Object> map = new HashMap<String, Object>(99) {
            @Override
            public Object get(Object key) {
                return super.get(key);
            }

            @Override
            public Set<Entry<String, Object>> entrySet() {
                return super.entrySet();
            }
        };
        for (int i = 0; i < 99; i++) {
            map.put("filedTest" + i, "filedTest" + i);
        }
        return map;
    }

    @Test
    public void awtListTest() {
        List list = new List();
        list.add("test1");
        list.add("test2");
        JSON.toJSONString(list, SerializerFeature.IgnoreErrorGetter);
    }

    @Test
    public void testJsonPath() throws IOException {
        String idList = System.getenv("testIdList");
        for (String id : idList.split(",")) {
            testJsonPath(id);
        }
    }

    private void testJsonPath(String id) throws IOException {
        URL url = new URL(System.getenv("baseUrl") + "?id=" + id);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Cookie", System.getenv("cookie"));
        conn.connect();
        String json = IOUtils.toString(conn.getInputStream(), StandardCharsets.UTF_8);

        String m3u81080pUrl = (String) JSONPath.extract(json, "$.data.format[video_bitrate='1080P'].format_info_file.file_info[file_type='M3U8'].file_url[0]");
        String assSubtitleUrl = (String) JSONPath.extract(json, "$.data.subtitle[language_type=1].source_filepath[0]");
        System.out.println("query url: " + url);
        System.out.println("m3u81080pUrl: " + m3u81080pUrl);
        System.out.println("assSubtitleUrl: " + assSubtitleUrl);
        System.out.println("======================");
    }


}
