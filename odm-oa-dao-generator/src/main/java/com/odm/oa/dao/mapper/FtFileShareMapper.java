package com.odm.oa.dao.mapper;

import com.odm.oa.dao.pojo.FtFileShare;
import java.util.List;

public interface FtFileShareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FT_File_Share
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FT_File_Share
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int insert(FtFileShare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FT_File_Share
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    FtFileShare selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FT_File_Share
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    List<FtFileShare> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FT_File_Share
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int updateByPrimaryKey(FtFileShare record);
}