package org.example.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Component;

@Component("sp")
public class SPELOperator {

    @Value("#{student.email matches '[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com'}")
    private boolean emailCheck;

    @Value("#{2 * T(java.lang.Math).PI * circle.radious}")
    private float circumference;
    @Value("#{2 * T(java.lang.Math).PI * circle.radious ^2}")
    private float areaOfCircle;

    public static int num1=12;
    public static int num2=15;
    @Value("#{T(org.example.spel.SPELOperator).num1==T(org.example.spel.SPELOperator).num2 ?true:false}")
    private boolean result;
    @Value("#{88 lt 99}")
    private boolean compare;

    public boolean getEmailCheck(){
        return this.emailCheck;
    }
    public boolean isCompare(){
        return this.compare;
    }

    public boolean getResult(){
        return this.result;
    }
    public float getCircumference(){
        return this.circumference;
    }
    public float getArea(){
        return this.areaOfCircle;
    }
}
