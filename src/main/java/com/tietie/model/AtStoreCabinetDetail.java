package com.tietie.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 储物间详细描述
 * 
 * @author zhangwei
 *
 *         2017年1月6日
 */
public class AtStoreCabinetDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private Integer userId;

	private String eventTitle;

	private Integer eventLevel;

	private Integer eventState;

	private String eventDescribe;

	private String eventLable;

	private Date remindTime;

	private Date expireTime;

	private Date createTime;

	private Date modifyTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle == null ? null : eventTitle.trim();
	}

	public Integer getEventLevel() {
		return eventLevel;
	}

	public void setEventLevel(Integer eventLevel) {
		this.eventLevel = eventLevel;
	}

	public Integer getEventState() {
		return eventState;
	}

	public void setEventState(Integer eventState) {
		this.eventState = eventState;
	}

	public String getEventDescribe() {
		return eventDescribe;
	}

	public void setEventDescribe(String eventDescribe) {
		this.eventDescribe = eventDescribe == null ? null : eventDescribe
				.trim();
	}

	public String getEventLable() {
		return eventLable;
	}

	public void setEventLable(String eventLable) {
		this.eventLable = eventLable == null ? null : eventLable.trim();
	}

	public Date getRemindTime() {
		return remindTime;
	}

	public void setRemindTime(Date remindTime) {
		this.remindTime = remindTime;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}