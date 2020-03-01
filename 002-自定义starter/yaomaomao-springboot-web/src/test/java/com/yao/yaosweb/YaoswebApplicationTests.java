package com.yao.yaosweb;

import com.yao.YaomaomaoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YaoswebApplicationTests {

    @Autowired
    YaomaomaoService yaomaomaoService;

    @Test
    void contextLoads() {
        yaomaomaoService.connectJDBC();
    }

}
