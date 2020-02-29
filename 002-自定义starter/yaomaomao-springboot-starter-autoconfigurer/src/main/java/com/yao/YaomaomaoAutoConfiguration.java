package com.yao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 配置类
@ConditionalOnWebApplication // web应用
@EnableConfigurationProperties(YaomaomaoProperties.class)
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
