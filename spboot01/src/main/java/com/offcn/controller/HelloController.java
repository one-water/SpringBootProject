package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

        @RequestMapping("hello")
        public String hello() {
            return "Hello, Spring boot";
            //我又修改了这个项目！
        }


}
