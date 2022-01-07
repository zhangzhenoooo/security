package com.zhangz.security.mapper;

import com.zhangz.security.model.SiteCycleExam;
import com.zhangz.security.model.SiteCycleExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SiteCycleExamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    long countByExample(SiteCycleExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int deleteByExample(SiteCycleExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int deleteByPrimaryKey(String siteCycleExamId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int insert(SiteCycleExam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int insertSelective(SiteCycleExam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    List<SiteCycleExam> selectByExampleWithRowbounds(SiteCycleExamExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    List<SiteCycleExam> selectByExample(SiteCycleExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    SiteCycleExam selectByPrimaryKey(String siteCycleExamId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") SiteCycleExam record, @Param("example") SiteCycleExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int updateByExample(@Param("record") SiteCycleExam record, @Param("example") SiteCycleExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int updateByPrimaryKeySelective(SiteCycleExam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    int updateByPrimaryKey(SiteCycleExam record);
}