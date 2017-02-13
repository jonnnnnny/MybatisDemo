package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import jonny.mybatis.User;
import jonny.mybatis.UserMapper;
import jonny.mybatis.utility.MyBatisUtils;

public class MapperTest
{

	@Test
	public void testSelectAll() throws IOException
	{
		SqlSession session = MyBatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> users = mapper.selectAll();
		System.out.println(users);
	}

	@Test
	public void testSelectUser() throws IOException
	{
		SqlSession session = MyBatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.selectUser(1);
		System.out.println(user);
	}
	@Test
	public void testInsertUser() throws IOException
	{
		SqlSession session = MyBatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user=new User( "jonny", "123456");
		mapper.addUser(user);
		session.commit();
		session.close();
	}
}
