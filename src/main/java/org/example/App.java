package org.example;

import org.example.otherpackage.*;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ObjectInputFilter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("spring project..");
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
        Student student1=context.getBean(Student.class);
        System.out.println(student1);
        System.out.println(student1.hashCode());
        System.out.println(student.hashCode());
        SgtPappers pappers=context.getBean("pappers", SgtPappers.class);
        pappers.play();
        Test test=context.getBean(Test.class);
        System.out.println("Test class bean "+test);

        System.out.println("********Spring Profiles*********");
        Car car = context.getBean(Car.class);
        System.out.println("Car name is: "+car.getName());
        System.out.println("*****COnditional Bean Checking******");
        MagicBean magicBean = context.getBean("magicBean",MagicBean.class);
        System.out.println(magicBean);
        try {
            Person person = context.getBean(Person.class);
            System.out.println(person);
        }
        catch (NoSuchBeanDefinitionException e){
            System.out.println("Person Bean Not Created..");
        }
        System.out.println("*********Primary/Qualifier Annotation**********");
        MyDinner dinner = context.getBean(MyDinner.class);
        dinner.getDessert().myDessert();


    }
}
