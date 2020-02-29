package FacebookPOM.FuntionalGroup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {
	
	public static WebDriver driver;
	
	@FindBy (name = "email") WebElement email_id;
	@FindBy (name = "pass") WebElement pass_word;
	@FindBy (name = "login") WebElement login_secondpage;
	
	public SecondPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void email_field2(String email) {
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		email_id.sendKeys(email);
	}
	
	public void password_field2(String password) {
		pass_word.sendKeys(password);
	}
	
	public void login_button2() {
		login_secondpage.click();
	}

}
