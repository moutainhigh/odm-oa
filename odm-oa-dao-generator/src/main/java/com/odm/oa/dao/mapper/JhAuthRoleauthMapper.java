package com.odm.oa.dao.mapper;

import com.odm.oa.dao.pojo.JhAuthRoleauth;
import java.util.List;

public interface JhAuthRoleauthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_RoleAuth
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_RoleAuth
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int insert(JhAuthRoleauth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_RoleAuth
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    JhAuthRoleauth selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_RoleAuth
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    List<JhAuthRoleauth> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_RoleAuth
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int updateByPrimaryKey(JhAuthRoleauth record);
}