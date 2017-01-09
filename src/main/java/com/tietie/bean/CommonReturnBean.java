package com.tietie.bean;

import java.util.Map;

/**
 * 内部接口返回状态
 * 
 * @author zhangwei
 *
 * 2016年12月20日
 */
public class CommonReturnBean {

	/**
	 * 在httpState基础上添加一个前缀
	 * 
	 * 正确返回100200
	 * 服务器异常 100500
	 * 
	 */
	private int code;
	
	/**
	 * 用来记录日志的描述
	 */
	private String message;
	
	/**
	 * 返回实体信息
	 */
	private Map<String,Object> commonEntity;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getCommonEntity() {
		return commonEntity;
	}

	public void setCommonEntity(Map<String, Object> commonEntity) {
		this.commonEntity = commonEntity;
	}
	
}
