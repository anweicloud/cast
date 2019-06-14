package com.anwei.cast.framework.web.service.impl;

import com.anwei.cast.framework.web.service.BaseService;
import com.anwei.cast.modules.admin.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Anwei
 * @TODO: TODO
 * @date 2019/6/14 15:56
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class BaseServiceImplTest {


    @Resource
    BaseService service;

    @Test
    public void findById() {
        System.out.println(service.findById(SysUser.class, 2));
    }
}