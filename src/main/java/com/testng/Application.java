package com.testng;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Description:
 *
 * @author gan bing
 * @version V1.0
 * @date 2018-03-21 10:02
 */

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.testng.helloworld"})
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
