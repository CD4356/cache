package com.cd.redis;

import com.cd.redis.service.AreaServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaServiceImplTest {

    @Autowired
    private AreaServiceImpl areaService;

    @Test
    public void demo(){
        areaService.getAreaList();
    }

}
