package org.example.otherpackage;

public class MagicBean {
    private String magicBeanName;

    public String getMagicBeanName() {
        return magicBeanName;
    }

    public void setMagicBeanName(String magicBeanName) {
        this.magicBeanName = magicBeanName;
    }

    public MagicBean() {
    }

    @Override
    public String toString() {
        return "MagicBean Created Successfully!";
    }
}
