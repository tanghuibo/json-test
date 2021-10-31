package io.github.tanghuibo.jsontest.utils;

/**
 * GcUtils
 *
 * @author tanghuibo
 * @date 2021/10/31 19:00
 */
public class GcUtils {
    public static void gc() {
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
