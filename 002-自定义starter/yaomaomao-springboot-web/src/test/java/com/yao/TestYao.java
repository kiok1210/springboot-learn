package com.yao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = YaosWebApp.class)

public class TestYao {

    @Autowired
    YaomaomaoService yaomaomaoService;

    @Test
    public void testYao() {
        System.out.println( yaomaomaoService.getYaomaomao("姚毛毛") );

    }

}
