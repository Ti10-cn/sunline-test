package com.hezhangqi.sunlinetest.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: Ti-cn
 * @Date: 2022/8/10 22:57
 */
@Mapper
public interface Redhat001 {
    @Select("select * from echo_test")
    int findByName();
}
