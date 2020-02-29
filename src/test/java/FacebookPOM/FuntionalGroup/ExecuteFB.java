package FacebookPOM.FuntionalGroup;

import org.testng.annotations.Test;

import Common.Browsers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class ExecuteFB extends Browsers {
	
  @Test (priority = 1)
  public void Homepage_execution() {
	  
	  HomePage homepage_obj = new HomePage(driver);
	  homepage_obj.email_field("m155@umbc.edu");
	  homepage_obj.email_field("abcd");
	  homepage_obj.log_in_button();  
	  

  }
  
  @Test (priority = 2)
  public void Secondpage_execution() {
	  
	  SecondPage second_page_obj = new SecondPage(driver);
	  second_page_obj.email_field2("m155@umbc.edu");
	  second_page_obj.password_field2("abcd");
	  second_page_obj.login_button2();
  }
  


}
