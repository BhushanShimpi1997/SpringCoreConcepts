package org.example;

import org.example.otherpackage.Address;
import org.springframework.stereotype.Component;


public class Student {

    private String name;
    private int rollNo;
    private Address address;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", address=" + address +
                '}';
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
