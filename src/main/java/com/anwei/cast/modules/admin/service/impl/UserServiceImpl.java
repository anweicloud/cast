package com.anwei.cast.modules.admin.service.impl;

import com.anwei.cast.modules.admin.entity.User;
import com.anwei.cast.modules.admin.mapper.UserMapper;
import com.anwei.cast.modules.admin.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Anwei
 * @since 2019-06-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
