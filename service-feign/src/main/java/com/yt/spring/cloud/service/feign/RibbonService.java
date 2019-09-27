package com.yt.spring.cloud.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yangtao
 * @date 2019/9/27下午4:59
 * @Description: TODO
 */
@FeignClient(value = "SERVICE-RIBBON")
public interface RibbonService {

    /**
     * ribbon负载均衡之后的方法
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam(name = "name") String name);
}
