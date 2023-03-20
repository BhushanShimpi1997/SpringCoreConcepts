package org.example.otherpackage;

import org.example.otherpackage.customannotations.Cold;
import org.example.otherpackage.customannotations.Creamy;
import org.example.otherpackage.customannotations.Fruity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyDinner {


    private Dessert dessert;

    public Dessert getDessert() {
        return dessert;
    }

    @Autowired
    //@Qualifier("cold")
    @Cold
    @Fruity
    public void setDessert( Dessert dessert) {
        this.dessert = dessert;
    }


}
