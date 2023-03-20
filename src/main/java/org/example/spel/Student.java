package org.example.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

    @Value("#{test}")
    private Test test;

    @Value("#{test.getStudentName()?.toUpperCase()}")
    private String studentName;
    @Value("#{test.rollNo}")
    private int rollNo;
    @Value("#{test.percentage}")
    private float percentage;
    @Value("#{test.isPass}")
    private boolean isPass;

    public String email="Bhushan.shimpi2816@gmail.com";

    @Value("#{T(java.lang.Math).PI}")
    private float pi;

    @Value("#{T(java.lang.Math).random()*100}")
    private float randomNumber;

    @Value("#{T(java.lang.System).currentTimeMillis()}")
    private long currentTimeInMillis;

    public long getCurrentTimeInMillis(){
        return this.currentTimeInMillis;
    }
    public float getRandomNumber(){
        return this.randomNumber;
    }

    public float getPi(){
        return this.pi;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }
    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "test=" + test +
                ", studentName='" + studentName + '\'' +
                ", rollNo=" + rollNo +
                ", percentage=" + percentage +
                ", isPass=" + isPass +
                '}';
    }
}
