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
    public int deleteByPrimaryKey(Integer id);

    public int insert(AtStoreCabinetIndex record);

    public int insertSelective(AtStoreCabinetIndex record);

    public AtStoreCabinetIndex selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(AtStoreCabinetIndex record);

    public int updateByPrimaryKey(AtStoreCabinetIndex record);
}