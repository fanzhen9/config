package com.sailing.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @auther fox
 * @date 2018/1/22 17:43
 */
@Controller
@RequestMapping("/configPage")
public class ConfigPage {

    @RequestMapping(value = "/init")
    public String init(HttpServletRequest req){
        HttpSession session = req.getSession();
        return "/login/config";
    }
}
