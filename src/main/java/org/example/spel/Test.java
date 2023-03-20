package org.example.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("test")
public class Test {

    @Value("#{14}")
  //  @Value("${student.rollNo}")
   public int rollNo;

    @Value("#{87.45}")
   // @Value("${student.percentage}")
    public float percentage;

    @Value("#{'Bhushan Shimpi'}")
   // @Value("${student.name}")
    public String name;

    @Value("#{true}")
 // @Value("${student.isPass}")
    public boolean isPass;

    public Test() {
    }

    public String getStudentName(){
        return this.name;
    }

    @Override
    public String toString() {
        return name +" "+percentage+" "+isPass+" "+rollNo;
    }
}
