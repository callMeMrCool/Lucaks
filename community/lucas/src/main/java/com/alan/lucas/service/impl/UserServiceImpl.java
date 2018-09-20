package com.alan.lucas.service.impl;

import com.alan.lucas.entity.User;
import com.alan.lucas.mapper.UserMapper;
import com.alan.lucas.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Alan
 * @since 2018-09-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
