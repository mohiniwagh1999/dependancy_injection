package im.ashok;

public class UserServiceImpl  implements  UserService{
	public UserServiceDao us;
	
	public UserServiceImpl ()
	{
		System.out.println("userserviceImpl");
	}
 public  UserServiceImpl(UserServiceDao us)
 {
	 System.out.println("param constructor");
	 this.us=us;
 }
 
 
 public  void setUs(UserServiceDao us)
 {
	 System.out.println("setter called");
	this.us=us;
 }
 
	
	
	

	@Override
	public String getName(int id) {
		// TODO Auto-generated method stub
		String name=us.findName(id);
		return name;
		
	}
	

}
