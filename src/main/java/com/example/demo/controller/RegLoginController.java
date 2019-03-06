package com.example.demo.controller;

import com.example.demo.entity.RespBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2017/12/29.
 */
@Controller
public class RegLoginController {

    /**
     * 登录跳转
     * 没有登录就会跳转到登录页面
     * @return
     */
    @RequestMapping("/login_p")
    public String login() {
        return "redirect:index.html";
//        return RespBean.error("尚未登录，请登录!");
    }

    @GetMapping("/employee/advanced/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @GetMapping("/employee/basic/hello")
    @ResponseBody
    public String basicHello() {
        return "basicHello";
    }
}
