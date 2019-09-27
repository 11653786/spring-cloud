package com.yt.spring.cloud.service.feign.histric;

import com.yt.spring.cloud.service.feign.RibbonService;
import org.springframework.stereotype.Component;

/**
 * @author yangtao
 * @date 2019/9/27下午5:26
 * @Description: TODO
 */
@Component
public class RibbonServiceHystric implements RibbonService {
    @Override
    public String hello(String name) {
        return "sorry," + name + "hystric";
    }
}
