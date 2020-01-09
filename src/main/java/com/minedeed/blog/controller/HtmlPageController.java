package com.minedeed.blog.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HtmlPageController {

    static Logger log = Logger.getLogger(Test.class);

    @RequestMapping("/pageredirect")
    public String pageredirect(@RequestParam String pageName){

        log.info("得到的地址是："+pageName);
    return pageName;
    }
}
