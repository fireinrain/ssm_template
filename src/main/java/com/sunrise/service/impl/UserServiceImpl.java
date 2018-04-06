package com.sunrise.service.impl;

import com.sunrise.dao.IUserDao;
import com.sunrise.model.User;
import com.sunrise.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService{
    @Resource
    private IUserDao userDao;
    @Override
    public User selectUser(Long id) {
        return this.userDao.selectUser(id);
    }
}
