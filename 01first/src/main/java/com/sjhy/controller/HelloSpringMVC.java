package com.sjhy.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
    第一个springMVC程序
 */
public class HelloSpringMVC implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        //返回前台数据
        mv.addObject("hello","hello springMVC");
        //返回前台的页面
        mv.setViewName("/WEB_INF/first.jsp");
        return mv;
    }
}
