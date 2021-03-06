package com.zhangz.security.mapper;

import com.zhangz.security.model.Batch;
import com.zhangz.security.model.BatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BatchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    long countByExample(BatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int deleteByExample(BatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int deleteByPrimaryKey(String batchId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int insert(Batch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int insertSelective(Batch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    List<Batch> selectByExampleWithRowbounds(BatchExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    List<Batch> selectByExample(BatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    Batch selectByPrimaryKey(String batchId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") Batch record, @Param("example") BatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int updateByExample(@Param("record") Batch record, @Param("example") BatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int updateByPrimaryKeySelective(Batch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int updateByPrimaryKey(Batch record);
}