package com.example.test;

import com.example.Application;
import com.example.service.CalcService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = Application.class)
public class SpringTest {
    @Autowired
    private CalcService calcService;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test() {
        calcService.div(10, 10);
    }

    
}
