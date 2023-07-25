package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signinpage {
	WebDriver driver;
	
	By signinbtn=By.xpath("/html/body/main/div/div/div[2]/form/button");
	By emailIdField =By.xpath("/html/body/main/div/div/div[2]/form/div[1]/input");
	By fgearpassword =By.name("customer[password]");
	By icon=By.xpath("/html/body/div[2]/sticky-header/header/div/a[1]");

		public Signinpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
			this.driver=driver;
	}
public void icon()
{
	driver.findElement(icon).click();
}
		public void setvalues()
		{
			driver.findElement(emailIdField).sendKeys("jacobpullampallil@gmail.com");
			driver.findElement(fgearpassword).sendKeys("jacob123");
		}

		public void clickLoginBtn()
		{
			driver.findElement(signinbtn).click();
		}
}
