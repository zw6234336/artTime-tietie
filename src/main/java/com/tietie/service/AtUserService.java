package com.tietie.service;

import com.tietie.bean.CommonReturnBean;
import com.tietie.model.AtUser;

/**
 * 用户对象接口
 * 
 * @author zhangwei
 *
 * 2016年12月21日
 */
public interface AtUserService {

	
	/**
	 * 用户注册
	 * 
	 * @param userModel
	 * @return
	 */
	public CommonReturnBean userRegist(AtUser userModel);
	
	/**
	 * 用户登录
	 * 
	 * @return
	 */
	public CommonReturnBean userLogin(String userCode,String pwd);
	
	
	/**
	 * 用户注销
	 * 
	 * @param userModel
	 * @return
	 */
	public CommonReturnBean userCancelled(String userCode,String pwd );
}
