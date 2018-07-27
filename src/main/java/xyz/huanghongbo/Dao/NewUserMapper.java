package xyz.huanghongbo.Dao;

import org.apache.ibatis.annotations.Mapper;

import xyz.huanghongbo.domain.NewUser;

@Mapper
public interface NewUserMapper {
	/**
	 * 根据用户名查询用户
	 * @param name
	 * @return
	 */
	NewUser selectUserByName(String name);
	
	/*
	 * 创建用户
	 */
	void insertUser(NewUser user);
}
