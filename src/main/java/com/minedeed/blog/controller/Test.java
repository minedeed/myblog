package com.minedeed.blog.controller;

import com.minedeed.blog.service.impl.TestImpl;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class Test {
    static Logger log = Logger.getLogger(Test.class);


    @Autowired
    TestImpl test;



    @RequestMapping("/test")
    public String test(){
test.insertTest("1","2");
   log.debug("this debug");
   log.info("this info");
    log.warn("this warn");
     log.error("this error");
     log.trace("this trace");
        return "test";
    }
}
