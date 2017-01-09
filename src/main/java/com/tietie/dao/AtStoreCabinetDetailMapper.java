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

	/**
	 * 通过主键删除
	 * 
	 * @param id
	 * @return
	 */
	public int deleteByPrimaryKey(Integer id);

	/**
	 * 新增
	 * 
	 * @param record
	 * @return
	 */
	public int insert(AtStoreCabinetDetail record);

	/**
	 * 按选中字段新增
	 * 
	 * @param record
	 * @return
	 */
	public int insertSelective(AtStoreCabinetDetail record);

	/**
	 * 按主键查询
	 * 
	 * @param id
	 * @return
	 */
	public AtStoreCabinetDetail selectByPrimaryKey(Integer id);

	/**
	 * 按选中字段更新
	 * 
	 * @param record
	 * @return
	 */
	public int updateByPrimaryKeySelective(AtStoreCabinetDetail record);

	/**
	 * 按主键更新
	 * 
	 * @param record
	 * @return
	 */
	public int updateByPrimaryKey(AtStoreCabinetDetail record);
}