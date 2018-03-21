package com.testng.datahelper;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.testng.dto.HelloWorld;
import org.apache.commons.lang3.StringUtils;

/**
 * Description:
 *
 * @author gan bing
 * @version V1.0
 * @date 2018-03-21 9:43
 */

public class HelloWorldDataHelper extends BaseDataHelper {

    private final static String HELLO_WORLD = "data/HelloWorld.json";

    public static HelloWorld[][] getHelloWorldData(){

        String data = getStringValue(HELLO_WORLD);

        if(StringUtils.isBlank(data)){
            return new HelloWorld[0][0];
        }

        return JSON.parseObject(data,new TypeReference<HelloWorld[][]>(){});
    }

}
