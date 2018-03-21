package com.testng.datahelper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Description:
 *
 * @author gan bing
 * @version V1.0
 * @date 2018-03-21 10:59
 */
public abstract class BaseDataHelper {

    private final static Logger LOG = LoggerFactory.getLogger(BaseDataHelper.class);

    /**
     * 获取文件内容
     *
     * @param path classpath路径
     * @return 文件内容
     */
    public static String getStringValue(String path) {
        try {
            Resource resource = new ClassPathResource(path);
            File file = resource.getFile();
            return jsonRead(file);
        } catch (Exception e) {
            LOG.error("获取文件内容出错！", e);
        }
        return null;
    }

    /**
     * 遍历文件中的内容
     *
     * @param file 具体文件
     * @return 文件内容
     */
    private static String jsonRead(File file) throws Exception {
        StringBuilder buffer = new StringBuilder();

        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8.name());
        while (scanner.hasNextLine()) {
            buffer.append(scanner.nextLine());
        }
        scanner.close();
        return buffer.toString();
    }
}
