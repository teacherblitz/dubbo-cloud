package com.teacherblitz.service.impl;

import com.teacherblitz.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * 入门案例接口实现
 * 
 * @author: <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since: 2020/8/14
 */
@DubboService(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String
                .format("[%s]：Hello, %s",
                        serviceName, name);
    }
}
