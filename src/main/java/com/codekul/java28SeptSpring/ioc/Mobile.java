package com.codekul.java28SeptSpring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        /*This is older way of object creation
        Vodafone vodafone=new Vodafone();
        vodafone.calling();
        vodafone.data();


         */
        ApplicationContext context=new AnnotationConfigApplicationContext(SimConfig.class);
        Sim sim=context.getBean(Vodafone.class);
        sim.calling();
        sim.data();
    }
}
