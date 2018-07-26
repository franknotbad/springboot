package xyz.huanghongbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.huanghongbo.dao.NewUserMapper;
import xyz.huanghongbo.entity.NewUser;

@RestController
public class NewUserCtrl {

	@Autowired
	private NewUserMapper newUserMapper;
	
	@RequestMapping("/wzdsg")
	public NewUser newUser() {
		NewUser user = newUserMapper.selectUserByName("yiibai");
		return user;
	}
}
