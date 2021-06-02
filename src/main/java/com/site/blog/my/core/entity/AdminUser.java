package com.site.blog.my.core.entity;

import lombok.Data;

@Data
public class AdminUser {
    private Integer adminUserId;

    private String loginUserName;

    private String loginPassword;

    private String nickName;

    private Byte locked;


    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName == null ? null : loginUserName.trim();
    }


    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }



    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }




}