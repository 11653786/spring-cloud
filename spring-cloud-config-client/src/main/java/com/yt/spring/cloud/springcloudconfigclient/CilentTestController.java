package com.yt.spring.cloud.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangtao
 * @date 2019/8/19下午6:41
 * @Description: TODO
 */
@RestController
@RequestMapping(value = "/cilent")
public class CilentTestController {

    @Value("servername")
    private String servername;

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() {
        return servername;
    }
}
