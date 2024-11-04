package im.ashok;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext("beans.xml");
//		UserServiceImpl un=context.getBean(UserServiceImpl.class);
//		System.out.println(un);
//		un.getName(100);

	}

}
