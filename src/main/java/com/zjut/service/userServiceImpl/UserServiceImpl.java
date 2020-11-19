package com.zjut.service.userServiceImpl;

import com.zjut.mapper.UserMapper;
import com.zjut.pojo.User;
import com.zjut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier(value = "userMapper")
	private UserMapper userMapper;
	
	@Override
	public User queryById(Long id) {
		System.out.println("根据id查询用户..");
		return userMapper.selectByPrimaryKey(id);
	}
	
	
	@Override
	@Transactional //这里直接加注解就行，为得是若保存时存在多个数据库的操作，得保证事务的原子性
	public void saveUser(User user) {
		System.out.println("新增用户...");
		userMapper.insertSelective(user);
	}
}
