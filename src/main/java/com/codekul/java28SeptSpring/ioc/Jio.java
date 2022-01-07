package com.codekul.java28SeptSpring.ioc;

public class Jio implements Sim{

    @Override
    public void calling() {
        System.out.println("Vodafone calling");
    }

    @Override
    public void data() {
        System.out.println("Vodafone Data");
    }
}
