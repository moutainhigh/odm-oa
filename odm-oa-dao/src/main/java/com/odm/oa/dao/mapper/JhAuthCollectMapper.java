package com.odm.oa.dao.mapper;

import com.odm.oa.dao.pojo.JhAuthCollect;
import java.util.List;

public interface JhAuthCollectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Collect
     *
     * @mbggenerated Tue Jul 10 00:35:47 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Collect
     *
     * @mbggenerated Tue Jul 10 00:35:47 CST 2018
     */
    int insert(JhAuthCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Collect
     *
     * @mbggenerated Tue Jul 10 00:35:47 CST 2018
     */
    JhAuthCollect selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Collect
     *
     * @mbggenerated Tue Jul 10 00:35:47 CST 2018
     */
    List<JhAuthCollect> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_Collect
     *
     * @mbggenerated Tue Jul 10 00:35:47 CST 2018
     */
    int updateByPrimaryKey(JhAuthCollect record);
}