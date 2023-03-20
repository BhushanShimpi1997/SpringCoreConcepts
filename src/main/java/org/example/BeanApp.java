package org.example;

import org.example.beanscope.PersonDAO;
import org.example.beanscope.ScopeConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class BeanApp {


    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(ScopeConfig.class);
        PersonDAO person = context.getBean(PersonDAO.class);
        System.out.println(person);
        System.out.println(person.getConnection());
        PersonDAO person1=context.getBean(PersonDAO.class);
        System.out.println(person1);
        System.out.println(person1.getConnection());
    }
}
