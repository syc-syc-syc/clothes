package com.xp.clothes.mapper;

import com.xp.clothes.bean.FactoryScale;
import com.xp.clothes.bean.FactoryScaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FactoryScaleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory_scale
     *
     * @mbg.generated Thu May 23 18:04:41 CST 2019
     */
    long countByExample(FactoryScaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory_scale
     *
     * @mbg.generated Thu May 23 18:04:41 CST 2019
     */
    int deleteByExample(FactoryScaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory_scale
     *
     * @mbg.generated Thu May 23 18:04:41 CST 2019
     */
    int insert(FactoryScale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory_scale
     *
     * @mbg.generated Thu May 23 18:04:41 CST 2019
     */
    int insertSelective(FactoryScale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory_scale
     *
     * @mbg.generated Thu May 23 18:04:41 CST 2019
     */
    List<FactoryScale> selectByExample(FactoryScaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory_scale
     *
     * @mbg.generated Thu May 23 18:04:41 CST 2019
     */
    int updateByExampleSelective(@Param("record") FactoryScale record, @Param("example") FactoryScaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factory_scale
     *
     * @mbg.generated Thu May 23 18:04:41 CST 2019
     */
    int updateByExample(@Param("record") FactoryScale record, @Param("example") FactoryScaleExample example);
}