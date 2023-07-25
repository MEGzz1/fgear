package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TCartpage {
	WebDriver driver;
	By carticon=By.xpath("/html/body/div[2]/sticky-header/header/div/a[2]");
	By checkout=By.xpath("/html/body/main/div[2]/div/div/div/div/div[2]/button");
	By address=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div/div[5]/div/input");
	By city=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div/div[7]/div/input");
	By state=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div/div[8]/div/select");
	By pincode=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div/div[9]/div/input");
	By phonenumber=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div/div[10]/div/input");
	By continueshipping=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[2]/button");

	public TCartpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void carticon()
	{
		driver.findElement(carticon).click();
		
	}
	public void checkout()
	{
		driver.findElement(checkout).click();
	}
	public void setvalues() throws Exception
	{
		driver.findElement(address).sendKeys("abcdefgh");
		Thread.sleep(2000);
		driver.findElement(city).sendKeys("ranny");
		Thread.sleep(2000);
		driver.findElement(pincode).sendKeys("689674");
		Thread.sleep(2000);
		driver.findElement(phonenumber).sendKeys("8589959346");
	}
	public void state()
	{
		Select s= new Select(driver.findElement(state));
		s.selectByVisibleText("Kerala");
	}
	
	public void continueshipping()
	{
		driver.findElement(continueshipping).click();
	}
}
