package com.tietie.bean;

/**
 * 页面返回提示
 * 
 * @author zhangwei
 *
 * 2016年12月20日
 */
public class ActionReturnBean {

	/**
	 * 接口调用状态
	 */
	private String status;
	
	/**
	 * 用户Id
	 */
	private int userId;
	
	/**
	 * 用户登录识别码
	 */
	private String token;
	
	/**
	 * 状态描述
	 */
	private String message;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
