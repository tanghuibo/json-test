package io.github.tanghuibo.jsontest.utils;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class AsmBeanUtilsTest{

    @Test
    public void testToByteArray() throws IOException {
        AsmBeanUtils asmBeanUtils = new AsmBeanUtils("io.github.tanghuibo.test.ThbTest");

        for (int i = 0; i < 99; i++) {
            asmBeanUtils.addField("testFiled" + i, "java.lang.String");
        }
        FileUtils.writeByteArrayToFile(new File("D://test.class"), asmBeanUtils.toByteArray());

    }
}