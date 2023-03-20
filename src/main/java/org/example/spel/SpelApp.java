package org.example.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpelApp {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpelConfig.class);
        Test test = context.getBean(Test.class);
        System.out.println(test);
        Student student = context.getBean(Student.class);
        System.out.println(student);
        System.out.println("Value of PI: "+student.getPi());
        System.out.println("Generated Random: "+student.getRandomNumber());
        System.out.println("Curren time: "+student.getCurrentTimeInMillis());

        SPELOperator spel = context.getBean(SPELOperator.class);
        System.out.println("Circumference of circle: "+spel.getCircumference());
        System.out.println("Area of circle: "+spel.getArea());
        System.out.println("Result of comperision: "+spel.getResult());
        System.out.println(spel.isCompare());
        System.out.println("Regulare Expression(Email) matches: "+spel.getEmailCheck());
    }
}
