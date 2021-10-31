package io.github.tanghuibo.jsontest.utils;


import org.junit.Test;

import java.io.File;

public class WriteUtilsTest {

    @Test
    public void testWriteToFile() {
        WriteUtils.writeToFile("test" + File.separator + "test.txt", "test success");
    }
}