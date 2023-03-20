package org.example.springaop.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

    @Pointcut("execution(* org.example.springaop.concert.Performance.perform(..))")
    public void perform(){

    }

    @Pointcut("execution(* org.example.springaop.concert.Performance.count(int)) && args(number)")
    public void count(int number){}

    @Pointcut("execution(* org.example.springaop.concert.Performance.sum(int, int)) && args(a,b)")
    public void doSum(int a,int b){}
  /*  @Before("execution(* org.example.springaop.concert.Performance.perform(..))")
    public void silentCellPhones(){
        System.out.println("Silencing Cell Phones...");
    }

    @Before("perform()")
    public void takeSeats(){
        System.out.println("taking Seates..");
    }

    @AfterReturning("perform()")
    public void applause(){
        System.out.println("CLAP-CLAP-CLAPPS");
    }

    @AfterThrowing("perform()")
    public void demandRefund(){
        System.out.println("Demending Refunds...");
    }
 */
    @Around("perform()")
    public void watchPerformance(ProceedingJoinPoint jp){
      try{
          System.out.println("Silencing Phones..");
          System.out.println("Taking Seates...");
          jp.proceed();
          System.out.println("CLAP CLAP !!");
      }
      catch (Throwable e){
          System.out.println("Demanding Refund.!!");
      }
    }

    @Before("count(number)")
    public void printCount(int number){
        System.out.println("increase count:"+(number+1));
    }

    @After("doSum(a,b)")
    public void afterSum(int a, int b){
        System.out.println("After sum incresing by 1:"+(a+b+1));
    }
}
