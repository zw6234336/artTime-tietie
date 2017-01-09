package com.tietie.enumm;

/**
 * 储存柜事件等级枚举
 * 
 * @author zhangwei
 * 
 * 2016年12月20日
 */
public enum AtStoreCabinetEventLevelEnum {
	RED("严重", 1), YELLOW("不急", 2),GREEN("等等",3);

	private final String describe;
	private final int value;

	private AtStoreCabinetEventLevelEnum(String describe, int value) {
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
