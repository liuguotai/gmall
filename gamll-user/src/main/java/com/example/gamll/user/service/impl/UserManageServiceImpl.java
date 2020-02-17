package com.example.gamll.user.service.impl;

import com.example.gamll.user.mapper.UserInfoMapper;
import com.example.gamll.user.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserManageServiceImpl implements UserManageService{


    @Autowired
    UserInfoMapper userInfoMapper;


}
