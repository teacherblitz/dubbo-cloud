package com.teacherblitz.service.impl;

import com.teacherblitz.service.DubboCloudService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * 入门案例接口实现
 * 
 * @author: <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since: 2020/8/14
 */
@Slf4j
@DubboService(version = "1.0.0")
public class DubboCloudServiceImpl implements DubboCloudService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        log.info("【服务提供者】：接收到数据name：{}", name);
        return String
                .format("[%s]：Hello, %s",
                        serviceName, name);
    }
}
