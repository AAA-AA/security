package com.github.security.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by IntelliJ IDEA ^_^
 *
 * @author : hongqiangren.
 * @date: 2017/12/23 16:41
 * @email: renhongqiang1397@gmail.com
 */
@SpringBootApplication
@ComponentScan(value = "com.github.security.*")
@Slf4j
public class Application {

    public static void main(String[] args) {
        log.info("*********************正在启动*********************************");
        SpringApplication.run(Application.class, args);
        log.info("*********************启动成功*********************************");
    }
}
