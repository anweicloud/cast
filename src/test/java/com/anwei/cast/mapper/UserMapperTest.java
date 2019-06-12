//package com.anwei.cast.mapper;
//
//import com.anwei.cast.entity.User;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserMapperTest {
//
//    @Resource
//    UserMapper userMapper;
//
//    @Test
//    public void testSelect() {
//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
//    }
//
//    @Test
//    public void testUpdate() {
//        System.out.println(("----- Update method test ------"));
//        User user = new User();
//        user.setId(1L);
//        user.setName("Anwei");
//        int row = userMapper.updateById(user);
//        Assert.assertEquals(1, row);
//    }
//
//
//    @Test
//    public void testInsert() {
//        System.out.println(("----- Insert method test ------"));
//        User user = new User();
//        user.setName("Anwei");
//        user.setAge(27);
//        user.setEmail("anwei@163.com");
//        int row = userMapper.insert(user);
//        Assert.assertEquals(1, row);
//    }
//
//    @Test
//    public void testDelete() {
//        System.out.println(("----- Delete method test ------"));
//        User user = new User();
//        user.setName("Billie");
//        int row = userMapper.insert(user);
//        Assert.assertEquals(1, row);
//    }
//
//}