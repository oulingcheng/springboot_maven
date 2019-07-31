package com.qf.springboot_mybatis.service.impl;

import com.qf.springboot_mybatis.entity.TUser;
import com.qf.springboot_mybatis.mapper.TUserMapper;
import com.qf.springboot_mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Oulingcheng
 * @Date 2019/7/29
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private TUserMapper userMapper;


    @Override
    public TUser getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
