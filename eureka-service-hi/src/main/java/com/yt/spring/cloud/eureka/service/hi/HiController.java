package com.yt.spring.cloud.eureka.service.hi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangtao
 * @date 2019/9/27上午11:26
 * @Description: TODO
 */
@Controller
@RestController
public class HiController {

    @Autowired
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam(value = "name") String name) {
        return "hi" + name + "i am from port: " + port;
    }
}
