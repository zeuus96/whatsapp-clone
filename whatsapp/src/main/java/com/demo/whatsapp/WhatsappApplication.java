package com.demo.whatsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WhatsappApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhatsappApplication.class, args);
    }

}
