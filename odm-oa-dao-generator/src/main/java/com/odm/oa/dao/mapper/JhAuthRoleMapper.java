package com.odm.oa.dao.mapper;

import com.odm.oa.dao.pojo.JhAuthRole;
import java.util.List;

public interface JhAuthRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Role
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int deleteByPrimaryKey(Integer roleCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Role
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int insert(JhAuthRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Role
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    JhAuthRole selectByPrimaryKey(Integer roleCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Role
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    List<JhAuthRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Role
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int updateByPrimaryKey(JhAuthRole record);
}