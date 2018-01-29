package com.jst.dao;

import java.util.List;

import com.jst.model.users;

public interface usersDao {
	
	public users selectUserById(int uid);
	public List<users> selectAll();
	public void insertuser(users users);
	public void deleteuser(users users);
	public void deleteuserByid(int uid);
	public void updateuserByid(users users);
}