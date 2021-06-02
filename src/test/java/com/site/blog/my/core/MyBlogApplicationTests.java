package com.site.blog.my.core;

import com.site.blog.my.core.dao.AdminUserMapper;
import com.site.blog.my.core.entity.AdminUser;
import com.site.blog.my.core.util.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBlogApplicationTests {

    @Resource
    private AdminUserMapper adminUserMapper;

    private String userName = "admin";
    private String password = "123456";
    private String nickName = "kelper";
    private byte isNocked = 0;
    @Test
    public void insertAdminUser() {
        AdminUser user = new AdminUser();
        user.setLoginUserName(userName);
        user.setNickName(nickName);
        String passwordMd5 = MD5Util.MD5Encode(password, "UTF-8");
        user.setLoginPassword(passwordMd5);
        user.setLocked(isNocked);
        adminUserMapper.insert(user);
    }

}
