package com.site.blog.my.core.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 主题实体
 */
@Data
public class Theme implements Serializable {

    /**
     * 主题名称
     */
    private String themeName;
    /**
     * 是否支持设置
     */
    private Boolean hasOptions;


    public Theme() {
    }

    public Theme(String themeName, boolean hasOptions) {
        this.themeName = themeName;
        this.hasOptions = hasOptions;
    }


}
