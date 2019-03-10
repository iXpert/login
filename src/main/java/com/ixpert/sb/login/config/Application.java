package com.ixpert.sb.login.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.ixpert.sb.login")
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    private static Class applicationClass = Application.class;

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

}
