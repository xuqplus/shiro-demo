package cn.xuqplus.controller;

import cn.xuqplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-04-08.
 */
@Controller
@RequestMapping("/api")
public class DemoController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/demo")
    @ResponseBody
    public Map demo() {
        Map result = new HashMap();
        result.put("success", true);
        result.put("user", userMapper.findById(1l));
//        result.put("users", userMapper.findAll());
        return result;
    }
}
