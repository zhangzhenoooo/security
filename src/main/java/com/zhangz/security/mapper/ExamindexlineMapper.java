package com.zhangz.security.mapper;

import com.zhangz.security.model.Examindexline;
import com.zhangz.security.model.ExamindexlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ExamindexlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindexline
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    long countByExample(ExamindexlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindexline
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    int deleteByExample(ExamindexlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindexline
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    int deleteByPrimaryKey(String indexId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindexline
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    int insert(Examindexline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindexline
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    int insertSelective(Examindexline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindexline
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    List<Examindexline> selectByExampleWithRowbounds(ExamindexlineExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindexline
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    List<Examindexline> selectByExample(ExamindexlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindexline
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    Examindexline selectByPrimaryKey(String indexId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindexline
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    int updateByExampleSelective(@Param("record") Examindexline record, @Param("example") ExamindexlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindexline
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    int updateByExample(@Param("record") Examindexline record, @Param("example") ExamindexlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindexline
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    int updateByPrimaryKeySelective(Examindexline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindexline
     *
     * @mbg.generated Wed Mar 25 11:07:21 CST 2020
     */
    int updateByPrimaryKey(Examindexline record);
}