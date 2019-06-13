package com.anwei.cast.modules.admin.mapper;

import com.anwei.cast.modules.admin.entity.SysUser;
import com.anwei.cast.modules.admin.entity.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {


    @Resource
    UserMapper userMapper;

    @Resource
    SysUserMapper sysUserMapper;

    @Test
    public void testList() {
        List<User> list = userMapper.selectList(null);
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(json);
    }

    @Test
    public void testUpdate() {
        User u = new User();
        u.setId(2L);
        u.setAge(27);
        boolean b = u.updateById();
        Assert.assertEquals(true, b);
    }

    @Test
    public void testDelete() {
        int i = sysUserMapper.deleteById(2L);
        Assert.assertEquals(1, i);
    }

    @Test
    public void testSelect() {
        SysUser user = sysUserMapper.selectById(2);
        System.out.println(user);
    }


    @Test
    public void testInsert() {
        User u = new User();
        u.setAge(27);
        u.setName("Anwei2");
        u.setEmail("1@163.com");
        boolean b = u.insert();
        Assert.assertEquals(true, b);
    }

    @Test
    public void testInsert2() {
        SysUser u = new SysUser();
        u.setOrg_id(7L);
        u.setRegister_time(new Date());
        u.setTelephone("123");
        u.setPassword("123");
        u.setUsername("Anwei2");
        boolean b = u.insert();
        Assert.assertEquals(true, b);
    }


    @Test
    public void testUpdateByIdSucc() {
        User user = new User();
        user.setAge(18);
        user.setEmail("test@baomidou.com");
        user.setName("optlocker");
        user.setVersion(1);
        userMapper.insert(user);
        Long id = user.getId();

        User userUpdate = new User();
        userUpdate.setId(id);
        userUpdate.setAge(19);
        userUpdate.setVersion(1);
        Assert.assertEquals("Should update success", 1, userMapper.updateById(userUpdate));
        Assert.assertEquals("Should version = version+1", 2, userUpdate.getVersion().intValue());
    }

    @Test
    public void testUpdateByIdFail() {
        User user = new User();
        user.setAge(18);
        user.setEmail("test@baomidou.com");
        user.setName("optlocker");
        user.setVersion(1);
        userMapper.insert(user);
        Long id = user.getId();

        User userUpdate = new User();
        userUpdate.setId(id);
        userUpdate.setAge(19);
        userUpdate.setVersion(0);
        Assert.assertEquals("Should update failed due to incorrect version(actually 1, but 0 passed in)", 0, userMapper.updateById(userUpdate));
    }

    @Test
    public void testUpdateByEntitySucc() {
        QueryWrapper<User> ew = new QueryWrapper<>();
        ew.eq("version", 1);
        int count = userMapper.selectCount(ew);

        User entity = new User();
        entity.setAge(28);
        entity.setVersion(1);

        Assert.assertEquals("updated records should be same", count, userMapper.update(entity, null));
        ew = new QueryWrapper<>();
        ew.eq("version", 1);
        Assert.assertEquals("No records found with version=1", 0, userMapper.selectCount(ew).intValue());
        ew = new QueryWrapper<>();
        ew.eq("version", 2);
        Assert.assertEquals("All records with version=1 should be updated to version=2", count, userMapper.selectCount(ew).intValue());
    }


    /*
    分页测试
     */


    @Test
    public void lambdaPagination() {
        Page<User> page = new Page<>(1, 3);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("org_id", 7);
        wrapper.lambda().ge(User::getAge, 1);
        wrapper.lambda().between(User::getAge, 27, 28);
        IPage<User> result = userMapper.selectPage(page, wrapper);
        System.out.println(result.getTotal());
        Assert.assertTrue(result.getTotal() >= 3);
        Assert.assertEquals(3, result.getRecords().size());
    }
}