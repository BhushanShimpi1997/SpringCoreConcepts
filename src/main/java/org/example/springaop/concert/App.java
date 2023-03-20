package org.example.springaop.concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        Performance performance= context.getBean(Performance.class);
       // performance.perform();
       // performance.count(1);
        performance.sum(12,13);

    }
}
