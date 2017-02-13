package jonny.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import jonny.mybatis.utility.SqlProvider;

public interface UserMapper
{

	@SelectProvider(type = SqlProvider.class, method="selectUser")
	public User selectUser(int id);
	
	
	public List<User> selectAll();
	
	@Insert("insert into user (userName, userPwd) values (#{userName}, #{userPwd})")
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
}
