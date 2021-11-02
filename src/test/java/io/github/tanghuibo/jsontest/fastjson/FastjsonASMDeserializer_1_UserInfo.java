package io.github.tanghuibo.jsontest.fastjson;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.JavaBeanInfo;
import io.github.tanghuibo.jsontest.bean.UserInfo;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FastjsonASMDeserializer_1_UserInfo extends JavaBeanDeserializer {
    public char[] name_asm_prefix__ = "\"name\":".toCharArray();
    public char[] birthday_asm_prefix__ = "\"birthday\":".toCharArray();
    public char[] department_asm_prefix__ = "\"department\":".toCharArray();
    public char[] single_asm_prefix__ = "\"single\":".toCharArray();
    public char[] iQiYiId_asm_prefix__ = "\"iQiYiId\":".toCharArray();
    public char[] hobby_asm_prefix__ = "\"hobby\":".toCharArray();
    public char[] sex_asm_prefix__ = "\"sex\":".toCharArray();
    public char[] girlFriend_asm_prefix__ = "\"girlFriend\":".toCharArray();
    public ObjectDeserializer name_asm_deser__;
    public ObjectDeserializer birthday_asm_deser__;
    public ObjectDeserializer department_asm_deser__;
    public ObjectDeserializer single_asm_deser__;
    public ObjectDeserializer iQiYiId_asm_deser__;
    public ObjectDeserializer hobby_asm_list_item_deser__;
    public ObjectDeserializer sex_asm_deser__;
    public ObjectDeserializer girlFriend_asm_deser__;

    public FastjsonASMDeserializer_1_UserInfo(ParserConfig var1, JavaBeanInfo var2) {
        super(var1, var2);
    }

    public Object createInstance(DefaultJSONParser var1, Type var2) {
        return new UserInfo();
    }

    public Object deserialze(DefaultJSONParser var1, Type var2, Object var3, int var4) {
        JSONLexerBase var5 = (JSONLexerBase)var1.lexer;
        if (var5.token() == 14 && var5.isEnabled(var4, 8192)) {
            return this.deserialzeArrayMapping(var1, var2, var3, (Object)null);
        } else if (var5.isEnabled(512) && var5.scanType("io.github.tanghuibo.jsontest.bean.UserInfo") != -1) {
            ParseContext var6 = var1.getContext();
            int var7 = 0;
            UserInfo var8 = new UserInfo();
            ParseContext var9 = var1.getContext();
            ParseContext var10 = var1.setContext(var9, var8, var3);
            if (var5.matchStat != 4) {
                boolean var11 = false;
                int var12 = 0;
                boolean var13 = var5.isEnabled(4096);
                String var10000;
                if (var13) {
                    var12 |= 1;
                    var10000 = var5.stringDefaultValue();
                } else {
                    var10000 = null;
                }

                String var14 = (String)var10000;
                if (var13) {
                    var12 |= 2;
                    var10000 = var5.stringDefaultValue();
                } else {
                    var10000 = null;
                }

                String var15 = (String)var10000;
                UserInfo var16 = (UserInfo)null;
                Object var17 = (List)null;
                if (var13) {
                    var12 |= 16;
                    var10000 = var5.stringDefaultValue();
                } else {
                    var10000 = null;
                }

                String var18 = (String)var10000;
                if (var13) {
                    var12 |= 32;
                    var10000 = var5.stringDefaultValue();
                } else {
                    var10000 = null;
                }

                String var19 = (String)var10000;
                if (var13) {
                    var12 |= 64;
                    var10000 = var5.stringDefaultValue();
                } else {
                    var10000 = null;
                }

                String var20 = (String)var10000;
                Boolean var21 = (Boolean)null;
                var14 = var5.scanFieldString(this.birthday_asm_prefix__);
                if (var5.matchStat > 0) {
                    var12 |= 1;
                }

                label231: {
                    if (var5.matchStat != -1) {
                        if (var5.matchStat > 0) {
                            ++var7;
                            if (var5.matchStat == 4) {
                                break label231;
                            }
                        }

                        var15 = var5.scanFieldString(this.department_asm_prefix__);
                        if (var5.matchStat > 0) {
                            var12 |= 2;
                        }

                        if (var5.matchStat != -1) {
                            if (var5.matchStat > 0) {
                                ++var7;
                                if (var5.matchStat == 4) {
                                    break label231;
                                }
                            }

                            ResolveTask var22;
                            if (!var5.matchField(this.girlFriend_asm_prefix__)) {
                                var16 = null;
                            } else {
                                var12 |= 4;
                                ++var7;
                                if (this.girlFriend_asm_deser__ == null) {
                                    this.girlFriend_asm_deser__ = var1.getConfig().getDeserializer(UserInfo.class);
                                }

                                var16 = (UserInfo)this.girlFriend_asm_deser__.deserialze(var1, UserInfo.class, "girlFriend");
                                if (var1.getResolveStatus() == 1) {
                                    var22 = var1.getLastResolveTask();
                                    var22.ownerContext = var1.getContext();
                                    var22.fieldDeserializer = this.getFieldDeserializer("girlFriend");
                                    var1.setResolveStatus(0);
                                }
                            }

                            var17 = var5.scanFieldStringArray(this.hobby_asm_prefix__, List.class);
                            if (var5.matchStat > 0) {
                                var12 |= 8;
                            }

                            if (var5.matchStat != -1) {
                                if (var5.matchStat > 0) {
                                    ++var7;
                                    if (var5.matchStat == 4) {
                                        break label231;
                                    }
                                }

                                var18 = var5.scanFieldString(this.iQiYiId_asm_prefix__);
                                if (var5.matchStat > 0) {
                                    var12 |= 16;
                                }

                                if (var5.matchStat != -1) {
                                    if (var5.matchStat > 0) {
                                        ++var7;
                                        if (var5.matchStat == 4) {
                                            break label231;
                                        }
                                    }

                                    var19 = var5.scanFieldString(this.name_asm_prefix__);
                                    if (var5.matchStat > 0) {
                                        var12 |= 32;
                                    }

                                    if (var5.matchStat != -1) {
                                        if (var5.matchStat > 0) {
                                            ++var7;
                                            if (var5.matchStat == 4) {
                                                break label231;
                                            }
                                        }

                                        var20 = var5.scanFieldString(this.sex_asm_prefix__);
                                        if (var5.matchStat > 0) {
                                            var12 |= 64;
                                        }

                                        if (var5.matchStat != -1) {
                                            if (var5.matchStat > 0) {
                                                ++var7;
                                                if (var5.matchStat == 4) {
                                                    break label231;
                                                }
                                            }

                                            if (!var5.matchField(this.single_asm_prefix__)) {
                                                var21 = null;
                                            } else {
                                                var12 |= 128;
                                                ++var7;
                                                if (this.single_asm_deser__ == null) {
                                                    this.single_asm_deser__ = var1.getConfig().getDeserializer(Boolean.class);
                                                }

                                                var21 = (Boolean)this.single_asm_deser__.deserialze(var1, Boolean.class, "single");
                                                if (var1.getResolveStatus() == 1) {
                                                    var22 = var1.getLastResolveTask();
                                                    var22.ownerContext = var1.getContext();
                                                    var22.fieldDeserializer = this.getFieldDeserializer("single");
                                                    var1.setResolveStatus(0);
                                                }
                                            }

                                            if (var7 > 0 && var5.token() == 13) {
                                                char var23;
                                                if ((var23 = var5.getCurrent()) == ',') {
                                                    var5.next();
                                                    var5.setToken(16);
                                                } else if (var23 == '}') {
                                                    var5.next();
                                                    var5.setToken(13);
                                                } else if (var23 == ']') {
                                                    var5.next();
                                                    var5.setToken(15);
                                                } else if (var23 == 26) {
                                                    var5.setToken(20);
                                                } else {
                                                    var5.nextToken();
                                                }
                                                break label231;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                    if ((var12 & 1) != 0) {
                        var8.setBirthday(var14);
                    }

                    if ((var12 & 2) != 0) {
                        var8.setDepartment(var15);
                    }

                    if ((var12 & 4) != 0) {
                        var8.setGirlFriend(var16);
                    }

                    if ((var12 & 8) != 0) {
                        var8.setHobby((List)var17);
                    }

                    if ((var12 & 16) != 0) {
                        var8.setiQiYiId(var18);
                    }

                    if ((var12 & 32) != 0) {
                        var8.setName(var19);
                    }

                    if ((var12 & 64) != 0) {
                        var8.setSex(var20);
                    }

                    if ((var12 & 128) != 0) {
                        var8.setSingle(var21);
                    }

                    return (UserInfo)this.parseRest(var1, var2, var3, var8, var4, new int[]{var12});
                }

                if ((var12 & 1) != 0) {
                    var8.setBirthday(var14);
                }

                if ((var12 & 2) != 0) {
                    var8.setDepartment(var15);
                }

                if ((var12 & 4) != 0) {
                    var8.setGirlFriend(var16);
                }

                if ((var12 & 8) != 0) {
                    var8.setHobby((List)var17);
                }

                if ((var12 & 16) != 0) {
                    var8.setiQiYiId(var18);
                }

                if ((var12 & 32) != 0) {
                    var8.setName(var19);
                }

                if ((var12 & 64) != 0) {
                    var8.setSex(var20);
                }

                if ((var12 & 128) != 0) {
                    var8.setSingle(var21);
                }
            }

            var1.setContext(var9);
            if (var10 != null) {
                var10.object = var8;
            }

            return var8;
        } else {
            return super.deserialze(var1, var2, var3, var4);
        }
    }

    public Object deserialzeArrayMapping(DefaultJSONParser var1, Type var2, Object var3, Object var4) {
        JSONLexerBase var17 = (JSONLexerBase)var1.lexer;
        String var5 = var17.scanTypeName(var1.getSymbolTable());
        if (var5 != null) {
            JavaBeanDeserializer var6 = JavaBeanDeserializer.getSeeAlso(var1.getConfig(), super.beanInfo, var5);
            if (var6 instanceof JavaBeanDeserializer) {
                return var6.deserialzeArrayMapping(var1, var2, var3, var17);
            }
        }

        UserInfo var7 = new UserInfo();
        String var8 = var17.scanString(',');
        String var9 = var17.scanString(',');
        if (var17.getCurrent() == '[') {
            var17.next();
            var17.setToken(14);
        } else {
            var17.nextToken(14);
        }

        if (this.girlFriend_asm_deser__ == null) {
            this.girlFriend_asm_deser__ = var1.getConfig().getDeserializer(UserInfo.class);
        }

        UserInfo var10 = (UserInfo)this.girlFriend_asm_deser__.deserialze(var1, UserInfo.class, "girlFriend");
        if (var17.token() != 15) {
            super.check(var17, 16);
        }

        ArrayList var11 = new ArrayList();
        var17.scanStringArray(var11, ',');
        if (var17.matchStat == 5) {
            var11 = null;
        }

        String var12 = var17.scanString(',');
        String var13 = var17.scanString(',');
        String var14 = var17.scanString(',');
        if (var17.getCurrent() == '[') {
            var17.next();
            var17.setToken(14);
        } else {
            var17.nextToken(14);
        }

        if (this.single_asm_deser__ == null) {
            this.single_asm_deser__ = var1.getConfig().getDeserializer(Boolean.class);
        }

        Boolean var15 = (Boolean)this.single_asm_deser__.deserialze(var1, Boolean.class, "single");
        if (var17.token() != 15) {
            super.check(var17, 15);
        }

        var7.setName(var13);
        var7.setBirthday(var8);
        var7.setDepartment(var9);
        var7.setSingle(var15);
        var7.setiQiYiId(var12);
        var7.setHobby((List)var11);
        var7.setSex(var14);
        var7.setGirlFriend(var10);
        char var16;
        if ((var16 = var17.getCurrent()) == ',') {
            var17.next();
            var17.setToken(16);
        } else if (var16 == ']') {
            var17.next();
            var17.setToken(15);
        } else if (var16 == 26) {
            var17.next();
            var17.setToken(20);
        } else {
            var17.nextToken(16);
        }

        return var7;
    }
}
