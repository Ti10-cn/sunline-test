package com.hezhangqi.sunlinetest;

import com.hezhangqi.sunlinetest.mapper.Redhat001;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SunlineTestApplicationTests {
    @Autowired
    private Redhat001 redhat001;

    @Test
    void contextLoads() {
       int i = redhat001.findByName();
        System.out.println(i);
    }

}
