package com.yt.spring.cloud.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yangtao
 * @date 2019/9/27下午4:45
 * @Description: TODO
 * 调用外部service
 * SERVICE-HI:其他项目实例名称
 */
@FeignClient(value = "SERVICE-HI")
public interface ServiceHiService {
    /**
     * 调用eureka-service-hi项目的
     * http://localhost:8765/hi?name=name
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);

}
