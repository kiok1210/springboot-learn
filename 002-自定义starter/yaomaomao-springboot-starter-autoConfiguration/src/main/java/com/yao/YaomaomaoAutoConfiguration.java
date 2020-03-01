package com.yao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(YaomaomaoProperties.class) // 指定自动装载类
@Configuration // 声明是配置类
@ConditionalOnWebApplication // web应用
public class YaomaomaoAutoConfiguration {

    @Autowired
    YaomaomaoProperties yaomaomaoProperties;

    @Bean
    public YaomaomaoService yaomaomaoService() {
        YaomaomaoService yaomaomaoService = new YaomaomaoService();
        yaomaomaoService.setYaomaomaoProperties(yaomaomaoProperties);
        return yaomaomaoService;
    }
}
