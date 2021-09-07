package com.example.androidposition;

import com.example.androidposition.dao.ListDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AndroidPositionApplicationTests {

    @Resource
    private ListDao listDao;

    @Test
    void contextLoads() {

    }

}
