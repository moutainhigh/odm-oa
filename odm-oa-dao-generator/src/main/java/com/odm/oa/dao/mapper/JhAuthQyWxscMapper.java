package com.odm.oa.dao.mapper;

import com.odm.oa.dao.pojo.JhAuthQyWxsc;
import java.util.List;

public interface JhAuthQyWxscMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_QY_WXSC
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_QY_WXSC
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int insert(JhAuthQyWxsc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_QY_WXSC
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    JhAuthQyWxsc selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_QY_WXSC
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    List<JhAuthQyWxsc> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JH_Auth_QY_WXSC
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int updateByPrimaryKey(JhAuthQyWxsc record);
}