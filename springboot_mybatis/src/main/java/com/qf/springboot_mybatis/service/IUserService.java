package com.qf.springboot_mybatis.service;

import com.qf.springboot_mybatis.entity.TUser;

/**
 * @author Oulingcheng
 * @Date 2019/7/29
 */
public interface IUserService {

    TUser getUserById(Long id);
}
