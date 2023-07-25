package test;

import org.testng.annotations.Test;

import base.Baseclass;
import page.SProductpage;

public class SProducttest extends Signintest{
	
	@Test(priority=2)
	public void verifyproduct() throws Exception
	{
		SProductpage pp=new SProductpage(driver);
		Thread.sleep(4000);
		pp.click();
	}
}
