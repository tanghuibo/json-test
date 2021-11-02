package io.github.tanghuibo.jsontest.bean;

import java.util.List;

/**
 * UserInfo
 *
 * @author tanghuibo
 * @date 2021/11/1 21:34
 */
public class UserInfo {

    private String name;
    private String birthday;
    private String department;
    private List<String> hobby;
    private String sex;
    private Boolean single;
    private UserInfo girlFriend;
    private String iQiYiId;

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSingle(Boolean single) {
        this.single = single;
    }

    public Boolean getSingle() {
        return single;
    }

    public void setGirlFriend(UserInfo girlFriend) {
        this.girlFriend = girlFriend;
    }

    public UserInfo getGirlFriend() {
        return girlFriend;
    }

    public void setiQiYiId(String iQiYiId) {
        this.iQiYiId = iQiYiId;
    }

    public String getiQiYiId() {
        return iQiYiId;
    }

    public Integer getAge() {
        return 27;
    }
}
