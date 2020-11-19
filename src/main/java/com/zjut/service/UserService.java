package com.zjut.service;

import com.zjut.pojo.User;

public interface UserService {
	User queryById(Long id);
	void saveUser(User user);
}
