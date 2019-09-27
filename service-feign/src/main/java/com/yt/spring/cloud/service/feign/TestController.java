package com.yt.spring.cloud.service.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangtao
 * @date 2019/9/27下午4:49
 * @Description: TODO
 */
@RestController
public class TestController {

    @Autowired
    ServiceHiService serviceHiService;
    @Autowired
    private RibbonService ribbonService;

    /**
     * 单纯调用方法
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String serviceHi(@RequestParam(name = "name") String name) {
        return serviceHiService.hi(name);
    }

    /**
     * 调用负载均衡之后的方法
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(name = "name") String name) {
        return ribbonService.hello(name);
    }
}
