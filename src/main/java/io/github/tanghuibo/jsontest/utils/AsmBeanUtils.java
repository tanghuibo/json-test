package io.github.tanghuibo.jsontest.utils;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;

/**
 * AsmBeanUtils
 *
 * @author tanghuibo
 * @date 2021/10/27 15:58
 */
public class AsmBeanUtils {

    private final String className;

    private final ClassWriter classWriter;

    static Method method = Arrays.stream(ClassLoader.class.getDeclaredMethods())
            .filter(item -> "defineClass".equals(item.getName()) && item.getParameterTypes().length == 4)
            .peek(m -> m.setAccessible(true))
            .findFirst()
            .orElse(null);

    public AsmBeanUtils(String className) {
        this.className = className;
        this.classWriter = buildInitMethod();
    }

    private ClassWriter buildInitMethod() {
        ClassWriter classWriter = new ClassWriter(0);
        classWriter.visit(Opcodes.V1_8,
                Opcodes.ACC_PUBLIC,
                convertPath(className),
                null,
                "java/lang/Object",
                new String[]{});

        MethodVisitor initMv = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        initMv.visitCode();
        initMv.visitVarInsn(Opcodes.ALOAD, 0);
        initMv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        initMv.visitInsn(Opcodes.RETURN);
        initMv.visitMaxs(1, 1);
        initMv.visitEnd();
        return classWriter;
    }

    public AsmBeanUtils addField(String field, String type) {
        buildField(field, type);
        buildGetMethod(field, type);
        buildSetMethod(field, type);
        return this;
    }

    private void buildSetMethod(String field, String type) {
        MethodVisitor setMv = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "set" + firstUpperCase(field), "(" + convertLName(type) + ")V", null, null);
        setMv.visitCode();
        setMv.visitVarInsn(Opcodes.ALOAD, 0);
        setMv.visitVarInsn(Opcodes.ALOAD, 1);
        setMv.visitFieldInsn(Opcodes.PUTFIELD, convertPath(className), field, convertLName(type));
        setMv.visitInsn(Opcodes.RETURN);
        setMv.visitMaxs(2, 2);
        setMv.visitEnd();
    }

    private void buildGetMethod(String field, String type) {
        MethodVisitor getMv = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "get" + firstUpperCase(field), "()" + convertLName(type), null, null);
        getMv.visitCode();
        getMv.visitVarInsn(Opcodes.ALOAD, 0);
        getMv.visitFieldInsn(Opcodes.GETFIELD, convertPath(className), field, convertLName(type));
        getMv.visitInsn(Opcodes.ARETURN);
        getMv.visitMaxs(1, 1);
        getMv.visitEnd();
    }

    private void buildField(String field, String type) {
        classWriter.visitField(Opcodes.ACC_PRIVATE, field, convertLName(type), null, null).visitEnd();
    }

    public byte[] toByteArray() {
        classWriter.visitEnd();
        return classWriter.toByteArray();
    }

    public Class buildClass() {

        byte[] bytes = toByteArray();
        try {
            return (Class)method.invoke(AsmBeanUtils.class.getClassLoader(), className, bytes, 0, bytes.length);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String firstUpperCase(String field) {
        return field.substring(0, 1).toUpperCase(Locale.ROOT) + field.substring(1);
    }

    private String convertPath(String name) {
        return name.replace(".", "/");
    }

    public String convertLName(String name) {
        return "L"+ convertPath(name) +";";
    }

}

