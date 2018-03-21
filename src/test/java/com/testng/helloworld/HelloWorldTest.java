package com.testng.helloworld;

import com.testng.dto.HelloWorld;
import com.testng.base.BaseTest;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @author gan bing
 * @version V1.0
 * @date 2018-03-21 9:40
 */
public class HelloWorldTest extends BaseTest{

    @Resource
    private HelloWorldService helloWorldService;

    @Test(dataProvider = "helloWorldDataHelper")
    public void testHelloWorld(HelloWorld helloWorld){
        helloWorldService.sayHelloWorld(helloWorld);
    }

}
