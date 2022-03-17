package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.如何使用nacos作为配置中心统一管理配置
 *  1).引入依赖
 *   <dependency>
 *         <groupId>com.alibaba.cloud</groupId>
 *         <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *   </dependency>
 *  2). 创建一个bootstrap.properties
 *  spring.application.name=gulimall-coupon
 *  spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *  3).需要给配置中心添加一个叫 数据集(Date Id) gulimall-coupon.properties.默认规则：应用名.properties
 *  4).给应用名.properties添加任意配置
 *  5).动态获取配置
 *  @RefreshScope：动态获取并刷新配置
 *  @Value("${配置项的名}")：获取到配置
 *  如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置。
 *
 * 2.细节
 *  1).命名空间：配置隔离；
 *      默认：public(保留空间)；默认新增的所有配置都在public空间。
 *      注意：bootstrap.propertes;需要使用哪个命名空间下的配置,
 *      spring.cloud.nacos.config.namespace=ac4281da-e2b6-4d04-8d67-1331441cfd6b
 *
 *  2).配置集:所有的配置的集合
 *
 *  3).配置集ID:Data ID，类似配置文件名
 *
 *  4).配置集分组:
 *  默认所有的配置集都属于:DEFAULT_GROUP.
 *  1111,618
 *
 * 每个微服务创建自己的命名空间，使用配置分组区分环境，pro,test,dev
 *
 *
 * 3.同时加载多个数据集
 *  1).微服务任何配置信息，任何配置文件都可以放在配置中心中
 *  2).只需要在bootstrap.yml说明加载配置中心中哪些配置文件即可
 *  3).@Value @ConfigurationProperties
 *  以前SpringBoot任何方式从配置文件中获取值，都能使用。
 *  配置中心中有的优先使用配置中心的
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
