package com.zhangz.security.mapper;

import com.zhangz.security.model.Examindex;
import com.zhangz.security.model.ExamindexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ExamindexMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindex
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    long countByExample(ExamindexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindex
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    int deleteByExample(ExamindexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindex
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    int deleteByPrimaryKey(String indexId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindex
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    int insert(Examindex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindex
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    int insertSelective(Examindex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindex
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    List<Examindex> selectByExampleWithRowbounds(ExamindexExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindex
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    List<Examindex> selectByExample(ExamindexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindex
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    Examindex selectByPrimaryKey(String indexId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindex
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    int updateByExampleSelective(@Param("record") Examindex record, @Param("example") ExamindexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindex
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    int updateByExample(@Param("record") Examindex record, @Param("example") ExamindexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindex
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    int updateByPrimaryKeySelective(Examindex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examindex
     *
     * @mbg.generated Wed Mar 25 13:34:59 CST 2020
     */
    int updateByPrimaryKey(Examindex record);
}