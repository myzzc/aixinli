/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Doctor
 * Author:   Amber
 * Date:     2018/11/6 23:10
 * Description: 对应数据库的咨询师基本信息表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.aixinli.pojo;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈对应数据库的咨询师基本信息表〉
 *
 * @author Amber
 * @create 2018/11/6
 * @since 1.0.0
 */
public class Doctor implements Serializable {

    private int id;//自增主键，无意义
    private String username;//用户名
    private String password;//密码
    private String name;//真实姓名
    private String phoneNumber;//联系方式
    private String sex;//性别

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Doctor() {
    }

    public Doctor(String username, String password, String name, String phoneNumber, String sex) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }
}
