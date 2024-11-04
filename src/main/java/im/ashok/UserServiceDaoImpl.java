package im.ashok;

public class UserServiceDaoImpl  implements UserServiceDao{

	public UserServiceDaoImpl()
	{
		System.out.println("dao called");
	}
	@Override
	public String findName(int id) {
		// TODO Auto-generated method stub
		
		if(id==100)
		{
			System.out.println("raju");
		}
		else
		{
			System.out.println("rani");
		}
		return null;
	}

}
