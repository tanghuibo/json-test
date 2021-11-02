package io.github.tanghuibo.jsontest.utils;

import io.github.tanghuibo.jsontest.service.Asm20480Service;
import org.objectweb.asm.*;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author tanghuibo
 */
public class Asm20480ServiceImplDump implements Opcodes {

    static Method method = Arrays.stream(ClassLoader.class.getDeclaredMethods())
            .filter(item -> "defineClass".equals(item.getName()) && item.getParameterTypes().length == 4)
            .peek(m -> m.setAccessible(true))
            .findFirst()
            .orElse(null);

    public static byte[] dump (long addCount) {

        ClassWriter cw = new ClassWriter(0);
        MethodVisitor mv;

        cw.visit(52, ACC_PUBLIC + ACC_SUPER, "io/github/tanghuibo/jsontest/service/impl/Asm20480ServiceImpl" + addCount, null, "java/lang/Object", new String[] { "io/github/tanghuibo/jsontest/service/Asm20480Service" });

        {
            mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
            mv.visitCode();
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            mv.visitInsn(RETURN);
            mv.visitMaxs(1, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
            mv.visitCode();
            mv.visitInsn(ICONST_1);
            mv.visitVarInsn(ISTORE, 1);
            for (int i = 0; i < addCount; i++) {
                mv.visitIincInsn(1, 1);
            }
            mv.visitInsn(RETURN);
            mv.visitMaxs(1, 2);
            mv.visitEnd();
        }

        {
            mv = cw.visitMethod(ACC_PUBLIC, "run2", "()V", null, null);
            mv.visitCode();
            mv.visitInsn(ICONST_1);
            mv.visitVarInsn(ISTORE, 1);
            for (int i = 0; i < addCount; i++) {
                mv.visitIincInsn(1, 1);
            }
            mv.visitInsn(RETURN);
            mv.visitMaxs(1, 2);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }

    public static Class<Asm20480Service> buildClass(int count) {
        try {
            byte[] bytes = dump(count);
            System.out.println("bytes length:" + bytes.length);
            return (Class<Asm20480Service>)method.invoke(Asm20480ServiceImplDump.class.getClassLoader(), "io.github.tanghuibo.jsontest.service.impl.Asm20480ServiceImpl" + count, bytes, 0, bytes.length);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
