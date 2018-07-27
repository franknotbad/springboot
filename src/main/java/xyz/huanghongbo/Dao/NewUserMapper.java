package xyz.huanghongbo.Dao;

import org.apache.ibatis.annotations.Mapper;

import xyz.huanghongbo.domain.NewUser;

@Mapper
public interface NewUserMapper {
	NewUser selectUserByName(String name);
}
