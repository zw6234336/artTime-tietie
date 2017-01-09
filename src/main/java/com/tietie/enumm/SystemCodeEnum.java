package com.tietie.enumm;

/**
 * 系统内部错误返回值
 * 
 * @author zhangwei
 *
 *         2016年12月21日
 */
public enum SystemCodeEnum {
	SUCCESS("严重", 100200), 
	PARAMETER_ERROR("传入参数错误", 100400),
	SERVER_ERROR("系统异常", 100500), 
	DATABASE_ERROR("数据库错误", 100600);

	private final String name;
	private final int code;

	private SystemCodeEnum(String name, int code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public int getCode() {
		return code;
	}

}
