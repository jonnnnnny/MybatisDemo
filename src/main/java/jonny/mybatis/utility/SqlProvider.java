package jonny.mybatis.utility;

public class SqlProvider
{

	public String selectUser()
	{
		return "select * from User where id = #{id}";
	}
	
	public String addUser()
	{
		return "insert into user (userName, userPwd) values (#{userName}, #{userPwd})";
	}
}
