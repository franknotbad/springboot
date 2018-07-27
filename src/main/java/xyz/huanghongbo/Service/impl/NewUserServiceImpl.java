package xyz.huanghongbo.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.huanghongbo.Dao.NewUserMapper;
import xyz.huanghongbo.Service.NewUserService;
import xyz.huanghongbo.domain.NewUser;

@Service
public class NewUserServiceImpl implements NewUserService {
	
	@Autowired
	private NewUserMapper newUserMapper;

	@Override
	public NewUser getNewUserByName(String name) {
		return newUserMapper.selectUserByName(name);
	}

}
