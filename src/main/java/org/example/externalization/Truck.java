package org.example.externalization;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Truck {
    @Value("${truckname}")
    private String truckName;
    @Value("${trucknumber}")
    private String number;

    public String getTruckName() {
        return truckName;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Truck( String truckName,
                 String number)
    {
        this.truckName = truckName;
        this.number = number;
    }

    public Truck() {
    }
}
