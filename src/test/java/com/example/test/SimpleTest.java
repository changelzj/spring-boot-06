package com.example.test;

import com.example.bean.A;
import com.example.bean.B;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        A a = context.getBean("a", A.class);
        B b = context.getBean("b", B.class);

    }
}
