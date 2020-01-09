package com.minedeed.blog.utils;

import com.alibaba.druid.support.http.StatViewFilter;
import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns ="/druid/*",initParams = {
        @WebInitParam(name="loginUsername",value = "deed"),
        @WebInitParam(name="loginPassword",value = "qianggcong")
})
public class DruidMonitor extends StatViewServlet {
    private static final long serialVersionUID = -2688872071445249539L;
}
