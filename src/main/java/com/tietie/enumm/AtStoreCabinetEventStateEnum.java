package com.tietie.enumm;

/**
 * 储存柜事件状态枚举
 * 
 * @author zhangwei
 * 
 * 2016年12月20日
 */
public enum AtStoreCabinetEventStateEnum {
	IN("入池", 1), OUT("出池", 2);

	private final String describe;
	private final int value;

	private AtStoreCabinetEventStateEnum(String describe, int value) {
		this.describe = describe;
		this.value = value;
	}

	public String getDescribe() {
		return describe;
	}

	public int getValue() {
		return value;
	}

}
