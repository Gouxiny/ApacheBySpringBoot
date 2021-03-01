package com.gxy.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gxy.entity.SysUser;
import com.gxy.entity.SysUserToken;


@Mapper
public interface SysUserTokenDao {

	
	Map<String,Object> queryById(String userId);
	void save(SysUserToken sysUserToken);
	void edit(SysUserToken sysUserToken);
	SysUserToken queryByToken(String token);
	SysUser findById(String userId);
	
}
