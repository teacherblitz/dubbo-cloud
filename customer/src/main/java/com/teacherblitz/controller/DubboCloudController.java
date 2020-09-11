package com.teacherblitz.controller;

import com.teacherblitz.service.DubboCloudService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试demo
 * 
 * @author: <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since: 2020/8/14
 */
@Slf4j
@RestController
@RequestMapping("/dubbo")
public class DubboCloudController {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @DubboReference(version = "1.0.0")
    private DubboCloudService dubboCloudService;

    /**
     * 测试案例
     * @return
     */
    @RequestMapping("/")
    public String dayHello() {
        String name = dubboCloudService.sayHello("teacherblitz");
        log.info("【服务消费者】：接收到消息={}", name);
        return name;
    }

}
