package cn.xuqplus.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017-04-08.
 */
@Controller
@RequestMapping("/api")
public class AuthController {
    @RequestMapping("/auth")
    public void auth(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setAttribute("msg", "hahaha");
        //response.sendRedirect("xuqplus");//http://xuqunqun-8th:8080/api/xuqplus
        //response.sendRedirect("/xuqplus");//http://xuqunqun-8th:8080/xuqplus
        //response.sendRedirect("#xuqplus");//http://xuqunqun-8th:8080/api/#xuqplus
        response.sendRedirect("/#/xuqplus");//http://xuqunqun-8th:8080/#/xuqplus
    }

    /**
     * 重定向,视angular能否捕获
     */
    @RequestMapping("/redirect")
    public void redirect(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setAttribute("msg", "hahaha");
        response.sendRedirect("/angular/my-app.html;param=abcdef?user=007&id=1&name=xx&pwd=123#!/a");
    }
}
