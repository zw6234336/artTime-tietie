package com.tietie.dao;

import com.tietie.model.AtStoreCabinetIndex;

/**
 * 
 * 储物间索引Dao
 * @author zhangwei
 *
 * 2017年1月6日
 */
public interface AtStoreCabinetIndexMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AtStoreCabinetIndex record);

    int insertSelective(AtStoreCabinetIndex record);

    AtStoreCabinetIndex selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AtStoreCabinetIndex record);

    int updateByPrimaryKey(AtStoreCabinetIndex record);
}