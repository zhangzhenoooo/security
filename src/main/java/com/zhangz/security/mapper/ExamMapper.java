package com.zhangz.security.mapper;

import com.zhangz.security.model.Exam;
import com.zhangz.security.model.ExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ExamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbg.generated Tue Apr 21 22:24:50 CST 2020
     */
    long countByExample(ExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbg.generated Tue Apr 21 22:24:50 CST 2020
     */
    int deleteByExample(ExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbg.generated Tue Apr 21 22:24:50 CST 2020
     */
    int deleteByPrimaryKey(String examId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbg.generated Tue Apr 21 22:24:50 CST 2020
     */
    int insert(Exam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbg.generated Tue Apr 21 22:24:50 CST 2020
     */
    int insertSelective(Exam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbg.generated Tue Apr 21 22:24:50 CST 2020
     */
    List<Exam> selectByExampleWithRowbounds(ExamExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbg.generated Tue Apr 21 22:24:50 CST 2020
     */
    List<Exam> selectByExample(ExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbg.generated Tue Apr 21 22:24:50 CST 2020
     */
    Exam selectByPrimaryKey(String examId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbg.generated Tue Apr 21 22:24:50 CST 2020
     */
    int updateByExampleSelective(@Param("record") Exam record, @Param("example") ExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbg.generated Tue Apr 21 22:24:50 CST 2020
     */
    int updateByExample(@Param("record") Exam record, @Param("example") ExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbg.generated Tue Apr 21 22:24:50 CST 2020
     */
    int updateByPrimaryKeySelective(Exam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam
     *
     * @mbg.generated Tue Apr 21 22:24:50 CST 2020
     */
    int updateByPrimaryKey(Exam record);
}