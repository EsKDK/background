package com.lcsw.background;

import com.lcsw.background.service.GetUrlService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;
@Component
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BackgroundApplicationTests.class)
public class testdemo {
    @Autowired
    GetUrlService getUrlService;

    @Test
    public void test1() throws UnsupportedEncodingException {
       // String url = getUrlService.getUrl();
        //System.out.println("url = " + url);
    }
}
