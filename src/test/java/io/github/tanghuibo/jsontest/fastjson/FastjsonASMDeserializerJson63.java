package io.github.tanghuibo.jsontest.fastjson;


import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.JavaBeanInfo;
import java.lang.reflect.Type;

public class FastjsonASMDeserializerJson63 extends JavaBeanDeserializer {
    public char[] testFiled9_asm_prefix__ = "\"testFiled9\":".toCharArray();
    public char[] testFiled10_asm_prefix__ = "\"testFiled10\":".toCharArray();
    public char[] testFiled0_asm_prefix__ = "\"testFiled0\":".toCharArray();
    public char[] testFiled7_asm_prefix__ = "\"testFiled7\":".toCharArray();
    public char[] testFiled1_asm_prefix__ = "\"testFiled1\":".toCharArray();
    public char[] testFiled6_asm_prefix__ = "\"testFiled6\":".toCharArray();
    public char[] testFiled11_asm_prefix__ = "\"testFiled11\":".toCharArray();
    public char[] testFiled12_asm_prefix__ = "\"testFiled12\":".toCharArray();
    public char[] testFiled8_asm_prefix__ = "\"testFiled8\":".toCharArray();
    public char[] testFiled2_asm_prefix__ = "\"testFiled2\":".toCharArray();
    public char[] testFiled3_asm_prefix__ = "\"testFiled3\":".toCharArray();
    public char[] testFiled4_asm_prefix__ = "\"testFiled4\":".toCharArray();
    public char[] testFiled5_asm_prefix__ = "\"testFiled5\":".toCharArray();
    public char[] testFiled16_asm_prefix__ = "\"testFiled16\":".toCharArray();
    public char[] testFiled15_asm_prefix__ = "\"testFiled15\":".toCharArray();
    public char[] testFiled14_asm_prefix__ = "\"testFiled14\":".toCharArray();
    public char[] testFiled13_asm_prefix__ = "\"testFiled13\":".toCharArray();
    public char[] testFiled20_asm_prefix__ = "\"testFiled20\":".toCharArray();
    public char[] testFiled26_asm_prefix__ = "\"testFiled26\":".toCharArray();
    public char[] testFiled27_asm_prefix__ = "\"testFiled27\":".toCharArray();
    public char[] testFiled25_asm_prefix__ = "\"testFiled25\":".toCharArray();
    public char[] testFiled30_asm_prefix__ = "\"testFiled30\":".toCharArray();
    public char[] testFiled23_asm_prefix__ = "\"testFiled23\":".toCharArray();
    public char[] testFiled34_asm_prefix__ = "\"testFiled34\":".toCharArray();
    public char[] testFiled28_asm_prefix__ = "\"testFiled28\":".toCharArray();
    public char[] testFiled32_asm_prefix__ = "\"testFiled32\":".toCharArray();
    public char[] testFiled21_asm_prefix__ = "\"testFiled21\":".toCharArray();
    public char[] testFiled22_asm_prefix__ = "\"testFiled22\":".toCharArray();
    public char[] testFiled18_asm_prefix__ = "\"testFiled18\":".toCharArray();
    public char[] testFiled37_asm_prefix__ = "\"testFiled37\":".toCharArray();
    public char[] testFiled24_asm_prefix__ = "\"testFiled24\":".toCharArray();
    public char[] testFiled33_asm_prefix__ = "\"testFiled33\":".toCharArray();
    public char[] testFiled29_asm_prefix__ = "\"testFiled29\":".toCharArray();
    public char[] testFiled35_asm_prefix__ = "\"testFiled35\":".toCharArray();
    public char[] testFiled31_asm_prefix__ = "\"testFiled31\":".toCharArray();
    public char[] testFiled36_asm_prefix__ = "\"testFiled36\":".toCharArray();
    public char[] testFiled17_asm_prefix__ = "\"testFiled17\":".toCharArray();
    public char[] testFiled19_asm_prefix__ = "\"testFiled19\":".toCharArray();
    public char[] testFiled53_asm_prefix__ = "\"testFiled53\":".toCharArray();
    public char[] testFiled42_asm_prefix__ = "\"testFiled42\":".toCharArray();
    public char[] testFiled47_asm_prefix__ = "\"testFiled47\":".toCharArray();
    public char[] testFiled41_asm_prefix__ = "\"testFiled41\":".toCharArray();
    public char[] testFiled48_asm_prefix__ = "\"testFiled48\":".toCharArray();
    public char[] testFiled54_asm_prefix__ = "\"testFiled54\":".toCharArray();
    public char[] testFiled50_asm_prefix__ = "\"testFiled50\":".toCharArray();
    public char[] testFiled40_asm_prefix__ = "\"testFiled40\":".toCharArray();
    public char[] testFiled43_asm_prefix__ = "\"testFiled43\":".toCharArray();
    public char[] testFiled46_asm_prefix__ = "\"testFiled46\":".toCharArray();
    public char[] testFiled52_asm_prefix__ = "\"testFiled52\":".toCharArray();
    public char[] testFiled55_asm_prefix__ = "\"testFiled55\":".toCharArray();
    public char[] testFiled56_asm_prefix__ = "\"testFiled56\":".toCharArray();
    public char[] testFiled57_asm_prefix__ = "\"testFiled57\":".toCharArray();
    public char[] testFiled45_asm_prefix__ = "\"testFiled45\":".toCharArray();
    public char[] testFiled38_asm_prefix__ = "\"testFiled38\":".toCharArray();
    public char[] testFiled39_asm_prefix__ = "\"testFiled39\":".toCharArray();
    public char[] testFiled51_asm_prefix__ = "\"testFiled51\":".toCharArray();
    public char[] testFiled58_asm_prefix__ = "\"testFiled58\":".toCharArray();
    public char[] testFiled49_asm_prefix__ = "\"testFiled49\":".toCharArray();
    public char[] testFiled44_asm_prefix__ = "\"testFiled44\":".toCharArray();
    public char[] testFiled61_asm_prefix__ = "\"testFiled61\":".toCharArray();
    public char[] testFiled59_asm_prefix__ = "\"testFiled59\":".toCharArray();
    public char[] testFiled60_asm_prefix__ = "\"testFiled60\":".toCharArray();
    public char[] testFiled62_asm_prefix__ = "\"testFiled62\":".toCharArray();
    public ObjectDeserializer testFiled9_asm_deser__;
    public ObjectDeserializer testFiled10_asm_deser__;
    public ObjectDeserializer testFiled0_asm_deser__;
    public ObjectDeserializer testFiled7_asm_deser__;
    public ObjectDeserializer testFiled1_asm_deser__;
    public ObjectDeserializer testFiled6_asm_deser__;
    public ObjectDeserializer testFiled11_asm_deser__;
    public ObjectDeserializer testFiled12_asm_deser__;
    public ObjectDeserializer testFiled8_asm_deser__;
    public ObjectDeserializer testFiled2_asm_deser__;
    public ObjectDeserializer testFiled3_asm_deser__;
    public ObjectDeserializer testFiled4_asm_deser__;
    public ObjectDeserializer testFiled5_asm_deser__;
    public ObjectDeserializer testFiled16_asm_deser__;
    public ObjectDeserializer testFiled15_asm_deser__;
    public ObjectDeserializer testFiled14_asm_deser__;
    public ObjectDeserializer testFiled13_asm_deser__;
    public ObjectDeserializer testFiled20_asm_deser__;
    public ObjectDeserializer testFiled26_asm_deser__;
    public ObjectDeserializer testFiled27_asm_deser__;
    public ObjectDeserializer testFiled25_asm_deser__;
    public ObjectDeserializer testFiled30_asm_deser__;
    public ObjectDeserializer testFiled23_asm_deser__;
    public ObjectDeserializer testFiled34_asm_deser__;
    public ObjectDeserializer testFiled28_asm_deser__;
    public ObjectDeserializer testFiled32_asm_deser__;
    public ObjectDeserializer testFiled21_asm_deser__;
    public ObjectDeserializer testFiled22_asm_deser__;
    public ObjectDeserializer testFiled18_asm_deser__;
    public ObjectDeserializer testFiled37_asm_deser__;
    public ObjectDeserializer testFiled24_asm_deser__;
    public ObjectDeserializer testFiled33_asm_deser__;
    public ObjectDeserializer testFiled29_asm_deser__;
    public ObjectDeserializer testFiled35_asm_deser__;
    public ObjectDeserializer testFiled31_asm_deser__;
    public ObjectDeserializer testFiled36_asm_deser__;
    public ObjectDeserializer testFiled17_asm_deser__;
    public ObjectDeserializer testFiled19_asm_deser__;
    public ObjectDeserializer testFiled53_asm_deser__;
    public ObjectDeserializer testFiled42_asm_deser__;
    public ObjectDeserializer testFiled47_asm_deser__;
    public ObjectDeserializer testFiled41_asm_deser__;
    public ObjectDeserializer testFiled48_asm_deser__;
    public ObjectDeserializer testFiled54_asm_deser__;
    public ObjectDeserializer testFiled50_asm_deser__;
    public ObjectDeserializer testFiled40_asm_deser__;
    public ObjectDeserializer testFiled43_asm_deser__;
    public ObjectDeserializer testFiled46_asm_deser__;
    public ObjectDeserializer testFiled52_asm_deser__;
    public ObjectDeserializer testFiled55_asm_deser__;
    public ObjectDeserializer testFiled56_asm_deser__;
    public ObjectDeserializer testFiled57_asm_deser__;
    public ObjectDeserializer testFiled45_asm_deser__;
    public ObjectDeserializer testFiled38_asm_deser__;
    public ObjectDeserializer testFiled39_asm_deser__;
    public ObjectDeserializer testFiled51_asm_deser__;
    public ObjectDeserializer testFiled58_asm_deser__;
    public ObjectDeserializer testFiled49_asm_deser__;
    public ObjectDeserializer testFiled44_asm_deser__;
    public ObjectDeserializer testFiled61_asm_deser__;
    public ObjectDeserializer testFiled59_asm_deser__;
    public ObjectDeserializer testFiled60_asm_deser__;
    public ObjectDeserializer testFiled62_asm_deser__;

    public FastjsonASMDeserializerJson63(ParserConfig var1, JavaBeanInfo var2) {
        super(var1, var2);
    }

    public Object createInstance(DefaultJSONParser var1, Type var2) {
        return new Json63();
    }

    public Object deserialze(DefaultJSONParser var1, Type var2, Object var3, int var4) {
        JSONLexerBase var5 = (JSONLexerBase)var1.lexer;
        if (var5.token() == 14 && var5.isEnabled(var4, 8192)) {
            return this.deserialzeArrayMapping(var1, var2, var3, (Object)null);
        } else if (var5.isEnabled(512) && var5.scanType("io.github.tanghuibo.test.Json63") != -1) {
            Json63 var8;
            int var12;
            int var13;
            String var15;
            String var16;
            String var17;
            String var18;
            String var19;
            String var20;
            String var21;
            String var22;
            String var23;
            String var24;
            String var25;
            String var26;
            String var27;
            String var28;
            String var29;
            String var30;
            String var31;
            String var32;
            String var33;
            String var34;
            String var35;
            String var36;
            String var37;
            String var38;
            String var39;
            String var40;
            String var41;
            String var42;
            String var43;
            String var44;
            String var45;
            String var46;
            String var47;
            String var48;
            String var49;
            String var50;
            String var51;
            String var52;
            String var53;
            String var54;
            String var55;
            String var56;
            String var57;
            String var58;
            String var59;
            String var60;
            String var61;
            String var62;
            String var63;
            String var64;
            String var65;
            String var66;
            String var67;
            String var68;
            String var69;
            String var70;
            String var71;
            String var72;
            String var73;
            String var74;
            String var75;
            String var76;
            String var77;
            label1611: {
                ParseContext var6 = var1.getContext();
                int var7 = 0;
                var8 = new Json63();
                ParseContext var9 = var1.getContext();
                ParseContext var10 = var1.setContext(var9, var8, var3);
                if (var5.matchStat != 4) {
                    boolean var11 = false;
                    var12 = 0;
                    var13 = 0;
                    boolean var14 = var5.isEnabled(4096);
                    String var10000;
                    if (var14) {
                        var12 |= 1;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var15 = (String)var10000;
                    if (var14) {
                        var12 |= 2;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var16 = (String)var10000;
                    if (var14) {
                        var12 |= 4;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var17 = (String)var10000;
                    if (var14) {
                        var12 |= 8;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var18 = (String)var10000;
                    if (var14) {
                        var12 |= 16;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var19 = (String)var10000;
                    if (var14) {
                        var12 |= 32;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var20 = (String)var10000;
                    if (var14) {
                        var12 |= 64;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var21 = (String)var10000;
                    if (var14) {
                        var12 |= 128;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var22 = (String)var10000;
                    if (var14) {
                        var12 |= 256;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var23 = (String)var10000;
                    if (var14) {
                        var12 |= 512;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var24 = (String)var10000;
                    if (var14) {
                        var12 |= 1024;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var25 = (String)var10000;
                    if (var14) {
                        var12 |= 2048;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var26 = (String)var10000;
                    if (var14) {
                        var12 |= 4096;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var27 = (String)var10000;
                    if (var14) {
                        var12 |= 8192;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var28 = (String)var10000;
                    if (var14) {
                        var12 |= 16384;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var29 = (String)var10000;
                    if (var14) {
                        var12 |= 32768;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var30 = (String)var10000;
                    if (var14) {
                        var12 |= 65536;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var31 = (String)var10000;
                    if (var14) {
                        var12 |= 131072;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var32 = (String)var10000;
                    if (var14) {
                        var12 |= 262144;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var33 = (String)var10000;
                    if (var14) {
                        var12 |= 524288;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var34 = (String)var10000;
                    if (var14) {
                        var12 |= 1048576;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var35 = (String)var10000;
                    if (var14) {
                        var12 |= 2097152;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var36 = (String)var10000;
                    if (var14) {
                        var12 |= 4194304;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var37 = (String)var10000;
                    if (var14) {
                        var12 |= 8388608;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var38 = (String)var10000;
                    if (var14) {
                        var12 |= 16777216;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var39 = (String)var10000;
                    if (var14) {
                        var12 |= 33554432;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var40 = (String)var10000;
                    if (var14) {
                        var12 |= 67108864;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var41 = (String)var10000;
                    if (var14) {
                        var12 |= 134217728;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var42 = (String)var10000;
                    if (var14) {
                        var12 |= 268435456;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var43 = (String)var10000;
                    if (var14) {
                        var12 |= 536870912;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var44 = (String)var10000;
                    if (var14) {
                        var12 |= 1073741824;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var45 = (String)var10000;
                    if (var14) {
                        var12 |= -2147483648;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var46 = (String)var10000;
                    if (var14) {
                        var13 |= 1;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var47 = (String)var10000;
                    if (var14) {
                        var13 |= 2;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var48 = (String)var10000;
                    if (var14) {
                        var13 |= 4;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var49 = (String)var10000;
                    if (var14) {
                        var13 |= 8;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var50 = (String)var10000;
                    if (var14) {
                        var13 |= 16;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var51 = (String)var10000;
                    if (var14) {
                        var13 |= 32;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var52 = (String)var10000;
                    if (var14) {
                        var13 |= 64;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var53 = (String)var10000;
                    if (var14) {
                        var13 |= 128;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var54 = (String)var10000;
                    if (var14) {
                        var13 |= 256;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var55 = (String)var10000;
                    if (var14) {
                        var13 |= 512;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var56 = (String)var10000;
                    if (var14) {
                        var13 |= 1024;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var57 = (String)var10000;
                    if (var14) {
                        var13 |= 2048;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var58 = (String)var10000;
                    if (var14) {
                        var13 |= 4096;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var59 = (String)var10000;
                    if (var14) {
                        var13 |= 8192;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var60 = (String)var10000;
                    if (var14) {
                        var13 |= 16384;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var61 = (String)var10000;
                    if (var14) {
                        var13 |= 32768;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var62 = (String)var10000;
                    if (var14) {
                        var13 |= 65536;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var63 = (String)var10000;
                    if (var14) {
                        var13 |= 131072;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var64 = (String)var10000;
                    if (var14) {
                        var13 |= 262144;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var65 = (String)var10000;
                    if (var14) {
                        var13 |= 524288;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var66 = (String)var10000;
                    if (var14) {
                        var13 |= 1048576;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var67 = (String)var10000;
                    if (var14) {
                        var13 |= 2097152;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var68 = (String)var10000;
                    if (var14) {
                        var13 |= 4194304;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var69 = (String)var10000;
                    if (var14) {
                        var13 |= 8388608;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var70 = (String)var10000;
                    if (var14) {
                        var13 |= 16777216;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var71 = (String)var10000;
                    if (var14) {
                        var13 |= 33554432;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var72 = (String)var10000;
                    if (var14) {
                        var13 |= 67108864;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var73 = (String)var10000;
                    if (var14) {
                        var13 |= 134217728;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var74 = (String)var10000;
                    if (var14) {
                        var13 |= 268435456;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var75 = (String)var10000;
                    if (var14) {
                        var13 |= 536870912;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var76 = (String)var10000;
                    if (var14) {
                        var13 |= 1073741824;
                        var10000 = var5.stringDefaultValue();
                    } else {
                        var10000 = null;
                    }

                    var77 = (String)var10000;
                    var15 = var5.scanFieldString(this.testFiled0_asm_prefix__);
                    if (var5.matchStat > 0) {
                        var12 |= 1;
                    }

                    if (var5.matchStat == -1) {
                        break label1611;
                    }

                    label1613: {
                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var16 = var5.scanFieldString(this.testFiled1_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 2;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var17 = var5.scanFieldString(this.testFiled10_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 4;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var18 = var5.scanFieldString(this.testFiled11_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 8;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var19 = var5.scanFieldString(this.testFiled12_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 16;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var20 = var5.scanFieldString(this.testFiled13_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 32;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var21 = var5.scanFieldString(this.testFiled14_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 64;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var22 = var5.scanFieldString(this.testFiled15_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 128;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var23 = var5.scanFieldString(this.testFiled16_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 256;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var24 = var5.scanFieldString(this.testFiled17_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 512;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var25 = var5.scanFieldString(this.testFiled18_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 1024;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var26 = var5.scanFieldString(this.testFiled19_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 2048;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var27 = var5.scanFieldString(this.testFiled2_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 4096;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var28 = var5.scanFieldString(this.testFiled20_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 8192;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var29 = var5.scanFieldString(this.testFiled21_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 16384;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var30 = var5.scanFieldString(this.testFiled22_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 32768;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var31 = var5.scanFieldString(this.testFiled23_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 65536;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var32 = var5.scanFieldString(this.testFiled24_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 131072;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var33 = var5.scanFieldString(this.testFiled25_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 262144;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var34 = var5.scanFieldString(this.testFiled26_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 524288;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var35 = var5.scanFieldString(this.testFiled27_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 1048576;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var36 = var5.scanFieldString(this.testFiled28_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 2097152;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var37 = var5.scanFieldString(this.testFiled29_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 4194304;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var38 = var5.scanFieldString(this.testFiled3_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 8388608;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var39 = var5.scanFieldString(this.testFiled30_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 16777216;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var40 = var5.scanFieldString(this.testFiled31_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 33554432;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var41 = var5.scanFieldString(this.testFiled32_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 67108864;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var42 = var5.scanFieldString(this.testFiled33_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 134217728;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var43 = var5.scanFieldString(this.testFiled34_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 268435456;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var44 = var5.scanFieldString(this.testFiled35_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 536870912;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var45 = var5.scanFieldString(this.testFiled36_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 1073741824;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var46 = var5.scanFieldString(this.testFiled37_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= -2147483648;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var47 = var5.scanFieldString(this.testFiled38_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 1;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var48 = var5.scanFieldString(this.testFiled39_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 2;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var49 = var5.scanFieldString(this.testFiled4_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 4;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var50 = var5.scanFieldString(this.testFiled40_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 8;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var51 = var5.scanFieldString(this.testFiled41_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 16;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var52 = var5.scanFieldString(this.testFiled42_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 32;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var53 = var5.scanFieldString(this.testFiled43_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 64;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var54 = var5.scanFieldString(this.testFiled44_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 128;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var55 = var5.scanFieldString(this.testFiled45_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 256;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var56 = var5.scanFieldString(this.testFiled46_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 512;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var57 = var5.scanFieldString(this.testFiled47_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 1024;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var58 = var5.scanFieldString(this.testFiled48_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 2048;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var59 = var5.scanFieldString(this.testFiled49_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 4096;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var60 = var5.scanFieldString(this.testFiled5_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 8192;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var61 = var5.scanFieldString(this.testFiled50_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 16384;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var62 = var5.scanFieldString(this.testFiled51_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 32768;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var63 = var5.scanFieldString(this.testFiled52_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 65536;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var64 = var5.scanFieldString(this.testFiled53_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 131072;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var65 = var5.scanFieldString(this.testFiled54_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 262144;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var66 = var5.scanFieldString(this.testFiled55_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 524288;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var67 = var5.scanFieldString(this.testFiled56_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 1048576;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var68 = var5.scanFieldString(this.testFiled57_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 2097152;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var69 = var5.scanFieldString(this.testFiled58_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 4194304;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var70 = var5.scanFieldString(this.testFiled59_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 8388608;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var71 = var5.scanFieldString(this.testFiled6_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 16777216;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var72 = var5.scanFieldString(this.testFiled60_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 33554432;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var73 = var5.scanFieldString(this.testFiled61_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 67108864;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var74 = var5.scanFieldString(this.testFiled62_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 134217728;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var75 = var5.scanFieldString(this.testFiled7_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 268435456;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var76 = var5.scanFieldString(this.testFiled8_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 536870912;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        var77 = var5.scanFieldString(this.testFiled9_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var13 |= 1073741824;
                        }

                        if (var5.matchStat == -1) {
                            break label1611;
                        }

                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label1613;
                            }
                        }

                        if (var5.matchStat != 4) {
                            break label1611;
                        }
                    }

                    if ((var12 & 1) != 0) {
                        var8.setTestFiled0(var15);
                    }

                    if ((var12 & 2) != 0) {
                        var8.setTestFiled1(var16);
                    }

                    if ((var12 & 4) != 0) {
                        var8.setTestFiled10(var17);
                    }

                    if ((var12 & 8) != 0) {
                        var8.setTestFiled11(var18);
                    }

                    if ((var12 & 16) != 0) {
                        var8.setTestFiled12(var19);
                    }

                    if ((var12 & 32) != 0) {
                        var8.setTestFiled13(var20);
                    }

                    if ((var12 & 64) != 0) {
                        var8.setTestFiled14(var21);
                    }

                    if ((var12 & 128) != 0) {
                        var8.setTestFiled15(var22);
                    }

                    if ((var12 & 256) != 0) {
                        var8.setTestFiled16(var23);
                    }

                    if ((var12 & 512) != 0) {
                        var8.setTestFiled17(var24);
                    }

                    if ((var12 & 1024) != 0) {
                        var8.setTestFiled18(var25);
                    }

                    if ((var12 & 2048) != 0) {
                        var8.setTestFiled19(var26);
                    }

                    if ((var12 & 4096) != 0) {
                        var8.setTestFiled2(var27);
                    }

                    if ((var12 & 8192) != 0) {
                        var8.setTestFiled20(var28);
                    }

                    if ((var12 & 16384) != 0) {
                        var8.setTestFiled21(var29);
                    }

                    if ((var12 & '耀') != 0) {
                        var8.setTestFiled22(var30);
                    }

                    if ((var12 & 65536) != 0) {
                        var8.setTestFiled23(var31);
                    }

                    if ((var12 & 131072) != 0) {
                        var8.setTestFiled24(var32);
                    }

                    if ((var12 & 262144) != 0) {
                        var8.setTestFiled25(var33);
                    }

                    if ((var12 & 524288) != 0) {
                        var8.setTestFiled26(var34);
                    }

                    if ((var12 & 1048576) != 0) {
                        var8.setTestFiled27(var35);
                    }

                    if ((var12 & 2097152) != 0) {
                        var8.setTestFiled28(var36);
                    }

                    if ((var12 & 4194304) != 0) {
                        var8.setTestFiled29(var37);
                    }

                    if ((var12 & 8388608) != 0) {
                        var8.setTestFiled3(var38);
                    }

                    if ((var12 & 16777216) != 0) {
                        var8.setTestFiled30(var39);
                    }

                    if ((var12 & 33554432) != 0) {
                        var8.setTestFiled31(var40);
                    }

                    if ((var12 & 67108864) != 0) {
                        var8.setTestFiled32(var41);
                    }

                    if ((var12 & 134217728) != 0) {
                        var8.setTestFiled33(var42);
                    }

                    if ((var12 & 268435456) != 0) {
                        var8.setTestFiled34(var43);
                    }

                    if ((var12 & 536870912) != 0) {
                        var8.setTestFiled35(var44);
                    }

                    if ((var12 & 1073741824) != 0) {
                        var8.setTestFiled36(var45);
                    }

                    if ((var12 & -2147483648) != 0) {
                        var8.setTestFiled37(var46);
                    }

                    if ((var13 & 1) != 0) {
                        var8.setTestFiled38(var47);
                    }

                    if ((var13 & 2) != 0) {
                        var8.setTestFiled39(var48);
                    }

                    if ((var13 & 4) != 0) {
                        var8.setTestFiled4(var49);
                    }

                    if ((var13 & 8) != 0) {
                        var8.setTestFiled40(var50);
                    }

                    if ((var13 & 16) != 0) {
                        var8.setTestFiled41(var51);
                    }

                    if ((var13 & 32) != 0) {
                        var8.setTestFiled42(var52);
                    }

                    if ((var13 & 64) != 0) {
                        var8.setTestFiled43(var53);
                    }

                    if ((var13 & 128) != 0) {
                        var8.setTestFiled44(var54);
                    }

                    if ((var13 & 256) != 0) {
                        var8.setTestFiled45(var55);
                    }

                    if ((var13 & 512) != 0) {
                        var8.setTestFiled46(var56);
                    }

                    if ((var13 & 1024) != 0) {
                        var8.setTestFiled47(var57);
                    }

                    if ((var13 & 2048) != 0) {
                        var8.setTestFiled48(var58);
                    }

                    if ((var13 & 4096) != 0) {
                        var8.setTestFiled49(var59);
                    }

                    if ((var13 & 8192) != 0) {
                        var8.setTestFiled5(var60);
                    }

                    if ((var13 & 16384) != 0) {
                        var8.setTestFiled50(var61);
                    }

                    if ((var13 & '耀') != 0) {
                        var8.setTestFiled51(var62);
                    }

                    if ((var13 & 65536) != 0) {
                        var8.setTestFiled52(var63);
                    }

                    if ((var13 & 131072) != 0) {
                        var8.setTestFiled53(var64);
                    }

                    if ((var13 & 262144) != 0) {
                        var8.setTestFiled54(var65);
                    }

                    if ((var13 & 524288) != 0) {
                        var8.setTestFiled55(var66);
                    }

                    if ((var13 & 1048576) != 0) {
                        var8.setTestFiled56(var67);
                    }

                    if ((var13 & 2097152) != 0) {
                        var8.setTestFiled57(var68);
                    }

                    if ((var13 & 4194304) != 0) {
                        var8.setTestFiled58(var69);
                    }

                    if ((var13 & 8388608) != 0) {
                        var8.setTestFiled59(var70);
                    }

                    if ((var13 & 16777216) != 0) {
                        var8.setTestFiled6(var71);
                    }

                    if ((var13 & 33554432) != 0) {
                        var8.setTestFiled60(var72);
                    }

                    if ((var13 & 67108864) != 0) {
                        var8.setTestFiled61(var73);
                    }

                    if ((var13 & 134217728) != 0) {
                        var8.setTestFiled62(var74);
                    }

                    if ((var13 & 268435456) != 0) {
                        var8.setTestFiled7(var75);
                    }

                    if ((var13 & 536870912) != 0) {
                        var8.setTestFiled8(var76);
                    }

                    if ((var13 & 1073741824) != 0) {
                        var8.setTestFiled9(var77);
                    }
                }

                var1.setContext(var9);
                if (var10 != null) {
                    var10.object = var8;
                }

                return var8;
            }

            if ((var12 & 1) != 0) {
                var8.setTestFiled0(var15);
            }

            if ((var12 & 2) != 0) {
                var8.setTestFiled1(var16);
            }

            if ((var12 & 4) != 0) {
                var8.setTestFiled10(var17);
            }

            if ((var12 & 8) != 0) {
                var8.setTestFiled11(var18);
            }

            if ((var12 & 16) != 0) {
                var8.setTestFiled12(var19);
            }

            if ((var12 & 32) != 0) {
                var8.setTestFiled13(var20);
            }

            if ((var12 & 64) != 0) {
                var8.setTestFiled14(var21);
            }

            if ((var12 & 128) != 0) {
                var8.setTestFiled15(var22);
            }

            if ((var12 & 256) != 0) {
                var8.setTestFiled16(var23);
            }

            if ((var12 & 512) != 0) {
                var8.setTestFiled17(var24);
            }

            if ((var12 & 1024) != 0) {
                var8.setTestFiled18(var25);
            }

            if ((var12 & 2048) != 0) {
                var8.setTestFiled19(var26);
            }

            if ((var12 & 4096) != 0) {
                var8.setTestFiled2(var27);
            }

            if ((var12 & 8192) != 0) {
                var8.setTestFiled20(var28);
            }

            if ((var12 & 16384) != 0) {
                var8.setTestFiled21(var29);
            }

            if ((var12 & '耀') != 0) {
                var8.setTestFiled22(var30);
            }

            if ((var12 & 65536) != 0) {
                var8.setTestFiled23(var31);
            }

            if ((var12 & 131072) != 0) {
                var8.setTestFiled24(var32);
            }

            if ((var12 & 262144) != 0) {
                var8.setTestFiled25(var33);
            }

            if ((var12 & 524288) != 0) {
                var8.setTestFiled26(var34);
            }

            if ((var12 & 1048576) != 0) {
                var8.setTestFiled27(var35);
            }

            if ((var12 & 2097152) != 0) {
                var8.setTestFiled28(var36);
            }

            if ((var12 & 4194304) != 0) {
                var8.setTestFiled29(var37);
            }

            if ((var12 & 8388608) != 0) {
                var8.setTestFiled3(var38);
            }

            if ((var12 & 16777216) != 0) {
                var8.setTestFiled30(var39);
            }

            if ((var12 & 33554432) != 0) {
                var8.setTestFiled31(var40);
            }

            if ((var12 & 67108864) != 0) {
                var8.setTestFiled32(var41);
            }

            if ((var12 & 134217728) != 0) {
                var8.setTestFiled33(var42);
            }

            if ((var12 & 268435456) != 0) {
                var8.setTestFiled34(var43);
            }

            if ((var12 & 536870912) != 0) {
                var8.setTestFiled35(var44);
            }

            if ((var12 & 1073741824) != 0) {
                var8.setTestFiled36(var45);
            }

            if ((var12 & -2147483648) != 0) {
                var8.setTestFiled37(var46);
            }

            if ((var13 & 1) != 0) {
                var8.setTestFiled38(var47);
            }

            if ((var13 & 2) != 0) {
                var8.setTestFiled39(var48);
            }

            if ((var13 & 4) != 0) {
                var8.setTestFiled4(var49);
            }

            if ((var13 & 8) != 0) {
                var8.setTestFiled40(var50);
            }

            if ((var13 & 16) != 0) {
                var8.setTestFiled41(var51);
            }

            if ((var13 & 32) != 0) {
                var8.setTestFiled42(var52);
            }

            if ((var13 & 64) != 0) {
                var8.setTestFiled43(var53);
            }

            if ((var13 & 128) != 0) {
                var8.setTestFiled44(var54);
            }

            if ((var13 & 256) != 0) {
                var8.setTestFiled45(var55);
            }

            if ((var13 & 512) != 0) {
                var8.setTestFiled46(var56);
            }

            if ((var13 & 1024) != 0) {
                var8.setTestFiled47(var57);
            }

            if ((var13 & 2048) != 0) {
                var8.setTestFiled48(var58);
            }

            if ((var13 & 4096) != 0) {
                var8.setTestFiled49(var59);
            }

            if ((var13 & 8192) != 0) {
                var8.setTestFiled5(var60);
            }

            if ((var13 & 16384) != 0) {
                var8.setTestFiled50(var61);
            }

            if ((var13 & '耀') != 0) {
                var8.setTestFiled51(var62);
            }

            if ((var13 & 65536) != 0) {
                var8.setTestFiled52(var63);
            }

            if ((var13 & 131072) != 0) {
                var8.setTestFiled53(var64);
            }

            if ((var13 & 262144) != 0) {
                var8.setTestFiled54(var65);
            }

            if ((var13 & 524288) != 0) {
                var8.setTestFiled55(var66);
            }

            if ((var13 & 1048576) != 0) {
                var8.setTestFiled56(var67);
            }

            if ((var13 & 2097152) != 0) {
                var8.setTestFiled57(var68);
            }

            if ((var13 & 4194304) != 0) {
                var8.setTestFiled58(var69);
            }

            if ((var13 & 8388608) != 0) {
                var8.setTestFiled59(var70);
            }

            if ((var13 & 16777216) != 0) {
                var8.setTestFiled6(var71);
            }

            if ((var13 & 33554432) != 0) {
                var8.setTestFiled60(var72);
            }

            if ((var13 & 67108864) != 0) {
                var8.setTestFiled61(var73);
            }

            if ((var13 & 134217728) != 0) {
                var8.setTestFiled62(var74);
            }

            if ((var13 & 268435456) != 0) {
                var8.setTestFiled7(var75);
            }

            if ((var13 & 536870912) != 0) {
                var8.setTestFiled8(var76);
            }

            if ((var13 & 1073741824) != 0) {
                var8.setTestFiled9(var77);
            }

            return (Json63)this.parseRest(var1, var2, var3, var8, var4, new int[]{var12, var13});
        } else {
            return super.deserialze(var1, var2, var3, var4);
        }
    }

    public Object deserialzeArrayMapping(DefaultJSONParser var1, Type var2, Object var3, Object var4) {
        JSONLexerBase var72 = (JSONLexerBase)var1.lexer;
        String var5 = var72.scanTypeName(var1.getSymbolTable());
        if (var5 != null) {
            JavaBeanDeserializer var6 = JavaBeanDeserializer.getSeeAlso(var1.getConfig(), super.beanInfo, var5);
            if (var6 instanceof JavaBeanDeserializer) {
                return var6.deserialzeArrayMapping(var1, var2, var3, var72);
            }
        }

        Json63 var7 = new Json63();
        String var8 = var72.scanString(',');
        String var9 = var72.scanString(',');
        String var10 = var72.scanString(',');
        String var11 = var72.scanString(',');
        String var12 = var72.scanString(',');
        String var13 = var72.scanString(',');
        String var14 = var72.scanString(',');
        String var15 = var72.scanString(',');
        String var16 = var72.scanString(',');
        String var17 = var72.scanString(',');
        String var18 = var72.scanString(',');
        String var19 = var72.scanString(',');
        String var20 = var72.scanString(',');
        String var21 = var72.scanString(',');
        String var22 = var72.scanString(',');
        String var23 = var72.scanString(',');
        String var24 = var72.scanString(',');
        String var25 = var72.scanString(',');
        String var26 = var72.scanString(',');
        String var27 = var72.scanString(',');
        String var28 = var72.scanString(',');
        String var29 = var72.scanString(',');
        String var30 = var72.scanString(',');
        String var31 = var72.scanString(',');
        String var32 = var72.scanString(',');
        String var33 = var72.scanString(',');
        String var34 = var72.scanString(',');
        String var35 = var72.scanString(',');
        String var36 = var72.scanString(',');
        String var37 = var72.scanString(',');
        String var38 = var72.scanString(',');
        String var39 = var72.scanString(',');
        String var40 = var72.scanString(',');
        String var41 = var72.scanString(',');
        String var42 = var72.scanString(',');
        String var43 = var72.scanString(',');
        String var44 = var72.scanString(',');
        String var45 = var72.scanString(',');
        String var46 = var72.scanString(',');
        String var47 = var72.scanString(',');
        String var48 = var72.scanString(',');
        String var49 = var72.scanString(',');
        String var50 = var72.scanString(',');
        String var51 = var72.scanString(',');
        String var52 = var72.scanString(',');
        String var53 = var72.scanString(',');
        String var54 = var72.scanString(',');
        String var55 = var72.scanString(',');
        String var56 = var72.scanString(',');
        String var57 = var72.scanString(',');
        String var58 = var72.scanString(',');
        String var59 = var72.scanString(',');
        String var60 = var72.scanString(',');
        String var61 = var72.scanString(',');
        String var62 = var72.scanString(',');
        String var63 = var72.scanString(',');
        String var64 = var72.scanString(',');
        String var65 = var72.scanString(',');
        String var66 = var72.scanString(',');
        String var67 = var72.scanString(',');
        String var68 = var72.scanString(',');
        String var69 = var72.scanString(',');
        String var70 = var72.scanString(']');
        var7.setTestFiled9(var70);
        var7.setTestFiled10(var10);
        var7.setTestFiled0(var8);
        var7.setTestFiled7(var68);
        var7.setTestFiled1(var9);
        var7.setTestFiled6(var64);
        var7.setTestFiled11(var11);
        var7.setTestFiled12(var12);
        var7.setTestFiled8(var69);
        var7.setTestFiled2(var20);
        var7.setTestFiled3(var31);
        var7.setTestFiled4(var42);
        var7.setTestFiled5(var53);
        var7.setTestFiled16(var16);
        var7.setTestFiled15(var15);
        var7.setTestFiled14(var14);
        var7.setTestFiled13(var13);
        var7.setTestFiled20(var21);
        var7.setTestFiled26(var27);
        var7.setTestFiled27(var28);
        var7.setTestFiled25(var26);
        var7.setTestFiled30(var32);
        var7.setTestFiled23(var24);
        var7.setTestFiled34(var36);
        var7.setTestFiled28(var29);
        var7.setTestFiled32(var34);
        var7.setTestFiled21(var22);
        var7.setTestFiled22(var23);
        var7.setTestFiled18(var18);
        var7.setTestFiled37(var39);
        var7.setTestFiled24(var25);
        var7.setTestFiled33(var35);
        var7.setTestFiled29(var30);
        var7.setTestFiled35(var37);
        var7.setTestFiled31(var33);
        var7.setTestFiled36(var38);
        var7.setTestFiled17(var17);
        var7.setTestFiled19(var19);
        var7.setTestFiled53(var57);
        var7.setTestFiled42(var45);
        var7.setTestFiled47(var50);
        var7.setTestFiled41(var44);
        var7.setTestFiled48(var51);
        var7.setTestFiled54(var58);
        var7.setTestFiled50(var54);
        var7.setTestFiled40(var43);
        var7.setTestFiled43(var46);
        var7.setTestFiled46(var49);
        var7.setTestFiled52(var56);
        var7.setTestFiled55(var59);
        var7.setTestFiled56(var60);
        var7.setTestFiled57(var61);
        var7.setTestFiled45(var48);
        var7.setTestFiled38(var40);
        var7.setTestFiled39(var41);
        var7.setTestFiled51(var55);
        var7.setTestFiled58(var62);
        var7.setTestFiled49(var52);
        var7.setTestFiled44(var47);
        var7.setTestFiled61(var66);
        var7.setTestFiled59(var63);
        var7.setTestFiled60(var65);
        var7.setTestFiled62(var67);
        char var71;
        if ((var71 = var72.getCurrent()) == ',') {
            var72.next();
            var72.setToken(16);
        } else if (var71 == ']') {
            var72.next();
            var72.setToken(15);
        } else if (var71 == 26) {
            var72.next();
            var72.setToken(20);
        } else {
            var72.nextToken(16);
        }

        return var7;
    }
}
