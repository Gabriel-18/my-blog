package com.site.blog.my.core.controller.vo;

import lombok.Data;

import javax.sound.midi.Soundbank;
import java.io.Serializable;

/**
 * 在侧栏博客需要展示的信息
 */
@Data
public class SimpleBlogListVO implements Serializable {

    private Long blogId;

    private String blogTitle;

}
