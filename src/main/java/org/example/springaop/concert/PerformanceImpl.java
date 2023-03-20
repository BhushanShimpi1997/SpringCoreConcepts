package org.example.springaop.concert;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PerformanceImpl implements Performance{
    @Override
    public void perform() {
        System.out.println("performance method of performance service is executing..");
        int a=10/0;
    }

    @Override
    public void count(int number) {
        System.out.println("Number is:"+number);
    }

    @Override
    public void sum(int a, int b) {
        System.out.println("Sum is: "+(a+b));
    }
}
