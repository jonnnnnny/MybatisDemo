package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import jonny.mybatis.User;
import jonny.mybatis.utility.MyBatisUtils;

public class MyTest
{

	@Test
	public void testSelect() throws IOException
	{
		SqlSession session = MyBatisUtils.openSession();
		String statement = "jonny.mybatis.userMapper.selectUser";
		User user = session.selectOne(statement,1);
		System.out.println(user.toString());
		session.close();
	}
	
	@Test
	public void testSelectAll() throws IOException
	{
		SqlSession session = MyBatisUtils.openSession();
		String statement = "jonny.mybatis.userMapper.selectAll";
		List<User> users = session.selectList(statement);
		System.out.println(users);
		session.close();
	}
	
	@Test
	public void testInsert() throws IOException
	{
		SqlSession session = MyBatisUtils.openSession();
		String statement = "jonny.mybatis.userMapper.addUser";
		User user = new User();
		
		user.setUserName("jonny");
		user.setUserPwd("222");
		session.insert(statement,user);
		session.commit();
		session.close();
	}

	@Test
	public void testUpdate() throws IOException
	{
		SqlSession session = MyBatisUtils.openSession();
		String statement = "jonny.mybatis.userMapper.updateUser";
		User user = new User();
		user.setId(2);
		user.setUserName("jonny");
		user.setUserPwd("8888");
		session.update(statement,user);
		session.commit();
		session.close();
	}
	@Test
	public void testDelete() throws IOException
	{
		SqlSession session = MyBatisUtils.openSession();
		String statement = "jonny.mybatis.userMapper.deleteUser";
		session.delete(statement, 2);
		session.commit();
		session.close();
	}
}
