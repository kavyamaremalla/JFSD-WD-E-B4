package com.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.expression.AnnotatedElementKey;

@Configuration
@ComponentScan("com.spring.demo")
@PropertySource("application.properties")
public class SportsConfig {

    @Bean //Creates objects and inject dependencies for third party libraries
    public AnnotatedElementKey annotatedElementKey(){
        return new AnnotatedElementKey(null, null);
    }

}
