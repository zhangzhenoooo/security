package com.zhangz.security.mapper;

import com.zhangz.security.model.SiteLine;
import com.zhangz.security.model.SiteLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SiteLineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table siteline
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    long countByExample(SiteLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table siteline
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    int deleteByExample(SiteLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table siteline
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    int deleteByPrimaryKey(String sitelineId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table siteline
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    int insert(SiteLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table siteline
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    int insertSelective(SiteLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table siteline
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    List<SiteLine> selectByExampleWithRowbounds(SiteLineExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table siteline
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    List<SiteLine> selectByExample(SiteLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table siteline
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    SiteLine selectByPrimaryKey(String sitelineId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table siteline
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    int updateByExampleSelective(@Param("record") SiteLine record, @Param("example") SiteLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table siteline
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    int updateByExample(@Param("record") SiteLine record, @Param("example") SiteLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table siteline
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    int updateByPrimaryKeySelective(SiteLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table siteline
     *
     * @mbg.generated Sun Apr 19 21:40:06 CST 2020
     */
    int updateByPrimaryKey(SiteLine record);
}