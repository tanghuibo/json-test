package io.github.tanghuibo.jsontest.fastjson;

import com.alibaba.fastjson.serializer.*;
import com.alibaba.fastjson.util.ASMUtils;
import io.github.tanghuibo.jsontest.bean.UserInfo;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class ASMSerializer_1_UserInfo extends JavaBeanSerializer implements ObjectSerializer {
    public Type age_asm_fieldType = ASMUtils.getMethodType(UserInfo.class, "getAge");
    public ObjectSerializer age_asm_ser_;
    public Type girlFriend_asm_fieldType = ASMUtils.getMethodType(UserInfo.class, "getGirlFriend");
    public ObjectSerializer girlFriend_asm_ser_;
    public Type hobby_asm_fieldType = ASMUtils.getMethodType(UserInfo.class, "getHobby");
    public ObjectSerializer hobby_asm_list_item_ser_;
    public ObjectSerializer hobby_asm_ser_;
    public Type single_asm_fieldType = ASMUtils.getMethodType(UserInfo.class, "getSingle");
    public ObjectSerializer single_asm_ser_;

    public ASMSerializer_1_UserInfo(SerializeBeanInfo var1) {
        super(var1);
    }

    public void write(JSONSerializer var1, Object var2, Object var3, Type var4, int var5) throws IOException {
        if (var2 == null) {
            var1.writeNull();
        } else {
            SerializeWriter var9 = var1.out;
            if (!this.writeDirect(var1)) {
                this.writeNormal(var1, var2, var3, var4, var5);
            } else if (var9.isEnabled(32768)) {
                this.writeDirectNonContext(var1, var2, var3, var4, var5);
            } else {
                UserInfo var10 = (UserInfo)var2;
                if (!this.writeReference(var1, var2, var5)) {
                    if (var9.isEnabled(2097152)) {
                        this.writeAsArray(var1, var2, var3, var4, var5);
                    } else {
                        SerialContext var11 = var1.getContext();
                        var1.setContext(var11, var2, var3, 0);
                        char var12 = '{';
                        String var6 = "age";
                        if (!var9.isEnabled(33554432)) {
                            Integer var13 = var10.getAge();
                            if (var13 == null) {
                                if (var9.isEnabled(260)) {
                                    var9.write(var12);
                                    var9.writeFieldNameDirect(var6);
                                    var9.writeNull(0, 256);
                                    var12 = ',';
                                }
                            } else {
                                var9.write(var12);
                                var9.writeFieldNameDirect(var6);
                                var1.writeWithFieldName(var13, var6, this.age_asm_fieldType, 0);
                                var12 = ',';
                            }
                        }

                        var6 = "birthday";
                        String var14 = var10.getBirthday();
                        if (var14 == null) {
                            if (var9.isEnabled(132)) {
                                var9.write(var12);
                                var9.writeFieldNameDirect(var6);
                                var9.writeNull(0, 128);
                                var12 = ',';
                            }
                        } else {
                            var9.writeFieldValueStringWithDoubleQuoteCheck(var12, var6, var14);
                            var12 = ',';
                        }

                        var6 = "department";
                        var14 = var10.getDepartment();
                        if (var14 == null) {
                            if (var9.isEnabled(132)) {
                                var9.write(var12);
                                var9.writeFieldNameDirect(var6);
                                var9.writeNull(0, 128);
                                var12 = ',';
                            }
                        } else {
                            var9.writeFieldValueStringWithDoubleQuoteCheck(var12, var6, var14);
                            var12 = ',';
                        }

                        var6 = "girlFriend";
                        UserInfo var20 = var10.getGirlFriend();
                        if (var20 == null) {
                            if (var9.isEnabled(964)) {
                                var9.write(var12);
                                var9.writeFieldNameDirect(var6);
                                var9.writeNull(0, 0);
                                var12 = ',';
                            }
                        } else {
                            var9.write(var12);
                            var9.writeFieldNameDirect(var6);
                            if (var20.getClass() == UserInfo.class) {
                                if (this.girlFriend_asm_ser_ == null) {
                                    this.girlFriend_asm_ser_ = var1.getObjectWriter(UserInfo.class);
                                }

                                ObjectSerializer var15 = this.girlFriend_asm_ser_;
                                if (var15 instanceof JavaBeanSerializer) {
                                    ((JavaBeanSerializer)var15).write(var1, var20, var6, this.girlFriend_asm_fieldType, 0);
                                } else {
                                    var15.write(var1, var20, var6, this.girlFriend_asm_fieldType, 0);
                                }
                            } else {
                                var1.writeWithFieldName(var20, var6, this.girlFriend_asm_fieldType, 0);
                            }

                            var12 = ',';
                        }

                        var6 = "hobby";
                        List var16 = (List)var10.getHobby();
                        if (var16 == null) {
                            if (var9.isEnabled(68)) {
                                var9.write(var12);
                                var9.writeFieldNameDirect(var6);
                                var9.writeNull(0, 64);
                                var12 = ',';
                            }
                        } else {
                            var9.write(var12);
                            var9.writeFieldNameDirect(var6);
                            int var17 = var16.size();
                            if (var17 == 0) {
                                var9.write("[]");
                            } else {
                                var1.setContext(var16, var6);
                                var9.write(var16);
                                var1.popContext();
                            }

                            var12 = ',';
                        }

                        var6 = "iQiYiId";
                        var14 = var10.getiQiYiId();
                        if (var14 == null) {
                            if (var9.isEnabled(132)) {
                                var9.write(var12);
                                var9.writeFieldNameDirect(var6);
                                var9.writeNull(0, 128);
                                var12 = ',';
                            }
                        } else {
                            var9.writeFieldValueStringWithDoubleQuoteCheck(var12, var6, var14);
                            var12 = ',';
                        }

                        var6 = "name";
                        var14 = var10.getName();
                        if (var14 == null) {
                            if (var9.isEnabled(132)) {
                                var9.write(var12);
                                var9.writeFieldNameDirect(var6);
                                var9.writeNull(0, 128);
                                var12 = ',';
                            }
                        } else {
                            var9.writeFieldValueStringWithDoubleQuoteCheck(var12, var6, var14);
                            var12 = ',';
                        }

                        var6 = "sex";
                        var14 = var10.getSex();
                        if (var14 == null) {
                            if (var9.isEnabled(132)) {
                                var9.write(var12);
                                var9.writeFieldNameDirect(var6);
                                var9.writeNull(0, 128);
                                var12 = ',';
                            }
                        } else {
                            var9.writeFieldValueStringWithDoubleQuoteCheck(var12, var6, var14);
                            var12 = ',';
                        }

                        var6 = "single";
                        Boolean var21 = var10.getSingle();
                        if (var21 == null) {
                            if (var9.isEnabled(516)) {
                                var9.write(var12);
                                var9.writeFieldNameDirect(var6);
                                var9.writeNull(0, 512);
                                var12 = ',';
                            }
                        } else {
                            var9.write(var12);
                            var9.writeFieldNameDirect(var6);
                            var1.writeWithFieldName(var21, var6, this.single_asm_fieldType, 0);
                            var12 = ',';
                        }

                        if (var12 == '{') {
                            var9.write(123);
                        }

                        var9.write(125);
                        var1.setContext(var11);
                    }
                }
            }
        }
    }

    public void writeNormal(JSONSerializer var1, Object var2, Object var3, Type var4, int var5) throws IOException {
        if (var2 == null) {
            var1.writeNull();
        } else {
            SerializeWriter var9 = var1.out;
            if (!var9.isSortField()) {
                this.writeUnsorted(var1, var2, var3, var4, var5);
            } else {
                UserInfo var10 = (UserInfo)var2;
                if (!var9.isEnabled(8192) && !var9.isEnabled(134217728)) {
                    if (!this.writeReference(var1, var2, var5)) {
                        if (var9.isEnabled(2097152)) {
                            this.writeAsArrayNormal(var1, var2, var3, var4, var5);
                        } else {
                            SerialContext var11 = var1.getContext();
                            var1.setContext(var11, var2, var3, 0);
                            byte var10000;
                            if (var1.isWriteClassName(var4, var2) && var4 != var2.getClass()) {
                                var9.write(123);
                                this.writeClassName(var1, (String)null, var2);
                                var10000 = 44;
                            } else {
                                var10000 = 123;
                            }

                            char var12 = (char)var10000;
                            char var26 = this.writeBefore(var1, var2, var12);
                            boolean var13 = var9.isNotWriteDefaultValue();
                            var1.checkValue(this);
                            boolean var15 = var1.hasNameFilters(this);
                            String var6 = "age";
                            Object var8;
                            if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "") && !var9.isEnabled(33554432)) {
                                Integer var16 = var10.getAge();
                                if (var13) {
                                }

                                if (this.apply(var1, var2, var6, var16)) {
                                    if (var15) {
                                        var6 = this.processKey(var1, var2, var6, var16);
                                    }

                                    var8 = this.processValue(var1, this.getBeanContext(0), var2, var6, var16);
                                    if (var16 != var8) {
                                        if (var8 == null) {
                                            if (var9.isEnabled(260)) {
                                                var9.write(var26);
                                                var9.writeFieldName(var6, false);
                                                var9.writeNull(0, 256);
                                                var26 = ',';
                                            }
                                        } else {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var1.writeWithFieldName(var8, var6, this.age_asm_fieldType, 0);
                                            var26 = ',';
                                        }
                                    } else if (var8 == null) {
                                        if (var9.isEnabled(260)) {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var9.writeNull(0, 256);
                                            var26 = ',';
                                        }
                                    } else {
                                        var9.write(var26);
                                        var9.writeFieldName(var6, false);
                                        var1.writeWithFieldName(var8, var6, this.age_asm_fieldType, 0);
                                        var26 = ',';
                                    }
                                }
                            }

                            var6 = "birthday";
                            String var17;
                            if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                                var17 = var10.getBirthday();
                                if (var13) {
                                }

                                if (this.apply(var1, var2, var6, var17)) {
                                    if (var15) {
                                        var6 = this.processKey(var1, var2, var6, var17);
                                    }

                                    var8 = this.processValue(var1, this.getBeanContext(1), var2, var6, var17);
                                    if (var17 != var8) {
                                        if (var8 == null) {
                                            if (var9.isEnabled(132)) {
                                                var9.write(var26);
                                                var9.writeFieldName(var6, false);
                                                var9.writeNull(0, 128);
                                                var26 = ',';
                                            }
                                        } else {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var1.writeWithFieldName(var8, var6, String.class, 0);
                                            var26 = ',';
                                        }
                                    } else if (var17 == null) {
                                        if (var9.isEnabled(132)) {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var9.writeNull(0, 128);
                                            var26 = ',';
                                        }
                                    } else {
                                        var9.writeFieldValue(var26, var6, var17);
                                        var26 = ',';
                                    }
                                }
                            }

                            var6 = "department";
                            if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                                var17 = var10.getDepartment();
                                if (var13) {
                                }

                                if (this.apply(var1, var2, var6, var17)) {
                                    if (var15) {
                                        var6 = this.processKey(var1, var2, var6, var17);
                                    }

                                    var8 = this.processValue(var1, this.getBeanContext(2), var2, var6, var17);
                                    if (var17 != var8) {
                                        if (var8 == null) {
                                            if (var9.isEnabled(132)) {
                                                var9.write(var26);
                                                var9.writeFieldName(var6, false);
                                                var9.writeNull(0, 128);
                                                var26 = ',';
                                            }
                                        } else {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var1.writeWithFieldName(var8, var6, String.class, 0);
                                            var26 = ',';
                                        }
                                    } else if (var17 == null) {
                                        if (var9.isEnabled(132)) {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var9.writeNull(0, 128);
                                            var26 = ',';
                                        }
                                    } else {
                                        var9.writeFieldValue(var26, var6, var17);
                                        var26 = ',';
                                    }
                                }
                            }

                            var6 = "girlFriend";
                            ObjectSerializer var18;
                            if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                                UserInfo var27 = var10.getGirlFriend();
                                if (var13) {
                                }

                                if (this.apply(var1, var2, var6, var27)) {
                                    if (var15) {
                                        var6 = this.processKey(var1, var2, var6, var27);
                                    }

                                    var8 = this.processValue(var1, this.getBeanContext(3), var2, var6, var27);
                                    if (var27 != var8) {
                                        if (var8 == null) {
                                            if (var9.isEnabled(964)) {
                                                var9.write(var26);
                                                var9.writeFieldName(var6, false);
                                                var9.writeNull(0, 0);
                                                var26 = ',';
                                            }
                                        } else {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            if (var8.getClass() == UserInfo.class) {
                                                if (this.girlFriend_asm_ser_ == null) {
                                                    this.girlFriend_asm_ser_ = var1.getObjectWriter(UserInfo.class);
                                                }

                                                var18 = this.girlFriend_asm_ser_;
                                                if (var18 instanceof JavaBeanSerializer) {
                                                    ((JavaBeanSerializer)var18).write(var1, var8, var6, this.girlFriend_asm_fieldType, 0);
                                                } else {
                                                    var18.write(var1, var8, var6, this.girlFriend_asm_fieldType, 0);
                                                }
                                            } else {
                                                var1.writeWithFieldName(var8, var6, this.girlFriend_asm_fieldType, 0);
                                            }

                                            var26 = ',';
                                        }
                                    } else if (var8 == null) {
                                        if (var9.isEnabled(964)) {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var9.writeNull(0, 0);
                                            var26 = ',';
                                        }
                                    } else {
                                        var9.write(var26);
                                        var9.writeFieldName(var6, false);
                                        if (var8.getClass() == UserInfo.class) {
                                            if (this.girlFriend_asm_ser_ == null) {
                                                this.girlFriend_asm_ser_ = var1.getObjectWriter(UserInfo.class);
                                            }

                                            var18 = this.girlFriend_asm_ser_;
                                            if (var18 instanceof JavaBeanSerializer) {
                                                ((JavaBeanSerializer)var18).write(var1, var8, var6, this.girlFriend_asm_fieldType, 0);
                                            } else {
                                                var18.write(var1, var8, var6, this.girlFriend_asm_fieldType, 0);
                                            }
                                        } else {
                                            var1.writeWithFieldName(var8, var6, this.girlFriend_asm_fieldType, 0);
                                        }

                                        var26 = ',';
                                    }
                                }
                            }

                            var6 = "hobby";
                            if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                                List var19 = (List)var10.getHobby();
                                if (var13) {
                                }

                                if (this.apply(var1, var2, var6, var19)) {
                                    if (var15) {
                                        var6 = this.processKey(var1, var2, var6, var19);
                                    }

                                    var8 = this.processValue(var1, this.getBeanContext(4), var2, var6, var19);
                                    if (var19 != var8) {
                                        if (var8 == null) {
                                            if (var9.isEnabled(68)) {
                                                var9.write(var26);
                                                var9.writeFieldName(var6, false);
                                                var9.writeNull(0, 64);
                                                var26 = ',';
                                            }
                                        } else {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            if (var8.getClass() == List.class) {
                                                if (this.hobby_asm_ser_ == null) {
                                                    this.hobby_asm_ser_ = var1.getObjectWriter(List.class);
                                                }

                                                var18 = this.hobby_asm_ser_;
                                                if (var18 instanceof JavaBeanSerializer) {
                                                    ((JavaBeanSerializer)var18).write(var1, var8, var6, this.hobby_asm_fieldType, 0);
                                                } else {
                                                    var18.write(var1, var8, var6, this.hobby_asm_fieldType, 0);
                                                }
                                            } else {
                                                var1.writeWithFieldName(var8, var6, this.hobby_asm_fieldType, 0);
                                            }

                                            var26 = ',';
                                        }
                                    } else if (var19 == null) {
                                        if (var9.isEnabled(68)) {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var9.writeNull(0, 64);
                                            var26 = ',';
                                        }
                                    } else {
                                        var9.write(var26);
                                        var9.writeFieldName(var6, false);
                                        int var20 = var19.size();
                                        if (var20 == 0) {
                                            var9.write("[]");
                                        } else {
                                            var1.setContext(var19, var6);
                                            var9.write(91);

                                            for(int var21 = 0; var21 < var20; ++var21) {
                                                if (var21 != 0) {
                                                    var9.write(44);
                                                }

                                                Object var22 = var19.get(var21);
                                                if (var22 == null) {
                                                    var9.writeNull();
                                                } else if (var22.getClass() == String.class) {
                                                    if (this.hobby_asm_list_item_ser_ == null) {
                                                        this.hobby_asm_list_item_ser_ = var1.getObjectWriter(String.class);
                                                    }

                                                    ObjectSerializer var23 = this.hobby_asm_list_item_ser_;
                                                    var23.write(var1, var22, var21, String.class, 0);
                                                } else {
                                                    var1.writeWithFieldName(var22, var21, String.class, 0);
                                                }
                                            }

                                            var9.write(93);
                                            var1.popContext();
                                        }

                                        var26 = ',';
                                    }
                                }
                            }

                            var6 = "iQiYiId";
                            if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                                var17 = var10.getiQiYiId();
                                if (var13) {
                                }

                                if (this.apply(var1, var2, var6, var17)) {
                                    if (var15) {
                                        var6 = this.processKey(var1, var2, var6, var17);
                                    }

                                    var8 = this.processValue(var1, this.getBeanContext(5), var2, var6, var17);
                                    if (var17 != var8) {
                                        if (var8 == null) {
                                            if (var9.isEnabled(132)) {
                                                var9.write(var26);
                                                var9.writeFieldName(var6, false);
                                                var9.writeNull(0, 128);
                                                var26 = ',';
                                            }
                                        } else {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var1.writeWithFieldName(var8, var6, String.class, 0);
                                            var26 = ',';
                                        }
                                    } else if (var17 == null) {
                                        if (var9.isEnabled(132)) {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var9.writeNull(0, 128);
                                            var26 = ',';
                                        }
                                    } else {
                                        var9.writeFieldValue(var26, var6, var17);
                                        var26 = ',';
                                    }
                                }
                            }

                            var6 = "name";
                            if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                                var17 = var10.getName();
                                if (var13) {
                                }

                                if (this.apply(var1, var2, var6, var17)) {
                                    if (var15) {
                                        var6 = this.processKey(var1, var2, var6, var17);
                                    }

                                    var8 = this.processValue(var1, this.getBeanContext(6), var2, var6, var17);
                                    if (var17 != var8) {
                                        if (var8 == null) {
                                            if (var9.isEnabled(132)) {
                                                var9.write(var26);
                                                var9.writeFieldName(var6, false);
                                                var9.writeNull(0, 128);
                                                var26 = ',';
                                            }
                                        } else {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var1.writeWithFieldName(var8, var6, String.class, 0);
                                            var26 = ',';
                                        }
                                    } else if (var17 == null) {
                                        if (var9.isEnabled(132)) {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var9.writeNull(0, 128);
                                            var26 = ',';
                                        }
                                    } else {
                                        var9.writeFieldValue(var26, var6, var17);
                                        var26 = ',';
                                    }
                                }
                            }

                            var6 = "sex";
                            if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                                var17 = var10.getSex();
                                if (var13) {
                                }

                                if (this.apply(var1, var2, var6, var17)) {
                                    if (var15) {
                                        var6 = this.processKey(var1, var2, var6, var17);
                                    }

                                    var8 = this.processValue(var1, this.getBeanContext(7), var2, var6, var17);
                                    if (var17 != var8) {
                                        if (var8 == null) {
                                            if (var9.isEnabled(132)) {
                                                var9.write(var26);
                                                var9.writeFieldName(var6, false);
                                                var9.writeNull(0, 128);
                                                var26 = ',';
                                            }
                                        } else {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var1.writeWithFieldName(var8, var6, String.class, 0);
                                            var26 = ',';
                                        }
                                    } else if (var17 == null) {
                                        if (var9.isEnabled(132)) {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var9.writeNull(0, 128);
                                            var26 = ',';
                                        }
                                    } else {
                                        var9.writeFieldValue(var26, var6, var17);
                                        var26 = ',';
                                    }
                                }
                            }

                            var6 = "single";
                            if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                                Boolean var28 = var10.getSingle();
                                if (var13) {
                                }

                                if (this.apply(var1, var2, var6, var28)) {
                                    if (var15) {
                                        var6 = this.processKey(var1, var2, var6, var28);
                                    }

                                    var8 = this.processValue(var1, this.getBeanContext(8), var2, var6, var28);
                                    if (var28 != var8) {
                                        if (var8 == null) {
                                            if (var9.isEnabled(516)) {
                                                var9.write(var26);
                                                var9.writeFieldName(var6, false);
                                                var9.writeNull(0, 512);
                                                var26 = ',';
                                            }
                                        } else {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var1.writeWithFieldName(var8, var6, this.single_asm_fieldType, 0);
                                            var26 = ',';
                                        }
                                    } else if (var8 == null) {
                                        if (var9.isEnabled(516)) {
                                            var9.write(var26);
                                            var9.writeFieldName(var6, false);
                                            var9.writeNull(0, 512);
                                            var26 = ',';
                                        }
                                    } else {
                                        var9.write(var26);
                                        var9.writeFieldName(var6, false);
                                        var1.writeWithFieldName(var8, var6, this.single_asm_fieldType, 0);
                                        var26 = ',';
                                    }
                                }
                            }

                            var26 = this.writeAfter(var1, var2, var26);
                            if (var26 == '{') {
                                var9.write(123);
                            }

                            var9.write(125);
                            var1.setContext(var11);
                        }
                    }
                } else {
                    super.write(var1, var2, var3, var4, var5);
                }
            }
        }
    }

    public void writeDirectNonContext(JSONSerializer var1, Object var2, Object var3, Type var4, int var5) throws IOException {
        if (var2 == null) {
            var1.writeNull();
        } else {
            SerializeWriter var9 = var1.out;
            UserInfo var10 = (UserInfo)var2;
            if (var9.isEnabled(2097152)) {
                this.writeAsArrayNonContext(var1, var2, var3, var4, var5);
            } else {
                char var11 = '{';
                String var6 = "age";
                if (!var9.isEnabled(33554432)) {
                    Integer var12 = var10.getAge();
                    if (var12 == null) {
                        if (var9.isEnabled(260)) {
                            var9.write(var11);
                            var9.writeFieldNameDirect(var6);
                            var9.writeNull(0, 256);
                            var11 = ',';
                        }
                    } else {
                        var9.write(var11);
                        var9.writeFieldNameDirect(var6);
                        var1.writeWithFieldName(var12, var6, this.age_asm_fieldType, 0);
                        var11 = ',';
                    }
                }

                var6 = "birthday";
                String var13 = var10.getBirthday();
                if (var13 == null) {
                    if (var9.isEnabled(132)) {
                        var9.write(var11);
                        var9.writeFieldNameDirect(var6);
                        var9.writeNull(0, 128);
                        var11 = ',';
                    }
                } else {
                    var9.writeFieldValueStringWithDoubleQuoteCheck(var11, var6, var13);
                    var11 = ',';
                }

                var6 = "department";
                var13 = var10.getDepartment();
                if (var13 == null) {
                    if (var9.isEnabled(132)) {
                        var9.write(var11);
                        var9.writeFieldNameDirect(var6);
                        var9.writeNull(0, 128);
                        var11 = ',';
                    }
                } else {
                    var9.writeFieldValueStringWithDoubleQuoteCheck(var11, var6, var13);
                    var11 = ',';
                }

                var6 = "girlFriend";
                UserInfo var19 = var10.getGirlFriend();
                if (var19 == null) {
                    if (var9.isEnabled(964)) {
                        var9.write(var11);
                        var9.writeFieldNameDirect(var6);
                        var9.writeNull(0, 0);
                        var11 = ',';
                    }
                } else {
                    var9.write(var11);
                    var9.writeFieldNameDirect(var6);
                    if (var19.getClass() == UserInfo.class) {
                        if (this.girlFriend_asm_ser_ == null) {
                            this.girlFriend_asm_ser_ = var1.getObjectWriter(UserInfo.class);
                        }

                        ObjectSerializer var14 = this.girlFriend_asm_ser_;
                        if (var14 instanceof JavaBeanSerializer) {
                            ((JavaBeanSerializer)var14).writeDirectNonContext(var1, var19, var6, this.girlFriend_asm_fieldType, 0);
                        } else {
                            var14.write(var1, var19, var6, this.girlFriend_asm_fieldType, 0);
                        }
                    } else {
                        var1.writeWithFieldName(var19, var6, this.girlFriend_asm_fieldType, 0);
                    }

                    var11 = ',';
                }

                var6 = "hobby";
                List var15 = (List)var10.getHobby();
                if (var15 == null) {
                    if (var9.isEnabled(68)) {
                        var9.write(var11);
                        var9.writeFieldNameDirect(var6);
                        var9.writeNull(0, 64);
                        var11 = ',';
                    }
                } else {
                    var9.write(var11);
                    var9.writeFieldNameDirect(var6);
                    int var16 = var15.size();
                    if (var16 == 0) {
                        var9.write("[]");
                    } else {
                        var9.write(var15);
                        var1.popContext();
                    }

                    var11 = ',';
                }

                var6 = "iQiYiId";
                var13 = var10.getiQiYiId();
                if (var13 == null) {
                    if (var9.isEnabled(132)) {
                        var9.write(var11);
                        var9.writeFieldNameDirect(var6);
                        var9.writeNull(0, 128);
                        var11 = ',';
                    }
                } else {
                    var9.writeFieldValueStringWithDoubleQuoteCheck(var11, var6, var13);
                    var11 = ',';
                }

                var6 = "name";
                var13 = var10.getName();
                if (var13 == null) {
                    if (var9.isEnabled(132)) {
                        var9.write(var11);
                        var9.writeFieldNameDirect(var6);
                        var9.writeNull(0, 128);
                        var11 = ',';
                    }
                } else {
                    var9.writeFieldValueStringWithDoubleQuoteCheck(var11, var6, var13);
                    var11 = ',';
                }

                var6 = "sex";
                var13 = var10.getSex();
                if (var13 == null) {
                    if (var9.isEnabled(132)) {
                        var9.write(var11);
                        var9.writeFieldNameDirect(var6);
                        var9.writeNull(0, 128);
                        var11 = ',';
                    }
                } else {
                    var9.writeFieldValueStringWithDoubleQuoteCheck(var11, var6, var13);
                    var11 = ',';
                }

                var6 = "single";
                Boolean var20 = var10.getSingle();
                if (var20 == null) {
                    if (var9.isEnabled(516)) {
                        var9.write(var11);
                        var9.writeFieldNameDirect(var6);
                        var9.writeNull(0, 512);
                        var11 = ',';
                    }
                } else {
                    var9.write(var11);
                    var9.writeFieldNameDirect(var6);
                    var1.writeWithFieldName(var20, var6, this.single_asm_fieldType, 0);
                    var11 = ',';
                }

                if (var11 == '{') {
                    var9.write(123);
                }

                var9.write(125);
            }
        }
    }

    public void writeUnsorted(JSONSerializer var1, Object var2, Object var3, Type var4, int var5) throws IOException {
        SerializeWriter var9 = var1.out;
        UserInfo var10 = (UserInfo)var2;
        if (!var9.isEnabled(8192) && !var9.isEnabled(134217728)) {
            if (!this.writeReference(var1, var2, var5)) {
                if (var9.isEnabled(2097152)) {
                    this.writeAsArrayNormal(var1, var2, var3, var4, var5);
                } else {
                    SerialContext var11 = var1.getContext();
                    var1.setContext(var11, var2, var3, 0);
                    byte var10000;
                    if (var1.isWriteClassName(var4, var2) && var4 != var2.getClass()) {
                        var9.write(123);
                        this.writeClassName(var1, (String)null, var2);
                        var10000 = 44;
                    } else {
                        var10000 = 123;
                    }

                    char var12 = (char)var10000;
                    char var26 = this.writeBefore(var1, var2, var12);
                    boolean var13 = var9.isNotWriteDefaultValue();
                    var1.checkValue(this);
                    boolean var15 = var1.hasNameFilters(this);
                    String var6 = "name";
                    Object var8;
                    String var16;
                    if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                        var16 = var10.getName();
                        if (var13) {
                        }

                        if (this.apply(var1, var2, var6, var16)) {
                            if (var15) {
                                var6 = this.processKey(var1, var2, var6, var16);
                            }

                            var8 = this.processValue(var1, this.getBeanContext(6), var2, var6, var16);
                            if (var16 != var8) {
                                if (var8 == null) {
                                    if (var9.isEnabled(132)) {
                                        var9.write(var26);
                                        var9.writeFieldName(var6, false);
                                        var9.writeNull(0, 128);
                                        var26 = ',';
                                    }
                                } else {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var1.writeWithFieldName(var8, var6, String.class, 0);
                                    var26 = ',';
                                }
                            } else if (var16 == null) {
                                if (var9.isEnabled(132)) {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var9.writeNull(0, 128);
                                    var26 = ',';
                                }
                            } else {
                                var9.writeFieldValue(var26, var6, var16);
                                var26 = ',';
                            }
                        }
                    }

                    var6 = "birthday";
                    if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                        var16 = var10.getBirthday();
                        if (var13) {
                        }

                        if (this.apply(var1, var2, var6, var16)) {
                            if (var15) {
                                var6 = this.processKey(var1, var2, var6, var16);
                            }

                            var8 = this.processValue(var1, this.getBeanContext(1), var2, var6, var16);
                            if (var16 != var8) {
                                if (var8 == null) {
                                    if (var9.isEnabled(132)) {
                                        var9.write(var26);
                                        var9.writeFieldName(var6, false);
                                        var9.writeNull(0, 128);
                                        var26 = ',';
                                    }
                                } else {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var1.writeWithFieldName(var8, var6, String.class, 0);
                                    var26 = ',';
                                }
                            } else if (var16 == null) {
                                if (var9.isEnabled(132)) {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var9.writeNull(0, 128);
                                    var26 = ',';
                                }
                            } else {
                                var9.writeFieldValue(var26, var6, var16);
                                var26 = ',';
                            }
                        }
                    }

                    var6 = "hobby";
                    ObjectSerializer var19;
                    if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                        List var18 = (List)var10.getHobby();
                        if (var13) {
                        }

                        if (this.apply(var1, var2, var6, var18)) {
                            if (var15) {
                                var6 = this.processKey(var1, var2, var6, var18);
                            }

                            var8 = this.processValue(var1, this.getBeanContext(4), var2, var6, var18);
                            if (var18 != var8) {
                                if (var8 == null) {
                                    if (var9.isEnabled(68)) {
                                        var9.write(var26);
                                        var9.writeFieldName(var6, false);
                                        var9.writeNull(0, 64);
                                        var26 = ',';
                                    }
                                } else {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    if (var8.getClass() == List.class) {
                                        if (this.hobby_asm_ser_ == null) {
                                            this.hobby_asm_ser_ = var1.getObjectWriter(List.class);
                                        }

                                        var19 = this.hobby_asm_ser_;
                                        if (var19 instanceof JavaBeanSerializer) {
                                            ((JavaBeanSerializer)var19).write(var1, var8, var6, this.hobby_asm_fieldType, 0);
                                        } else {
                                            var19.write(var1, var8, var6, this.hobby_asm_fieldType, 0);
                                        }
                                    } else {
                                        var1.writeWithFieldName(var8, var6, this.hobby_asm_fieldType, 0);
                                    }

                                    var26 = ',';
                                }
                            } else if (var18 == null) {
                                if (var9.isEnabled(68)) {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var9.writeNull(0, 64);
                                    var26 = ',';
                                }
                            } else {
                                var9.write(var26);
                                var9.writeFieldName(var6, false);
                                int var20 = var18.size();
                                if (var20 == 0) {
                                    var9.write("[]");
                                } else {
                                    var1.setContext(var18, var6);
                                    var9.write(91);

                                    for(int var21 = 0; var21 < var20; ++var21) {
                                        if (var21 != 0) {
                                            var9.write(44);
                                        }

                                        Object var22 = var18.get(var21);
                                        if (var22 == null) {
                                            var9.writeNull();
                                        } else if (var22.getClass() == String.class) {
                                            if (this.hobby_asm_list_item_ser_ == null) {
                                                this.hobby_asm_list_item_ser_ = var1.getObjectWriter(String.class);
                                            }

                                            ObjectSerializer var23 = this.hobby_asm_list_item_ser_;
                                            var23.write(var1, var22, var21, String.class, 0);
                                        } else {
                                            var1.writeWithFieldName(var22, var21, String.class, 0);
                                        }
                                    }

                                    var9.write(93);
                                    var1.popContext();
                                }

                                var26 = ',';
                            }
                        }
                    }

                    var6 = "girlFriend";
                    if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                        UserInfo var17 = var10.getGirlFriend();
                        if (var13) {
                        }

                        if (this.apply(var1, var2, var6, var17)) {
                            if (var15) {
                                var6 = this.processKey(var1, var2, var6, var17);
                            }

                            var8 = this.processValue(var1, this.getBeanContext(3), var2, var6, var17);
                            if (var17 != var8) {
                                if (var8 == null) {
                                    if (var9.isEnabled(964)) {
                                        var9.write(var26);
                                        var9.writeFieldName(var6, false);
                                        var9.writeNull(0, 0);
                                        var26 = ',';
                                    }
                                } else {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    if (var8.getClass() == UserInfo.class) {
                                        if (this.girlFriend_asm_ser_ == null) {
                                            this.girlFriend_asm_ser_ = var1.getObjectWriter(UserInfo.class);
                                        }

                                        var19 = this.girlFriend_asm_ser_;
                                        if (var19 instanceof JavaBeanSerializer) {
                                            ((JavaBeanSerializer)var19).write(var1, var8, var6, this.girlFriend_asm_fieldType, 0);
                                        } else {
                                            var19.write(var1, var8, var6, this.girlFriend_asm_fieldType, 0);
                                        }
                                    } else {
                                        var1.writeWithFieldName(var8, var6, this.girlFriend_asm_fieldType, 0);
                                    }

                                    var26 = ',';
                                }
                            } else if (var8 == null) {
                                if (var9.isEnabled(964)) {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var9.writeNull(0, 0);
                                    var26 = ',';
                                }
                            } else {
                                var9.write(var26);
                                var9.writeFieldName(var6, false);
                                if (var8.getClass() == UserInfo.class) {
                                    if (this.girlFriend_asm_ser_ == null) {
                                        this.girlFriend_asm_ser_ = var1.getObjectWriter(UserInfo.class);
                                    }

                                    var19 = this.girlFriend_asm_ser_;
                                    if (var19 instanceof JavaBeanSerializer) {
                                        ((JavaBeanSerializer)var19).write(var1, var8, var6, this.girlFriend_asm_fieldType, 0);
                                    } else {
                                        var19.write(var1, var8, var6, this.girlFriend_asm_fieldType, 0);
                                    }
                                } else {
                                    var1.writeWithFieldName(var8, var6, this.girlFriend_asm_fieldType, 0);
                                }

                                var26 = ',';
                            }
                        }
                    }

                    var6 = "sex";
                    if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                        var16 = var10.getSex();
                        if (var13) {
                        }

                        if (this.apply(var1, var2, var6, var16)) {
                            if (var15) {
                                var6 = this.processKey(var1, var2, var6, var16);
                            }

                            var8 = this.processValue(var1, this.getBeanContext(7), var2, var6, var16);
                            if (var16 != var8) {
                                if (var8 == null) {
                                    if (var9.isEnabled(132)) {
                                        var9.write(var26);
                                        var9.writeFieldName(var6, false);
                                        var9.writeNull(0, 128);
                                        var26 = ',';
                                    }
                                } else {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var1.writeWithFieldName(var8, var6, String.class, 0);
                                    var26 = ',';
                                }
                            } else if (var16 == null) {
                                if (var9.isEnabled(132)) {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var9.writeNull(0, 128);
                                    var26 = ',';
                                }
                            } else {
                                var9.writeFieldValue(var26, var6, var16);
                                var26 = ',';
                            }
                        }
                    }

                    var6 = "iQiYiId";
                    if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                        var16 = var10.getiQiYiId();
                        if (var13) {
                        }

                        if (this.apply(var1, var2, var6, var16)) {
                            if (var15) {
                                var6 = this.processKey(var1, var2, var6, var16);
                            }

                            var8 = this.processValue(var1, this.getBeanContext(5), var2, var6, var16);
                            if (var16 != var8) {
                                if (var8 == null) {
                                    if (var9.isEnabled(132)) {
                                        var9.write(var26);
                                        var9.writeFieldName(var6, false);
                                        var9.writeNull(0, 128);
                                        var26 = ',';
                                    }
                                } else {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var1.writeWithFieldName(var8, var6, String.class, 0);
                                    var26 = ',';
                                }
                            } else if (var16 == null) {
                                if (var9.isEnabled(132)) {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var9.writeNull(0, 128);
                                    var26 = ',';
                                }
                            } else {
                                var9.writeFieldValue(var26, var6, var16);
                                var26 = ',';
                            }
                        }
                    }

                    var6 = "age";
                    if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "") && !var9.isEnabled(33554432)) {
                        Integer var27 = var10.getAge();
                        if (var13) {
                        }

                        if (this.apply(var1, var2, var6, var27)) {
                            if (var15) {
                                var6 = this.processKey(var1, var2, var6, var27);
                            }

                            var8 = this.processValue(var1, this.getBeanContext(0), var2, var6, var27);
                            if (var27 != var8) {
                                if (var8 == null) {
                                    if (var9.isEnabled(260)) {
                                        var9.write(var26);
                                        var9.writeFieldName(var6, false);
                                        var9.writeNull(0, 256);
                                        var26 = ',';
                                    }
                                } else {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var1.writeWithFieldName(var8, var6, this.age_asm_fieldType, 0);
                                    var26 = ',';
                                }
                            } else if (var8 == null) {
                                if (var9.isEnabled(260)) {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var9.writeNull(0, 256);
                                    var26 = ',';
                                }
                            } else {
                                var9.write(var26);
                                var9.writeFieldName(var6, false);
                                var1.writeWithFieldName(var8, var6, this.age_asm_fieldType, 0);
                                var26 = ',';
                            }
                        }
                    }

                    var6 = "department";
                    if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                        var16 = var10.getDepartment();
                        if (var13) {
                        }

                        if (this.apply(var1, var2, var6, var16)) {
                            if (var15) {
                                var6 = this.processKey(var1, var2, var6, var16);
                            }

                            var8 = this.processValue(var1, this.getBeanContext(2), var2, var6, var16);
                            if (var16 != var8) {
                                if (var8 == null) {
                                    if (var9.isEnabled(132)) {
                                        var9.write(var26);
                                        var9.writeFieldName(var6, false);
                                        var9.writeNull(0, 128);
                                        var26 = ',';
                                    }
                                } else {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var1.writeWithFieldName(var8, var6, String.class, 0);
                                    var26 = ',';
                                }
                            } else if (var16 == null) {
                                if (var9.isEnabled(132)) {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var9.writeNull(0, 128);
                                    var26 = ',';
                                }
                            } else {
                                var9.writeFieldValue(var26, var6, var16);
                                var26 = ',';
                            }
                        }
                    }

                    var6 = "single";
                    if (this.applyName(var1, var2, var6) && this.applyLabel(var1, "")) {
                        Boolean var28 = var10.getSingle();
                        if (var13) {
                        }

                        if (this.apply(var1, var2, var6, var28)) {
                            if (var15) {
                                var6 = this.processKey(var1, var2, var6, var28);
                            }

                            var8 = this.processValue(var1, this.getBeanContext(8), var2, var6, var28);
                            if (var28 != var8) {
                                if (var8 == null) {
                                    if (var9.isEnabled(516)) {
                                        var9.write(var26);
                                        var9.writeFieldName(var6, false);
                                        var9.writeNull(0, 512);
                                        var26 = ',';
                                    }
                                } else {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var1.writeWithFieldName(var8, var6, this.single_asm_fieldType, 0);
                                    var26 = ',';
                                }
                            } else if (var8 == null) {
                                if (var9.isEnabled(516)) {
                                    var9.write(var26);
                                    var9.writeFieldName(var6, false);
                                    var9.writeNull(0, 512);
                                    var26 = ',';
                                }
                            } else {
                                var9.write(var26);
                                var9.writeFieldName(var6, false);
                                var1.writeWithFieldName(var8, var6, this.single_asm_fieldType, 0);
                                var26 = ',';
                            }
                        }
                    }

                    var26 = this.writeAfter(var1, var2, var26);
                    if (var26 == '{') {
                        var9.write(123);
                    }

                    var9.write(125);
                    var1.setContext(var11);
                }
            }
        } else {
            super.write(var1, var2, var3, var4, var5);
        }
    }

    public void writeAsArray(JSONSerializer var1, Object var2, Object var3, Type var4, int var5) throws IOException {
        SerializeWriter var9 = var1.out;
        UserInfo var10 = (UserInfo)var2;
        if (!var1.hasPropertyFilters(this)) {
            super.writeNoneASM(var1, var2, var3, var4, var5);
        } else {
            var9.write(91);
            String var6 = "age";
            Integer var11;
            ObjectSerializer var12;
            if ((var11 = var10.getAge()) == null) {
                var9.writeNull();
            } else if (var11.getClass() == Integer.class) {
                if (this.age_asm_ser_ == null) {
                    this.age_asm_ser_ = var1.getObjectWriter(Integer.class);
                }

                var12 = this.age_asm_ser_;
                if (var12 instanceof JavaBeanSerializer) {
                    ((JavaBeanSerializer)var12).writeAsArrayNonContext(var1, var11, var6, Integer.class, 0);
                } else {
                    var12.write(var1, var11, var6, Integer.class, 0);
                }
            } else {
                var1.writeWithFieldName(var11, var6, this.age_asm_fieldType, 0);
            }

            var9.write(44);
            var6 = "birthday";
            var9.writeString(var10.getBirthday(), ',');
            var6 = "department";
            var9.writeString(var10.getDepartment(), ',');
            var6 = "girlFriend";
            UserInfo var13;
            if ((var13 = var10.getGirlFriend()) == null) {
                var9.writeNull();
            } else if (var13.getClass() == UserInfo.class) {
                if (this.girlFriend_asm_ser_ == null) {
                    this.girlFriend_asm_ser_ = var1.getObjectWriter(UserInfo.class);
                }

                var12 = this.girlFriend_asm_ser_;
                if (var12 instanceof JavaBeanSerializer) {
                    ((JavaBeanSerializer)var12).writeAsArrayNonContext(var1, var13, var6, UserInfo.class, 0);
                } else {
                    var12.write(var1, var13, var6, UserInfo.class, 0);
                }
            } else {
                var1.writeWithFieldName(var13, var6, this.girlFriend_asm_fieldType, 0);
            }

            var9.write(44);
            var6 = "hobby";
            List var14 = (List)var10.getHobby();
            var9.write(var14);
            var9.write(44);
            var6 = "iQiYiId";
            var9.writeString(var10.getiQiYiId(), ',');
            var6 = "name";
            var9.writeString(var10.getName(), ',');
            var6 = "sex";
            var9.writeString(var10.getSex(), ',');
            var6 = "single";
            Boolean var15;
            if ((var15 = var10.getSingle()) == null) {
                var9.writeNull();
            } else if (var15.getClass() == Boolean.class) {
                if (this.single_asm_ser_ == null) {
                    this.single_asm_ser_ = var1.getObjectWriter(Boolean.class);
                }

                var12 = this.single_asm_ser_;
                if (var12 instanceof JavaBeanSerializer) {
                    ((JavaBeanSerializer)var12).writeAsArrayNonContext(var1, var15, var6, Boolean.class, 0);
                } else {
                    var12.write(var1, var15, var6, Boolean.class, 0);
                }
            } else {
                var1.writeWithFieldName(var15, var6, this.single_asm_fieldType, 0);
            }

            var9.write(93);
        }
    }

    public void writeAsArrayNormal(JSONSerializer var1, Object var2, Object var3, Type var4, int var5) throws IOException {
        SerializeWriter var9 = var1.out;
        UserInfo var10 = (UserInfo)var2;
        if (!var1.hasPropertyFilters(this)) {
            super.writeNoneASM(var1, var2, var3, var4, var5);
        } else {
            var9.write(91);
            String var6 = "age";
            Integer var11;
            ObjectSerializer var12;
            if ((var11 = var10.getAge()) == null) {
                var9.writeNull();
            } else if (var11.getClass() == Integer.class) {
                if (this.age_asm_ser_ == null) {
                    this.age_asm_ser_ = var1.getObjectWriter(Integer.class);
                }

                var12 = this.age_asm_ser_;
                var12.write(var1, var11, var6, Integer.class, 0);
            } else {
                var1.writeWithFieldName(var11, var6, this.age_asm_fieldType, 0);
            }

            var9.write(44);
            var6 = "birthday";
            var9.writeString(var10.getBirthday(), ',');
            var6 = "department";
            var9.writeString(var10.getDepartment(), ',');
            var6 = "girlFriend";
            UserInfo var13;
            if ((var13 = var10.getGirlFriend()) == null) {
                var9.writeNull();
            } else if (var13.getClass() == UserInfo.class) {
                if (this.girlFriend_asm_ser_ == null) {
                    this.girlFriend_asm_ser_ = var1.getObjectWriter(UserInfo.class);
                }

                var12 = this.girlFriend_asm_ser_;
                var12.write(var1, var13, var6, UserInfo.class, 0);
            } else {
                var1.writeWithFieldName(var13, var6, this.girlFriend_asm_fieldType, 0);
            }

            var9.write(44);
            var6 = "hobby";
            List var14 = (List)var10.getHobby();
            if (var14 == null) {
                var9.writeNull();
            } else {
                int var15 = var14.size();
                var9.write(91);

                for(int var16 = 0; var16 < var15; ++var16) {
                    if (var16 != 0) {
                        var9.write(44);
                    }

                    Object var17 = var14.get(var16);
                    if (var17 == null) {
                        var9.writeNull();
                    } else if (var17.getClass() == String.class) {
                        if (this.hobby_asm_list_item_ser_ == null) {
                            this.hobby_asm_list_item_ser_ = var1.getObjectWriter(String.class);
                        }

                        ObjectSerializer var18 = this.hobby_asm_list_item_ser_;
                        var18.write(var1, var17, var16, String.class, 0);
                    } else {
                        var1.writeWithFieldName(var17, var16, String.class, 0);
                    }
                }

                var9.write(93);
            }

            var9.write(44);
            var6 = "iQiYiId";
            var9.writeString(var10.getiQiYiId(), ',');
            var6 = "name";
            var9.writeString(var10.getName(), ',');
            var6 = "sex";
            var9.writeString(var10.getSex(), ',');
            var6 = "single";
            Boolean var19;
            if ((var19 = var10.getSingle()) == null) {
                var9.writeNull();
            } else if (var19.getClass() == Boolean.class) {
                if (this.single_asm_ser_ == null) {
                    this.single_asm_ser_ = var1.getObjectWriter(Boolean.class);
                }

                var12 = this.single_asm_ser_;
                var12.write(var1, var19, var6, Boolean.class, 0);
            } else {
                var1.writeWithFieldName(var19, var6, this.single_asm_fieldType, 0);
            }

            var9.write(93);
        }
    }

    public void writeAsArrayNonContext(JSONSerializer var1, Object var2, Object var3, Type var4, int var5) throws IOException {
        SerializeWriter var9 = var1.out;
        UserInfo var10 = (UserInfo)var2;
        if (!var1.hasPropertyFilters(this)) {
            super.writeNoneASM(var1, var2, var3, var4, var5);
        } else {
            var9.write(91);
            String var6 = "age";
            Integer var11;
            ObjectSerializer var12;
            if ((var11 = var10.getAge()) == null) {
                var9.writeNull();
            } else if (var11.getClass() == Integer.class) {
                if (this.age_asm_ser_ == null) {
                    this.age_asm_ser_ = var1.getObjectWriter(Integer.class);
                }

                var12 = this.age_asm_ser_;
                if (var12 instanceof JavaBeanSerializer) {
                    ((JavaBeanSerializer)var12).writeAsArrayNonContext(var1, var11, var6, Integer.class, 0);
                } else {
                    var12.write(var1, var11, var6, Integer.class, 0);
                }
            } else {
                var1.writeWithFieldName(var11, var6, this.age_asm_fieldType, 0);
            }

            var9.write(44);
            var6 = "birthday";
            var9.writeString(var10.getBirthday(), ',');
            var6 = "department";
            var9.writeString(var10.getDepartment(), ',');
            var6 = "girlFriend";
            UserInfo var13;
            if ((var13 = var10.getGirlFriend()) == null) {
                var9.writeNull();
            } else if (var13.getClass() == UserInfo.class) {
                if (this.girlFriend_asm_ser_ == null) {
                    this.girlFriend_asm_ser_ = var1.getObjectWriter(UserInfo.class);
                }

                var12 = this.girlFriend_asm_ser_;
                if (var12 instanceof JavaBeanSerializer) {
                    ((JavaBeanSerializer)var12).writeAsArrayNonContext(var1, var13, var6, UserInfo.class, 0);
                } else {
                    var12.write(var1, var13, var6, UserInfo.class, 0);
                }
            } else {
                var1.writeWithFieldName(var13, var6, this.girlFriend_asm_fieldType, 0);
            }

            var9.write(44);
            var6 = "hobby";
            List var14 = (List)var10.getHobby();
            var9.write(var14);
            var9.write(44);
            var6 = "iQiYiId";
            var9.writeString(var10.getiQiYiId(), ',');
            var6 = "name";
            var9.writeString(var10.getName(), ',');
            var6 = "sex";
            var9.writeString(var10.getSex(), ',');
            var6 = "single";
            Boolean var15;
            if ((var15 = var10.getSingle()) == null) {
                var9.writeNull();
            } else if (var15.getClass() == Boolean.class) {
                if (this.single_asm_ser_ == null) {
                    this.single_asm_ser_ = var1.getObjectWriter(Boolean.class);
                }

                var12 = this.single_asm_ser_;
                if (var12 instanceof JavaBeanSerializer) {
                    ((JavaBeanSerializer)var12).writeAsArrayNonContext(var1, var15, var6, Boolean.class, 0);
                } else {
                    var12.write(var1, var15, var6, Boolean.class, 0);
                }
            } else {
                var1.writeWithFieldName(var15, var6, this.single_asm_fieldType, 0);
            }

            var9.write(93);
        }
    }
}
