package io.github.tanghuibo.jsontest.utils;

import java.util.Locale;

/**
 * JsonTestBeanUtils
 *
 * @author tanghuibo
 * @date 2021/10/31 15:00
 */
public class JsonBeanUtils {


    private static final String PACKAGE_NAME = "io.github.tanghuibo.test";

    private static final String FIELD_NAME_PREFIX = "testFiled";

    public static Class buildTestClass(String name, int filedCount) {
        AsmBeanUtils asmBeanUtils = new AsmBeanUtils(PACKAGE_NAME + "." + name + filedCount);
        for (int i = 0; i < filedCount; i++) {
            asmBeanUtils.addField(buildFiledName(i), "java.lang.String");
        }
        return asmBeanUtils.buildClass();
    }

    private static String buildFiledName(int i) {
        return FIELD_NAME_PREFIX + i;
    }

    public static Object buildFullDataObject(String name, int filedCount) {
        return buildFullDataObject(buildTestClass(name, filedCount), filedCount);
    }

    private static Object buildFullDataObject(Class clazz, int filedCount) {
        try {
            Object o = clazz.newInstance();
            for (int i = 0; i < filedCount; i++) {
                clazz.getMethod(buildSetMethodName(i), String.class).invoke(o, buildFiledName(i));
            }
            return o;
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
    }

    private static String buildSetMethodName(int i) {
        return "set" + FIELD_NAME_PREFIX.substring(0, 1).toUpperCase(Locale.ROOT) + FIELD_NAME_PREFIX.substring(1) + i;
    }

}
