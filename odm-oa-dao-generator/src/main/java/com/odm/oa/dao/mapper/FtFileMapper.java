package com.odm.oa.dao.mapper;

import com.odm.oa.dao.pojo.FtFile;
import java.util.List;

public interface FtFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FT_File
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FT_File
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int insert(FtFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FT_File
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    FtFile selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FT_File
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    List<FtFile> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FT_File
     *
     * @mbggenerated Sat Jul 14 20:25:19 CST 2018
     */
    int updateByPrimaryKey(FtFile record);
}