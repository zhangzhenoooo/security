package com.zhangz.security.mapper;

import com.zhangz.security.model.Approval;
import com.zhangz.security.model.ApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ApprovalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    long countByExample(ApprovalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int deleteByExample(ApprovalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int deleteByPrimaryKey(String approvalId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int insert(Approval record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int insertSelective(Approval record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    List<Approval> selectByExampleWithRowbounds(ApprovalExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    List<Approval> selectByExample(ApprovalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    Approval selectByPrimaryKey(String approvalId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int updateByExampleSelective(@Param("record") Approval record, @Param("example") ApprovalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int updateByExample(@Param("record") Approval record, @Param("example") ApprovalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int updateByPrimaryKeySelective(Approval record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval
     *
     * @mbg.generated Mon Apr 20 15:51:22 CST 2020
     */
    int updateByPrimaryKey(Approval record);
}