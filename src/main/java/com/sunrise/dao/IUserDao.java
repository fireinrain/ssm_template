package com.sunrise.dao;

import com.sunrise.model.User;

import java.util.ArrayList;

public interface IUserDao {
    /**
     * 获取所有user
     * @return
     */
    ArrayList<User> getAllUser();

    /**
     * 获取特定id User
     * @param id
     * @return
     */
    User selectUser(Long id);
}
