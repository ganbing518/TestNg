package com.testng.helloworld.impl;

import com.testng.dto.HelloWorld;
import com.testng.helloworld.HelloWorldMapper;
import com.testng.helloworld.HelloWorldService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @author gan bing
 * @version V1.0
 * @date 2018-03-21 9:31
 */
@Component("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

    @Resource
    private HelloWorldMapper helloWorldMapper;

    @Override
    public String sayHelloWorld(HelloWorld helloWorld) {
        return helloWorldMapper.sayHelloWorld(helloWorld);
    }
}
