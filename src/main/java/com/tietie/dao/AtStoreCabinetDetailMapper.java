package com.tietie.dao;

import com.tietie.model.AtStoreCabinetDetail;

/**
 * 储物间详情Dao
 * 
 * @author zhangwei
 *
 * 2017年1月6日
 */
public interface AtStoreCabinetDetailMapper {

	public int deleteByPrimaryKey(Integer id);

	public int insert(AtStoreCabinetDetail record);

	public int insertSelective(AtStoreCabinetDetail record);

	public AtStoreCabinetDetail selectByPrimaryKey(Integer id);

	public int updateByPrimaryKeySelective(AtStoreCabinetDetail record);

	public int updateByPrimaryKey(AtStoreCabinetDetail record);
}