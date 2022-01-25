package com.cyn.docker.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(User)实体类
 *
 * @author makejava
 * @since 2022-01-24 09:33:47
 */
@ApiModel(value = "User", description = "用户表(User)实体类")
public class User implements Serializable {
    @ApiModelProperty(value = "", required = true)
    private static final long serialVersionUID = -44300174219581631L;

    @ApiModelProperty(value = "", required = true)
    private Integer id;
    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名", required = true)
    private String username;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码", required = true)
    private String password;
    /**
     * 性别 0=女 1=男
     */
    @ApiModelProperty(value = "性别0=女1=男", required = true)
    private Integer sex;
    /**
     * 删除标志，默认0不删除，1删除
     */
    @ApiModelProperty(value = "删除标志，默认0不删除，1删除", required = true)
    private Integer deleted;
    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间", required = true)
    private Date updateTime;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

