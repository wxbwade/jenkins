package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO 描述:
 *
 * @author xiaobin.wang@marketin.cn
 * @create 2019-03-27 21:45
 * @since 2.18
 */
@RestController
public class helloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello world 2021";
    }
}