package com.odm.oa.dao.mapper;

import com.odm.oa.dao.pojo.JhAuthLog;
import java.util.List;

public interface JhAuthLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Log
     *
     * @mbggenerated Tue Jul 10 00:35:47 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Log
     *
     * @mbggenerated Tue Jul 10 00:35:47 CST 2018
     */
    int insert(JhAuthLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Log
     *
     * @mbggenerated Tue Jul 10 00:35:47 CST 2018
     */
    JhAuthLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Log
     *
     * @mbggenerated Tue Jul 10 00:35:47 CST 2018
     */
    List<JhAuthLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Log
     *
     * @mbggenerated Tue Jul 10 00:35:47 CST 2018
     */
    int updateByPrimaryKey(JhAuthLog record);
}