package com.yao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

/**
 * @author 姚毛毛
 * @version V1.0
 * @Description: 仿照dataSource写个自动配置类
 * @date 2020/02/29
 */
@ConfigurationProperties(prefix = "spring.yaomaomao")
// 此注解表示在application.properties中，以spring.yaomaomao为前缀，映射赋值给这个类的字段
@Repository
public class YaomaomaoProperties {

    /* 连接地址 */
    private String url;

    /* 用户 */
    private String userName;

    /* 密码 */
    private String pwd;

    /* 数据库类型 */
    private String type;

    /* 驱动包 */
    private String driverClassName;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
}
