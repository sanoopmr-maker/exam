package Test;

import org.testng.annotations.Test;

import Page.fbid;

public class fblogin extends baseclass {
	@Test
	public void testloging()
	{
		
		fbid id=new fbid(driver);
		id.setvalues("jocker13@gmail.com","jocker");
		id.login();
		
		
	}
	

}
