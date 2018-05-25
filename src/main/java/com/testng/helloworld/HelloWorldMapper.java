package com.testng.helloworld;

import com.testng.dto.HelloWorld;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author gan bing
 * @version V1.0
 * @date 2018-05-25 15:01
 */
@Component("helloWorldMapper")
public class HelloWorldMapper {

    public String sayHelloWorld(HelloWorld helloWorld) {
        System.out.println(helloWorld);
        return helloWorld.getMessage();
    }
}
