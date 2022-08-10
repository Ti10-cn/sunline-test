package com.hezhangqi.sunlinetest.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @Author: Ti-cn
 * @Date: 2022/8/10 23:22
 */
@TableName("echo_test")
public class Echo001 {
    @TableField("column_01")
    private String column_01;
}
