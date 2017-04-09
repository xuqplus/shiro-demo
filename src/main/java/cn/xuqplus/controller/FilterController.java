package cn.xuqplus.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.HttpMethodPermissionFilter;
import org.apache.shiro.web.filter.authz.PermissionsAuthorizationFilter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuqplus on 17-4-9.
 */
@RestController
public class FilterController {
    @RequestMapping("/")
    public Map demo() {
        Map result = new HashMap();
        result.put("success", true);
        /**
         * 常用的自定义过滤器
         * 1.rest 2.perms
         */
        new HttpMethodPermissionFilter();
        new PermissionsAuthorizationFilter();
        return result;
    }

    @RequestMapping("/api/login")
    public Map login(HttpServletResponse response) throws IOException {
        Map result = new HashMap();
        Subject subject = SecurityUtils.getSubject();
        /**
         * 登录操作
         */
        AuthenticationToken token = new UsernamePasswordToken("xqq", "123");
        subject.login(token);
        result.put("success", true);
        response.sendRedirect("/index.html");
        return result;
    }
}
