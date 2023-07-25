package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createaccountpage {
	WebDriver driver;
	By icon=By.xpath("/html/body/div[2]/sticky-header/header/div/a[1]");
	By createaccount=By.xpath("/html/body/main/div/div/div[2]/form/a[2]");
	By firstname=By.xpath("/html/body/main/div/div/form/div[1]/input");
	By lastname=By.xpath("/html/body/main/div/div/form/div[2]/input");
	By email=By.xpath("/html/body/main/div/div/form/div[3]/input");
	By password=By.xpath("/html/body/main/div/div/form/div[4]/input");
	By create=By.xpath("/html/body/main/div/div/form/button");
	
	public Createaccountpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void click()
	{
		driver.findElement(icon).click();
		driver.findElement(createaccount).click();
		
	}

	public void setvalues()
	{
		driver.findElement(firstname).sendKeys("megha");
		driver.findElement(lastname).sendKeys("jacob");
		driver.findElement(email).sendKeys("jacobpullampallil@gmail.com");
		driver.findElement(password).sendKeys("jacob123");
		
		
	}
	public void create()
	{
		driver.findElement(create).click();
	}
}
