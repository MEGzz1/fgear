package test;

import org.testng.annotations.Test;

import base.Baseclass;
import page.Createaccountpage;

public class Createtest extends Baseclass {
@Test
public void verifycreate()
{
	Createaccountpage ca=new Createaccountpage(driver);
	ca.click();
	ca.setvalues();
	ca.create();
}
}
