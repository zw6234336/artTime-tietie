package com.tietie.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 储物间索引
 * 
 * @author zhangwei
 *
 * 2017年1月6日
 */
public class AtStoreCabinetIndex implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    private Integer id;

    private Integer userId;

    private Integer eventDetailId;

    private String eventTitle;

    private Integer eventLevel;

    private Integer eventState;

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

    public Integer getEventDetailId() {
        return eventDetailId;
    }

    public void setEventDetailId(Integer eventDetailId) {
        this.eventDetailId = eventDetailId;
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