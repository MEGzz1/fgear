package test;

import org.testng.annotations.Test;

import base.Baseclass;
import page.TCartpage;


public class TCarttest extends SProducttest{
	@Test(priority=3)
	public void verifycart() throws Exception
	{
		TCartpage cp=new TCartpage(driver);
		Thread.sleep(3000);
		cp.carticon();
		cp.checkout();
		cp.setvalues();
		cp.state();
		cp.continueshipping();
		
	}

}
