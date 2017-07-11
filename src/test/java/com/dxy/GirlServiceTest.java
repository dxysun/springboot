package com.dxy;

import com.dxy.domain.Girl;
import com.dxy.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by dongx on 2017/6/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest() {

        Girl girl = girlService.findOne((long)7);
        Assert.assertEquals(new Integer(21), girl.getAge());
    }
}
