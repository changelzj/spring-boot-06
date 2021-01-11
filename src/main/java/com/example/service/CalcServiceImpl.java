package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public int div(int i, int j) {
        System.out.println("目标方法");
        return i/j;
    }
}
