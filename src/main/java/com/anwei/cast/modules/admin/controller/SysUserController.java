package com.anwei.cast.modules.admin.controller;


import com.anwei.cast.core.web.BaseController;
import com.anwei.cast.modules.admin.entity.SysUser;
import com.anwei.cast.modules.admin.mapper.SysUserMapper;
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
 * @since 2019-06-13
 */
@Controller
@RequestMapping("/admin/sys-user")
public class SysUserController extends BaseController {
    @Resource
    SysUserMapper sysUserMapper;

    @ResponseBody
    @RequestMapping("")
    public ResponseEntity<SysUser> sysUser() {
        SysUser sysUser = sysUserMapper.selectById(1);
        return new ResponseEntity<>(sysUser, HttpStatus.OK);
    }
}
