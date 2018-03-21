package com.testng.base;

import com.testng.datahelper.HelloWorldDataHelper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.DataProvider;

/**
 * Description:
 *
 * @author gan bing
 * @version V1.0
 * @date 2018-03-21 10:12
 */
@SpringBootTest
public class BaseTest extends AbstractTestNGSpringContextTests {

    @DataProvider(name = "helloWorldDataHelper")
    public Object[][] helloWorldDataHelper(){
        return HelloWorldDataHelper.getHelloWorldData();
    }
}
