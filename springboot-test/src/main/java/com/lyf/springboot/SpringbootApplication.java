package com.lyf.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringbootApplication.class, args);
        SpringApplication springApplication = new SpringApplication(SpringbootApplication.class);
        Environment env = springApplication.run(args).getEnvironment();

    }

}
