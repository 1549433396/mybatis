package com.jst.service;
import org.apache.ibatis.session.SqlSession;

import com.jst.dao.usersDao;
import com.jst.model.users;
import com.jst.util.sqlSessionFaction;

public class seivice {
	private SqlSession session;
	private usersDao userss;
	public users select(int id) {
		try {
			session = sqlSessionFaction.getSession();
			userss = session.getMapper(usersDao.class);
			users u = userss.selectuserByid(id);
			return u;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSessionFaction.closeSession();
		}
		return null;
	}
	
	public void registUser(users users) {
		session = sqlSessionFaction.getSession();
		userss = session.getMapper(usersDao.class);
		userss.insertuser(users);
		sqlSessionFaction.closeSession();
	}

}
