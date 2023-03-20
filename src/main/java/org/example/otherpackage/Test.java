package org.example.otherpackage;

import org.springframework.stereotype.Component;

@Component
public class Test {
    private String name="Bhushan";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}
