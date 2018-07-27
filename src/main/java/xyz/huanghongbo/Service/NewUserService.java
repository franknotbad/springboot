package xyz.huanghongbo.Service;

import xyz.huanghongbo.domain.NewUser;

public interface NewUserService {

	public NewUser getNewUserByName(String name);
	
	public void insertUser(NewUser user);
}
