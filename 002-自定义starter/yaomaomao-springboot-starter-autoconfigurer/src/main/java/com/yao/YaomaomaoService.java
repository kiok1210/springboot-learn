package com.yao;

public class YaomaomaoService {

    private YaomaomaoProperties yaomaomaoProperties;

    public YaomaomaoProperties getYaomaomaoProperties() {
        return yaomaomaoProperties;
    }

    public void setYaomaomaoProperties(YaomaomaoProperties yaomaomaoProperties) {
        this.yaomaomaoProperties = yaomaomaoProperties;
    }

    public String getYaomaomao(String key) {
        return yaomaomaoProperties.getPrefix() + "--" + key + "--" + yaomaomaoProperties.getSuffix();

    }

}
