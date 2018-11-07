/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LoginService
 * Author:   Amber
 * Date:     2018/11/7 2:16
 * Description: 注册登录服务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.aixinli.service;

import com.aixinli.pojo.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈注册登录服务〉
 *
 * @author Amber
 * @create 2018/11/7
 * @since 1.0.0
 */
@Service
public interface LoginService {

    /**
     * 新增用户
     * @param doctor
     * @return
     */
    public int addUser(Doctor doctor);

    /**
     * 根据用户名和密码查找用户
     * @param doctor
     * @return
     */
    public List<Doctor> selUser(Doctor doctor);
}