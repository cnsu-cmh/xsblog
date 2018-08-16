package com.xsit;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) {
        try {
            ConfigurableApplicationContext run = SpringApplication.run(BlogApplication.class, args);

            DefaultKaptcha captchaProducer = (DefaultKaptcha)run.getBean("captchaProducer");
            System.out.println(captchaProducer.getConfig());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


