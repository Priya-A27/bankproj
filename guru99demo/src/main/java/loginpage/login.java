package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class login {
	
WebDriver driver=null;
	


//By username=By.name("uid");
//By password=By.name("password");
//By login =By.name("btnLogin");
public login(WebDriver driver)
{
	this.driver=driver;
}

public void signin(String unm,String pwd)
{

	WebElement u=driver.findElement(By.xpath("//input[@name='uid']"));
	//u.click();
	
	u.sendKeys(unm);
	WebElement p= driver.findElement(By.xpath("//input[@name='password']"));
	//p.click();
	
	p.sendKeys(pwd);
	driver.findElement(By.name("btnLogin")).click();


}
}
