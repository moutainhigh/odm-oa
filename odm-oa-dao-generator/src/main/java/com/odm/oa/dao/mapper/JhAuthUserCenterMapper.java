package com.odm.oa.dao.mapper;

import com.odm.oa.dao.pojo.JhAuthUserCenter;
import java.util.List;

public interface JhAuthUserCenterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_User_Center
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_User_Center
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int insert(JhAuthUserCenter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_User_Center
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    JhAuthUserCenter selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_User_Center
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    List<JhAuthUserCenter> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_User_Center
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int updateByPrimaryKey(JhAuthUserCenter record);
}