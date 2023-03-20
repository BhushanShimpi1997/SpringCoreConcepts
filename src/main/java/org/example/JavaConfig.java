package org.example;

import org.example.otherpackage.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class JavaConfig {

   @Bean
   @Scope(BeanDefinition.SCOPE_PROTOTYPE)
   public Address address(){
      Address address=new Address();
      address.setCity("Thalner");
      address.setPinCode("454454");
      return address;
   }

   @Bean
   @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Student student(Address address){
       Student student=new Student();
       student.setName("Saloni Chaudhari");
       student.setRollNo(123);
       student.setAddress(address);
       return student;
   }

   @Bean
   @Profile("dev")
   public Car car(){
      Car car=new Car();
      car.setName("Maruti");
      return car;
   }

   @Bean
   @Profile("prod")
   public Car anotherCar(){
      Car car=new Car();
      car.setName("Volkswagen");
      return car;
   }
   @Bean
   @Conditional(MagicExistsCondition.class)
   public MagicBean magicBean(){
      MagicBean magicBean=new MagicBean();
      magicBean.setMagicBeanName("magic Bean");
      return magicBean;
   }

   @Bean
   public Wife wife(){
       return new Wife();
   }
   @Bean
   @Conditional(PersonExistsCondition.class)
   public Person person(Car car){
      Person person = new Person();
      person.setPersonName("Bhushan shimpi");
      person.setCar(car);
      return person;
   }



}
