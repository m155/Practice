package FacebookPOM.FuntionalGroup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public static WebDriver driver;
	
	@FindBy (id = "email") WebElement email_id;
	@FindBy (id = "pass") WebElement pass_word;
	@FindBy (xpath = "//*[@aria-label = 'Log In']") WebElement login_button;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void email_field(String email) {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		email_id.sendKeys(email);
	}
	
	public void password_field (String password) {
		pass_word.sendKeys(password);
	}
	
	public void log_in_button() {
		login_button.click();
	}
	
	public void clear_id() {
		email_id.clear();
	}

}
