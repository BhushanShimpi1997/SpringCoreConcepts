package org.example.otherpackage;

import org.springframework.stereotype.Component;

@Component
public class Cookie implements Dessert{
    @Override
    public void myDessert() {
        System.out.println("Cookie is are on the way......");
    }
}
