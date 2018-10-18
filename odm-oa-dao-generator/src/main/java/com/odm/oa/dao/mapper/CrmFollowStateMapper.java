package com.odm.oa.dao.mapper;

import com.odm.oa.dao.pojo.CrmFollowState;
import java.util.List;

public interface CrmFollowStateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_follow_state
     *
     * @mbggenerated Fri Jul 20 11:17:57 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_follow_state
     *
     * @mbggenerated Fri Jul 20 11:17:57 CST 2018
     */
    int insert(CrmFollowState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_follow_state
     *
     * @mbggenerated Fri Jul 20 11:17:57 CST 2018
     */
    CrmFollowState selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_follow_state
     *
     * @mbggenerated Fri Jul 20 11:17:57 CST 2018
     */
    List<CrmFollowState> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_follow_state
     *
     * @mbggenerated Fri Jul 20 11:17:57 CST 2018
     */
    int updateByPrimaryKey(CrmFollowState record);
}