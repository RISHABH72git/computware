package com.example.computware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class ComputwareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputwareApplication.class, args);
    }

}
