package jonny.mybatis;

public class User
{

	private int id;
	private String userName;
	private String userPwd;
	public User(){}
	public User( String name, String pwd)
	{
	
		this.userName=name;
		this.userPwd = pwd;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getUserPwd()
	{
		return userPwd;
	}
	public void setUserPwd(String userPwd)
	{
		this.userPwd = userPwd;
	}
	@Override
	public String toString()
	{
		return "User [id=" + id + ", userName=" + userName + ", userPwd=" + userPwd + "]";
	}
	
	
}
