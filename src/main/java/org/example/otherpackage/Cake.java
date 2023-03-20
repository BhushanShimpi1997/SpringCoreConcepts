package org.example.otherpackage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Cake implements Dessert{
    @Override
    public void myDessert() {
        System.out.println("Cake is on the way sir..");
    }
}
