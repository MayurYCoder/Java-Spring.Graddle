package com.codekul.java28SeptSpring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig {

    @Bean        //bean are the java object
    public Vodafone vodafone(){
        return new Vodafone();
    }

    @Bean
    public Jio jio(){
        return new Jio();
    }

}
