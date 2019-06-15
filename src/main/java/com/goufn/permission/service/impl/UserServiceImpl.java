package com.goufn.permission.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.goufn.permission.entity.SysUser;
import com.goufn.permission.mapper.PermissionMapper;
import com.goufn.permission.mapper.RoleMapper;
import com.goufn.permission.mapper.UserMapper;
import com.goufn.permission.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionMapper permissionMapper;



    @Override
    public SysUser getUserInfo(Integer userID) {
        return null;
    }

    @Override
    public SysUser getUserInfo(String userName) {
        QueryWrapper<SysUser> qryWrapper = new QueryWrapper<>();
        qryWrapper.eq("username", userName);
        return userMapper.selectOne(qryWrapper);
    }

    @Override
    public List<SysUser> getAllUserInfo() {
        return null;
    }

    @Override
    public void updateUserInfo(SysUser user) {

    }

    @Override
    public void deleteUserInfo(Integer userID) {

    }

    @Override
    public boolean insertUserInfo(SysUser user) {
        return false;
    }

    @Override
    public Set<String> getUserRoles(Integer userID) {
        return null;
    }
}
