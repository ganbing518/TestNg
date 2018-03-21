package com.testng.helloworld.impl;

import com.testng.dto.HelloWorld;
import com.testng.helloworld.HelloWorldService;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author gan bing
 * @version V1.0
 * @date 2018-03-21 9:31
 */
@Component("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public void sayHelloWorld(HelloWorld helloWorld) {
        System.out.println(helloWorld);
    }
}
