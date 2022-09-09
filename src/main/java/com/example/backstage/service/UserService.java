package com.example.backstage.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.backstage.entity.User;
import com.example.backstage.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/9/9 8:41
 * @since JDK17
 */

@Service
public class UserService extends ServiceImpl<UserMapper,User> {


    public boolean saveUser(User user) {
        return saveOrUpdate(user);
    }
}
