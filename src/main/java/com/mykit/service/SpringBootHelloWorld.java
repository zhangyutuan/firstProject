package com.mykit.service;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhangyutuan
 * @ClassName : SpringBootHelloWorld
 * @Description : TODO
 * @date : 2021/3/21
 * @Version : 1.0
 */
@RestController
public class SpringBootHelloWorld {
    /**
     * 简单mapping
     */
    @RequestMapping("sayHello")
    public String sayHello() {
        System.out.println("=============>来了");
        return "Hello World!";
    }
}
