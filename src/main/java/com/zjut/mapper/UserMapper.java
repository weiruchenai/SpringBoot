package com.zjut.mapper;

import com.zjut.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository(value = "userMapper")
public interface UserMapper extends Mapper<User> {
}
