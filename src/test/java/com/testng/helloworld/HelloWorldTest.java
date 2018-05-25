package com.testng.helloworld;

import com.testng.dto.HelloWorld;
import com.testng.base.BaseTest;
import com.testng.helloworld.impl.HelloWorldServiceImpl;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
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

    @Mock
    private HelloWorldMapper helloWorldMapper;

    @InjectMocks
    private HelloWorldServiceImpl mockHelloWorldService;

    @BeforeClass
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test(dataProvider = "helloWorldDataHelper")
    public void testHelloWorld(HelloWorld helloWorld){
        String message = helloWorldService.sayHelloWorld(helloWorld);
        System.out.println(message);
        System.out.println("==========================");
        Mockito.when(helloWorldMapper.sayHelloWorld(helloWorld)).thenReturn("hhhhhhhh");
        String mockMessage = mockHelloWorldService.sayHelloWorld(helloWorld);
        System.out.println(mockMessage);
        System.out.println("==========================");
    }

}
