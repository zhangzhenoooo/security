package com.zhangz.security.mapper;

import com.zhangz.security.model.ExamBatch;
import com.zhangz.security.model.ExamBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ExamBatchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exambatch
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    long countByExample(ExamBatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exambatch
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int deleteByExample(ExamBatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exambatch
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int deleteByPrimaryKey(String batchId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exambatch
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int insert(ExamBatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exambatch
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int insertSelective(ExamBatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exambatch
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    List<ExamBatch> selectByExampleWithRowbounds(ExamBatchExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exambatch
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    List<ExamBatch> selectByExample(ExamBatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exambatch
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    ExamBatch selectByPrimaryKey(String batchId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exambatch
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int updateByExampleSelective(@Param("record") ExamBatch record, @Param("example") ExamBatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exambatch
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int updateByExample(@Param("record") ExamBatch record, @Param("example") ExamBatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exambatch
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int updateByPrimaryKeySelective(ExamBatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exambatch
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int updateByPrimaryKey(ExamBatch record);
}