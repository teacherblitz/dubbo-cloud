package com.teacherblitz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 服务提供方
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since: 2020-08-14
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApplication
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext run = SpringApplication.run(ProviderApplication.class, args);
        System.err.println("【系统消息】：当前运行环境:" + run.getEnvironment().getActiveProfiles()[0]);
    }
}
