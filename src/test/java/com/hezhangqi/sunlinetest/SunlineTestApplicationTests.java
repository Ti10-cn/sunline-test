package com.hezhangqi.sunlinetest;

import com.hezhangqi.sunlinetest.mapper.Redhat001;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class SunlineTestApplicationTests {
    @Autowired
    private Redhat001 redhat001;


    @Test
    void contextLoads() {
       int i = 1;
        System.out.println(i);
        BigDecimal bigDecimal01 = new BigDecimal("0.00000000000000000123");
        System.out.println(bigDecimal01);
    }

}
