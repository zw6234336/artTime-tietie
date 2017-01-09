package com.tietie.dao;

import java.util.Map;

import com.tietie.model.AtUser;

/**
 * 用户Dao
 * 
 * @author zhangwei
 *
 * 2017年1月6日
 */
public interface AtUserMapper {
    public int deleteByPrimaryKey(Integer id);

    public int insert(AtUser record);

    public int insertSelective(AtUser record);

    public AtUser selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(AtUser record);

    public int updateByPrimaryKey(AtUser record);
    
    /**
     * 登录
     * 
     * @param param
     * @return
     */
    public Map<String,Integer> selectByCodePwd(Map<String,String> param);
    
    /**
     * 用户注销
     * 
     * @param param
     * @return
     */
    public int updateByCodePwd(Map<String,String> param);
}