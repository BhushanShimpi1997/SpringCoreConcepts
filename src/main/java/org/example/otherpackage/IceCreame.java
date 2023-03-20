package org.example.otherpackage;

import org.example.otherpackage.customannotations.Cold;
import org.example.otherpackage.customannotations.Creamy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("cold")
@Cold
@Creamy
public class IceCreame implements Dessert{
    @Override
    public void myDessert() {
        System.out.println("Ice Creame is on the way");
    }
}
