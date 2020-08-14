package com.teacherblitz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务消费方
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since: 2020-08-14
 */
@SpringBootApplication
public class CustomerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
