package io.github.tanghuibo.jsontest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.NameFilter;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.ValueFilter;
import io.github.tanghuibo.jsontest.bean.UserInfo;
import org.junit.Test;

import java.util.Arrays;

/**
 * NameFilterTest
 *
 * @author tanghuibo
 * @date 2021/11/1 21:25
 */
public class ReadFilterTest {

    @Test
    public void fastJson() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("唐汇波");
        userInfo.setBirthday("1996-05-07");
        userInfo.setDepartment("海外事业部");
        userInfo.setSex("男");
        userInfo.setSingle(true);
        userInfo.setGirlFriend(null);
        userInfo.setHobby(Arrays.asList("唱", "跳", "rap", "篮球"));
        userInfo.setiQiYiId("19384");

        NameFilter nameFilter = (object, name, value) -> "iQiYiId".equals(name) ? "iqyId" : name;

        ValueFilter valueFilter = (object, name, value) -> {
            if("age".equals(name)) {
                return 18;
            }
            if("birthday".equals(name)) {
                return null;
            }
            if("girlFriend".equals(name)) {
                return "lyf";
            }
            if("department".equals(name)) {
                return "前途一片光明的" + value;
            }
            return value;
        };
        System.out.println(JSON.toJSONString(userInfo, new SerializeFilter[]{nameFilter, valueFilter}));
    }

}
