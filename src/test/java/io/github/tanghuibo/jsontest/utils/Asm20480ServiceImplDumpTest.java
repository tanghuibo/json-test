package io.github.tanghuibo.jsontest.utils;

import io.github.tanghuibo.jsontest.service.Asm20480Service;
import org.junit.Test;

public class Asm20480ServiceImplDumpTest {

    @Test
    public void testDump() {
        int count = 3000;
        while (true) {
            byte[] bytes = Asm20480ServiceImplDump.dump(count);
            System.out.println(count + ":" + bytes.length);
            if(bytes.length > 88480) {
                break;
            }
            count++;
        }
    }

    @Test
    public void testRun() throws InstantiationException, IllegalAccessException {
        for (int i = 0; i < 15; i++) {
            System.out.println("count:" + i);
            runTest(Asm20480ServiceImplDump.buildClass(i * 1000));

        }
    }

    public void runTest(Class<Asm20480Service>  asm20480ServiceClass) throws InstantiationException, IllegalAccessException {
        Asm20480Service asm20480Service = asm20480ServiceClass.newInstance();

        for (int i = 0; i < 100000; i++) {
            asm20480Service.run();
        }

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            asm20480Service.run();
        }
        System.out.println(System.currentTimeMillis() -  t1);
    }
}