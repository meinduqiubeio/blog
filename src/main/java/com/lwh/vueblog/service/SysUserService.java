package com.lwh.vueblog.service;

import com.lwh.vueblog.dao.pojo.SysUser;

public interface SysUserService {

    SysUser findUserById(Long id);
}
