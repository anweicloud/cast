package com.anwei.cast.modules.common.service.impl;

import com.anwei.cast.modules.admin.entity.User;
import com.anwei.cast.modules.common.service.BaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Anwei
 * @TODO: TODO
 * @date 2019/6/13 17:32
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseServiceImplTest {

    @Resource
    BaseService service;

    @Test
    public void findById() {
        User user = service.findById(User.class, 2);
        System.out.println(user);
    }
}