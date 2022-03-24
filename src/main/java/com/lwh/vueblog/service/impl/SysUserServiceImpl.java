package com.lwh.vueblog.service.impl;

import com.lwh.vueblog.dao.mapper.SysUserMapper;
import com.lwh.vueblog.dao.pojo.SysUser;
import com.lwh.vueblog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser findUserById(Long id) {
        SysUser sysUser = (SysUser) sysUserMapper.selectById(id);
        if (sysUser == null){
            sysUser=new SysUser();
            sysUser.setNickname("Guest");
        }
        return (SysUser) sysUserMapper.selectById(id);
    }
}
