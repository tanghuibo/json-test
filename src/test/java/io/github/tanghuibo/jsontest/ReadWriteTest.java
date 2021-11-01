package io.github.tanghuibo.jsontest;

import com.alibaba.fastjson.JSON;
import io.github.tanghuibo.jsontest.utils.JsonBeanUtils;
import io.github.tanghuibo.test.Json99;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * RedWriteTest
 *
 * @author tanghuibo
 * @date 2021/11/1 11:18
 */
public class ReadWriteTest {

    private static final int WORD_COUNT = 99;
    private final int RUN_COUNT = 100000;

    @Test
    public void readMethodTest() throws InvocationTargetException, IllegalAccessException {
        Method[] readMethods = Arrays.stream(Json99.class.getMethods()).filter(item -> item.getName().startsWith("getTestFiled")).toArray(Method[]::new);
        Json99 json99 = JSON.parseObject(JsonBeanUtils.buildJsonString(99), Json99.class);
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < RUN_COUNT; i++) {
            for (Method readMethod : readMethods) {
                readMethod.invoke(json99);
            }
        }
        System.out.println("read method:" + (System.currentTimeMillis() - t1));
    }

    @Test
    public void readFiled() throws IllegalAccessException {
        Field[] readFields = Arrays.stream(Json99.class.getDeclaredFields()).filter(item -> item.getName().startsWith("testFiled")).toArray(Field[]::new);
        for (Field readField : readFields) {
            readField.setAccessible(true);
        }
        Json99 json99 = JSON.parseObject(JsonBeanUtils.buildJsonString(99), Json99.class);
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < RUN_COUNT; i++) {
            for (Field readField : readFields) {
                readField.get(json99);
            }
        }
        System.out.println("read field:" + (System.currentTimeMillis() - t1));
    }


    @Test
    public void writeMethodTest() throws InvocationTargetException, IllegalAccessException {
        Method[] writeMethods = Arrays.stream(Json99.class.getMethods()).filter(item -> item.getName().startsWith("setTestFiled")).toArray(Method[]::new);
        Json99 json99 = new Json99();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < RUN_COUNT; i++) {
            for (Method writeMethod : writeMethods) {
                writeMethod.invoke(json99, "filedTest");
            }
        }
        System.out.println("write method:" + (System.currentTimeMillis() - t1));
    }

    @Test
    public void writeFiled() throws IllegalAccessException {
        Field[] readFields = Arrays.stream(Json99.class.getDeclaredFields()).filter(item -> item.getName().startsWith("testFiled")).toArray(Field[]::new);
        for (Field readField : readFields) {
            readField.setAccessible(true);
        }
        Json99 json99 = JSON.parseObject(JsonBeanUtils.buildJsonString(99), Json99.class);
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < RUN_COUNT; i++) {
            for (Field readField : readFields) {
                readField.set(json99, "filedTest");
            }
        }
        System.out.println("write field:" + (System.currentTimeMillis() - t1));
    }

    @Test
    public void readMapTest() {
        long t1 = System.currentTimeMillis();
        Map<String, Object> map = buildMap();
        for (int i = 0; i < RUN_COUNT; i++) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
        }
        System.out.println("read map:" + (System.currentTimeMillis() - t1));
    }

    @Test
    public void writeMap() {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < RUN_COUNT; i++) {
            Map<String, Object> map = new HashMap<>(WORD_COUNT);
            for (int j = 0; j < WORD_COUNT; j++) {
                map.put("filedTest" + j, "filedTest" + j);
            }
        }
        System.out.println("write map:" + (System.currentTimeMillis() - t1));
    }

    private Map<String, Object> buildMap() {
        Map<String, Object> map = new HashMap<>(WORD_COUNT);
        for (int i = 0; i < WORD_COUNT; i++) {
            map.put("filedTest" + i, "filedTest" + i);
        }
        return map;
    }

    @Test
    public void writeTest() {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < RUN_COUNT; i++) {
            Json99 json99 = new Json99();
            json99.setTestFiled0("filedTest0");
            json99.setTestFiled1("filedTest1");
            json99.setTestFiled2("filedTest2");
            json99.setTestFiled3("filedTest3");
            json99.setTestFiled4("filedTest4");
            json99.setTestFiled5("filedTest5");
            json99.setTestFiled6("filedTest6");
            json99.setTestFiled7("filedTest7");
            json99.setTestFiled8("filedTest8");
            json99.setTestFiled9("filedTest9");
            json99.setTestFiled10("filedTest10");
            json99.setTestFiled11("filedTest11");
            json99.setTestFiled12("filedTest12");
            json99.setTestFiled13("filedTest13");
            json99.setTestFiled14("filedTest14");
            json99.setTestFiled15("filedTest15");
            json99.setTestFiled16("filedTest16");
            json99.setTestFiled17("filedTest17");
            json99.setTestFiled18("filedTest18");
            json99.setTestFiled19("filedTest19");
            json99.setTestFiled20("filedTest20");
            json99.setTestFiled21("filedTest21");
            json99.setTestFiled22("filedTest22");
            json99.setTestFiled23("filedTest23");
            json99.setTestFiled24("filedTest24");
            json99.setTestFiled25("filedTest25");
            json99.setTestFiled26("filedTest26");
            json99.setTestFiled27("filedTest27");
            json99.setTestFiled28("filedTest28");
            json99.setTestFiled29("filedTest29");
            json99.setTestFiled30("filedTest30");
            json99.setTestFiled31("filedTest31");
            json99.setTestFiled32("filedTest32");
            json99.setTestFiled33("filedTest33");
            json99.setTestFiled34("filedTest34");
            json99.setTestFiled35("filedTest35");
            json99.setTestFiled36("filedTest36");
            json99.setTestFiled37("filedTest37");
            json99.setTestFiled38("filedTest38");
            json99.setTestFiled39("filedTest39");
            json99.setTestFiled40("filedTest40");
            json99.setTestFiled41("filedTest41");
            json99.setTestFiled42("filedTest42");
            json99.setTestFiled43("filedTest43");
            json99.setTestFiled44("filedTest44");
            json99.setTestFiled45("filedTest45");
            json99.setTestFiled46("filedTest46");
            json99.setTestFiled47("filedTest47");
            json99.setTestFiled48("filedTest48");
            json99.setTestFiled49("filedTest49");
            json99.setTestFiled50("filedTest50");
            json99.setTestFiled51("filedTest51");
            json99.setTestFiled52("filedTest52");
            json99.setTestFiled53("filedTest53");
            json99.setTestFiled54("filedTest54");
            json99.setTestFiled55("filedTest55");
            json99.setTestFiled56("filedTest56");
            json99.setTestFiled57("filedTest57");
            json99.setTestFiled58("filedTest58");
            json99.setTestFiled59("filedTest59");
            json99.setTestFiled60("filedTest60");
            json99.setTestFiled61("filedTest61");
            json99.setTestFiled62("filedTest62");
            json99.setTestFiled63("filedTest63");
            json99.setTestFiled64("filedTest64");
            json99.setTestFiled65("filedTest65");
            json99.setTestFiled66("filedTest66");
            json99.setTestFiled67("filedTest67");
            json99.setTestFiled68("filedTest68");
            json99.setTestFiled69("filedTest69");
            json99.setTestFiled70("filedTest70");
            json99.setTestFiled71("filedTest71");
            json99.setTestFiled72("filedTest72");
            json99.setTestFiled73("filedTest73");
            json99.setTestFiled74("filedTest74");
            json99.setTestFiled75("filedTest75");
            json99.setTestFiled76("filedTest76");
            json99.setTestFiled77("filedTest77");
            json99.setTestFiled78("filedTest78");
            json99.setTestFiled79("filedTest79");
            json99.setTestFiled80("filedTest80");
            json99.setTestFiled81("filedTest81");
            json99.setTestFiled82("filedTest82");
            json99.setTestFiled83("filedTest83");
            json99.setTestFiled84("filedTest84");
            json99.setTestFiled85("filedTest85");
            json99.setTestFiled86("filedTest86");
            json99.setTestFiled87("filedTest87");
            json99.setTestFiled88("filedTest88");
            json99.setTestFiled89("filedTest89");
            json99.setTestFiled90("filedTest90");
            json99.setTestFiled91("filedTest91");
            json99.setTestFiled92("filedTest92");
            json99.setTestFiled93("filedTest93");
            json99.setTestFiled94("filedTest94");
            json99.setTestFiled95("filedTest95");
            json99.setTestFiled96("filedTest96");
            json99.setTestFiled97("filedTest97");
            json99.setTestFiled98("filedTest98");
        }

        System.out.println("write:" + (System.currentTimeMillis() - t1));

    }

    @Test
    public void readTest() {
        Json99 json99 = JSON.parseObject(JsonBeanUtils.buildJsonString(99), Json99.class);
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < RUN_COUNT; i++) {
            json99.getTestFiled0();
            json99.getTestFiled1();
            json99.getTestFiled2();
            json99.getTestFiled3();
            json99.getTestFiled4();
            json99.getTestFiled5();
            json99.getTestFiled6();
            json99.getTestFiled7();
            json99.getTestFiled8();
            json99.getTestFiled9();
            json99.getTestFiled10();
            json99.getTestFiled11();
            json99.getTestFiled12();
            json99.getTestFiled13();
            json99.getTestFiled14();
            json99.getTestFiled15();
            json99.getTestFiled16();
            json99.getTestFiled17();
            json99.getTestFiled18();
            json99.getTestFiled19();
            json99.getTestFiled20();
            json99.getTestFiled21();
            json99.getTestFiled22();
            json99.getTestFiled23();
            json99.getTestFiled24();
            json99.getTestFiled25();
            json99.getTestFiled26();
            json99.getTestFiled27();
            json99.getTestFiled28();
            json99.getTestFiled29();
            json99.getTestFiled30();
            json99.getTestFiled31();
            json99.getTestFiled32();
            json99.getTestFiled33();
            json99.getTestFiled34();
            json99.getTestFiled35();
            json99.getTestFiled36();
            json99.getTestFiled37();
            json99.getTestFiled38();
            json99.getTestFiled39();
            json99.getTestFiled40();
            json99.getTestFiled41();
            json99.getTestFiled42();
            json99.getTestFiled43();
            json99.getTestFiled44();
            json99.getTestFiled45();
            json99.getTestFiled46();
            json99.getTestFiled47();
            json99.getTestFiled48();
            json99.getTestFiled49();
            json99.getTestFiled50();
            json99.getTestFiled51();
            json99.getTestFiled52();
            json99.getTestFiled53();
            json99.getTestFiled54();
            json99.getTestFiled55();
            json99.getTestFiled56();
            json99.getTestFiled57();
            json99.getTestFiled58();
            json99.getTestFiled59();
            json99.getTestFiled60();
            json99.getTestFiled61();
            json99.getTestFiled62();
            json99.getTestFiled63();
            json99.getTestFiled64();
            json99.getTestFiled65();
            json99.getTestFiled66();
            json99.getTestFiled67();
            json99.getTestFiled68();
            json99.getTestFiled69();
            json99.getTestFiled70();
            json99.getTestFiled71();
            json99.getTestFiled72();
            json99.getTestFiled73();
            json99.getTestFiled74();
            json99.getTestFiled75();
            json99.getTestFiled76();
            json99.getTestFiled77();
            json99.getTestFiled78();
            json99.getTestFiled79();
            json99.getTestFiled80();
            json99.getTestFiled81();
            json99.getTestFiled82();
            json99.getTestFiled83();
            json99.getTestFiled84();
            json99.getTestFiled85();
            json99.getTestFiled86();
            json99.getTestFiled87();
            json99.getTestFiled88();
            json99.getTestFiled89();
            json99.getTestFiled90();
            json99.getTestFiled91();
            json99.getTestFiled92();
            json99.getTestFiled93();
            json99.getTestFiled94();
            json99.getTestFiled95();
            json99.getTestFiled96();
            json99.getTestFiled97();
            json99.getTestFiled98();
        }
        System.out.println("read:" + (System.currentTimeMillis() - t1));
    }
}
