package com.comical.web.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by q on 16/11/5.
 */
@Controller
@RequestMapping("/home")
public class HomePageController {

    @RequestMapping(value = "/login")
    public String play(
    ) {
        return "include/login";
    }
}
