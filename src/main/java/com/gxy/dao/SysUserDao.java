package com.gxy.dao;


import org.apache.ibatis.annotations.Mapper;

import com.gxy.entity.SysUser;
import com.gxy.entity.SysUserToken;


@Mapper
public interface SysUserDao {

	//根据用户姓名查询
	SysUser findByUsername(String username);

	SysUserToken queryByToken(String token);

	SysUser findById(String userId);
	
	

}
