package com.boot.model;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class BaseModel implements Serializable {

    @TableId(value = "ID", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "CREATORID", fill = FieldFill.INSERT)
    private String creatorId;

    @TableField(value = "CREATOR", fill = FieldFill.INSERT)
    private String creator;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "CREATETIME", fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value = "UPDATERID", fill = FieldFill.UPDATE)
    private String updaterId;

    @TableField(value = "UPDATER", fill = FieldFill.UPDATE)
    private String updater;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "UPDATETIME", fill = FieldFill.UPDATE)
    private Date updateTime;

    @TableLogic
    @TableField(value = "DELETED", fill = FieldFill.INSERT)
    private Integer deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}
