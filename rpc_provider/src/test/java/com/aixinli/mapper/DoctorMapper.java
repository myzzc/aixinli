/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: DoctorMapper
 * Author:   Amber
 * Date:     2018/11/6 23:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.aixinli.mapper;

import com.aixinli.pojo.Doctor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Amber
 * @create 2018/11/6
 * @since 1.0.0
 */
@Mapper
public interface DoctorMapper {

    /**
     *新增用户
     * @param doctor
     * @return
     */
    @Insert("insert into doctor values ()")
    public int addUser(Doctor doctor);

    /**
     * 修改用户信息
     * @param doctor
     * @return
     */
    public int updateUser(Doctor doctor);

    /**
     * 查询用户信息
     * @param doctor
     * @return
     */
    public List<Doctor> selUser(Doctor doctor);
}
