package xyz.huanghongbo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import xyz.huanghongbo.entity.NewUser;

@Mapper
@Repository
public interface NewUserMapper {
	NewUser selectUserByName(String name);
}
