package com.cd.redis.service;

import com.cd.redis.cache.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("areaService")
public class AreaServiceImpl {

    @Autowired
    private JedisUtil jedisUtil;

    private static final String MYNAME = "myname";

    public void getAreaList() {
        //定义Redis的key名
        String key = MYNAME;
        //判断key是否存在
        if(jedisUtil.exists(key)){
            //若key存在，则从redis中获取
            String jsonString = jedisUtil.get(key);
            System.out.println("键值: " + jsonString);
        }else {
            System.out.println("出错啦！");
        }
    }

}
