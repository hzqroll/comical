package com.comical.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zongqiang.hao
 */

@Controller
@RequestMapping("/home")
public class TestController {

    @RequestMapping(value = "/index")
    public String play(
    ) {
        return "test";
    }
}
