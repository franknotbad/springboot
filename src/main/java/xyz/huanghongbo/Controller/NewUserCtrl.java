package xyz.huanghongbo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import xyz.huanghongbo.Dao.NewUserMapper;
import xyz.huanghongbo.domain.NewUser;

@RestController
@RequestMapping("/newUser")
public class NewUserCtrl {

	@Autowired
	private NewUserMapper newUserMapper;
	
	@Value("${xyz.huanghongbo.name}")
	private String name;

	@ApiOperation(value = "查找用户", notes = "根据username查找用户")
	@ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String", paramType = "path")
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public NewUser newUser(@PathVariable String name) {
		NewUser user = newUserMapper.selectUserByName(name);
		return user;
	}
}
