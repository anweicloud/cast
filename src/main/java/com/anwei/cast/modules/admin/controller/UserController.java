package com.anwei.cast.modules.admin.controller;


import com.anwei.cast.core.web.BaseController;
import com.anwei.cast.modules.admin.entity.User;
import com.anwei.cast.modules.admin.mapper.UserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Anwei
 * @since 2019-06-12
 */
@Controller
@RequestMapping("/admin/user")
public class UserController extends BaseController {

    @Resource
    UserMapper userMapper;

    @ResponseBody
    @RequestMapping("")
    public ResponseEntity<User> user() {
        User user = userMapper.selectById(1);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
