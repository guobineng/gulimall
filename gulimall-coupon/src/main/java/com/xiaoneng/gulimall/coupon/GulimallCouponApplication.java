package com.xiaoneng.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDiscoveryClient
@SpringBootApplication
//@NacosPropertySource(dataId = "gulimall-coupon.properties", autoRefreshed = true)
public class GulimallCouponApplication {

    public static void main(String[] args) {
       SpringApplication.run(GulimallCouponApplication.class, args);

//        String name = context.getEnvironment().getProperty("coupon.user.name");
//        String age = context.getEnvironment().getProperty("coupon.user.age");
//
//        System.out.println("name: " + name + "  age:" + age);
    }

}
