package com.wkk.aop.controller;

import com.wkk.aop.annotation.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Time: 20-3-10下午4:53
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
@RestController
public class TestController {
    @Log("执行方法一")
    @GetMapping("/one")
    public void methodOne(String name){

    }

    @Log("执行方法二")
    @GetMapping("/two")
    public void methodTwo() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Log("执行方法三")
    @GetMapping("/three")
    public void methodThree(String name, String age){

    }
}
