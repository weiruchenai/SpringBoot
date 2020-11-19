package com.zjut.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

//
@Data
@Table(name = "tb_user")
public class User {
	@Id
	@KeySql(useGeneratedKeys = true)//开孔主键自动回填
	private Long id;
	
	private String userName;
	
	private String password;
	
	private String name;
	
	private Integer age;
	
	private Integer sex;
	
	private Date birthday;
	
	private String note;
	
	private Date created;
	
	private Date updated;
}
