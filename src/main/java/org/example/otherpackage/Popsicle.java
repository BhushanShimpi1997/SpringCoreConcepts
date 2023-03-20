package org.example.otherpackage;

import org.example.otherpackage.customannotations.Cold;
import org.example.otherpackage.customannotations.Fruity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("cold")
@Cold
@Fruity
public class Popsicle implements Dessert {

    @Override
    public void myDessert() {
        System.out.println("Popsicle is on the way sir it also cold...");
    }
}
