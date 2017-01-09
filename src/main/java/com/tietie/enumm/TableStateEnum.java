package com.tietie.enumm;

/**
 * 表状态统一管理
 * 
 * @author zhangwei
 *
 * 2016年12月22日
 */
public enum TableStateEnum {
	ACTIVE("启用(默认新增状态)", 1), 
	POSITIVE("删除状态", 2);

	private final String name;
	private final int code;

	private TableStateEnum(String name, int code) {
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
