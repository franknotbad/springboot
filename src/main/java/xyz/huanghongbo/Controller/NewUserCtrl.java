package xyz.huanghongbo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import xyz.huanghongbo.Service.NewUserService;
import xyz.huanghongbo.domain.NewUser;

@RestController
@RequestMapping("/newUser")
public class NewUserCtrl {

	@Autowired
	private NewUserService newUserService;

	@Value("${xyz.huanghongbo.name}")
	private String name;

	@ApiOperation(value = "查找用户", notes = "根据username查找用户")
	@ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String", paramType = "path")
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public NewUser getUserByName(@PathVariable String name) {
		NewUser user = newUserService.getNewUserByName(name);
		return user;
	}

	@ApiOperation(value = "创建用户", notes = "创建用户")
	@ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "NewUser", paramType = "body")
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void insertUser(@RequestBody NewUser user) {
		newUserService.insertUser(user);
	}
}
