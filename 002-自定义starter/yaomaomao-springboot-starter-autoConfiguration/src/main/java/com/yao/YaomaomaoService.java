package com.yao;

public class YaomaomaoService {

    private YaomaomaoProperties yaomaomaoProperties;

    public void setYaomaomaoProperties(YaomaomaoProperties yaomaomaoProperties) {
        this.yaomaomaoProperties = yaomaomaoProperties;
    }

    public boolean connectJDBC() {

        System.out.println("数据库连接中");

        // 这里只是伪代码
        // 如果有数据库，也可以真正地加载driverClassName，进行JDBC连接
        System.out.println( "url=" + yaomaomaoProperties.getUrl() +
                ",\n userName=" + yaomaomaoProperties.getUserName() +
                ",\n pwd=" + yaomaomaoProperties.getPwd() +
                ",\n type=" + yaomaomaoProperties.getType() +
                ",\n driverClassName=" + yaomaomaoProperties.getDriverClassName() );

        System.out.println("连接成功");
        return true;
    }





}
