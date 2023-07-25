package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SProductpage {
WebDriver driver;
By Product=By.xpath("/html/body/div[2]/sticky-header/header/nav/ul/li[1]/header-menu/details/summary/span");
By laptopbag=By.xpath("/html/body/div[2]/sticky-header/header/nav/ul/li[1]/header-menu/details/ul/li[2]/a");
By selection=By.xpath("/html/body/main/div[2]/div/div/div/div/ul/li[3]/div/div/div[2]/div[1]/h3/a");
By addtocart=By.xpath("/html/body/main/section[1]/section/div/div[2]/product-info/div[6]/product-form/form/div/button");

public SProductpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public void click()
{
	driver.findElement(Product).click();
	driver.findElement(laptopbag).click();
	driver.findElement(selection).click();
	driver.findElement(addtocart).click();
}
}
