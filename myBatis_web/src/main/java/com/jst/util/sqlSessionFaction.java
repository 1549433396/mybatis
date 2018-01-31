package com.jst.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class sqlSessionFaction {

	private static  SqlSessionFactory sf;
	private static SqlSession session;
	
	static{
		try {
			Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession() {
		session = sf.openSession();
		return session;
	}
	
	public static void closeSession() {
		session.commit();
		session.close();
	}
}
