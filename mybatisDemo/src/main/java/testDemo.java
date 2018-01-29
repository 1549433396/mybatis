import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jst.dao.usersDao;
import com.jst.model.users;

public class testDemo {
	private SqlSessionFactory sf;
	private SqlSession session;
	private usersDao user;

	@Before
	public void before() {
		try {
			Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml");
			sf = new SqlSessionFactoryBuilder().build(reader);
			session = sf.openSession();
			user = session.getMapper(usersDao.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test1() {
		
		List<users> list = user.selectAll();
		for (users users : list) {
			System.out.println(users);
		}
	}

	@Test
	public void test2() {
		System.out.println(user.selectUserById(1));
	}

	@Test
	public void test3() {
		System.out.println(user.selectUserById(1));
	}

	@Test
	public void test4() {
		users users = new users();
		users.setUname("hahah");
		user.insertuser(users);;
	}

	@Test
	public void test5() {
		users users = new users();
		users.setUid(11);
		user.deleteuser(users);;
	}

	@Test
	public void test6() {
		user.deleteuserByid(7);;
	}

	@Test
	public void test7() {
		users users = new users();
		users.setUid(1);
		user.updateuserByid(users);
	}

	@After
	public void after() {
		session.commit();
		session.close();
	}

}
