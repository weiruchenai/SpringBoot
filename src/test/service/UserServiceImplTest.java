package service;

import com.zjut.Application;
import com.zjut.pojo.User;
import com.zjut.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserServiceImplTest {
	@Autowired
	@Qualifier(value = "userService")
	private UserService userService;
	
	@Test
	public void queryByID(){
		User user = userService.queryById(5L);
		System.out.println(userService.queryById(5L));
		user.setId(50L);
		user.setUserName("agao");
		user.setName("阿高");
		user.setAge(24);
		user.setPassword("1116");
		userService.saveUser(user);
	}
	
}
