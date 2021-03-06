package com.odm.oa.dao.mapper;

import com.odm.oa.dao.pojo.CrmCustomerScale;
import java.util.List;

public interface CrmCustomerScaleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_customer_scale
     *
     * @mbggenerated Fri Jul 20 11:17:57 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_customer_scale
     *
     * @mbggenerated Fri Jul 20 11:17:57 CST 2018
     */
    int insert(CrmCustomerScale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_customer_scale
     *
     * @mbggenerated Fri Jul 20 11:17:57 CST 2018
     */
    CrmCustomerScale selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_customer_scale
     *
     * @mbggenerated Fri Jul 20 11:17:57 CST 2018
     */
    List<CrmCustomerScale> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_customer_scale
     *
     * @mbggenerated Fri Jul 20 11:17:57 CST 2018
     */
    int updateByPrimaryKey(CrmCustomerScale record);
}