package com.gxy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxy.dao.SysUserDao;
import com.gxy.dao.SysUserTokenDao;
import com.gxy.entity.SysUser;
import com.gxy.entity.SysUserToken;


@Service
public class ShiroService {

	@Autowired
	private SysUserTokenDao appUserDao;
	
	@Autowired
	private SysUserDao sysUserDao;

	public SysUserToken queryByToken(String token) {
		// TODO Auto-generated method stub
		return appUserDao.queryByToken(token);
	}

	public SysUser queryUser(String userId) {
		// TODO Auto-generated method stub
		return sysUserDao.findById(userId);
	}
	
}
