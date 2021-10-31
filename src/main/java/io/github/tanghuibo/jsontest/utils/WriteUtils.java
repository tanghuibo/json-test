package io.github.tanghuibo.jsontest.utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * WriteUtils
 *
 * @author tanghuibo
 * @date 2021/10/31 16:30
 */
public class WriteUtils {

    private static final String FILE_PATH = "D:\\study_workplace\\ppt-workspace\\data";

    public static void writeToFile(String path, String data) {
        try {
            FileUtils.write(new File(FILE_PATH + File.separator + path), data, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
