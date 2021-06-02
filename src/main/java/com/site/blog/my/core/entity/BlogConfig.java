package com.site.blog.my.core.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;
@Data
public class BlogConfig {
    @NotBlank
    private String configName;

    private String configValue;

    private Date createTime;

    private Date updateTime;



    public void setConfigName(String configName) {
        this.configName = configName == null ? null : configName.trim();
    }


    public void setConfigValue(String configValue) {
        this.configValue = configValue == null ? null : configValue.trim();
    }




}