/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LoginServiceImpl
 * Author:   Amber
 * Date:     2018/11/7 2:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.aixinli.service.impl;

import com.aixinli.mapper.DoctorMapper;
import com.aixinli.pojo.Doctor;
import com.aixinli.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Amber
 * @create 2018/11/7
 * @since 1.0.0
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private DoctorMapper doctorMapper;
    @Override
    public int addUser(Doctor doctor) {
        return doctorMapper.addUser(doctor);
    }

    @Override
    public List<Doctor> selUser(Doctor doctor) {
        return doctorMapper.selUser(doctor);
    }
}
