package LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import loginpage.login;

public class signinTest {
	WebDriver driver=null;
  @BeforeTest
  public void launch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vihaan\\Desktop\\Webdriver\\chromedriver.exe");
	  driver  =new ChromeDriver();
	  driver.get("http://www.demo.guru99.com/V4/");
  }
  
  @Test(dataProvider="dp")
  public void sign(String unm,String pwd)
  {
	 login l1= new login(driver);
	 l1.signin(unm,pwd);
  }
 
  @DataProvider
  public Object[][] dp() {
	  return new Object[][] {
	      new Object[] {"mngr247616","vynEhAh"}};
  
	  
  }
  @AfterTest
  public void teardown()
  {
	  driver.close();
  }
  }

