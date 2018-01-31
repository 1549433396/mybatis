package com.jst.dao;

import java.util.List;

import com.jst.model.users;

public interface usersDao {
	public List<users> selectAll();
	public void insertuser(users users);
	public void deleteuser(users users);
	public users selectuserByid(int uid);
	public users deleteuserByid(int uid);
	public void updateuserByid(users users);
}