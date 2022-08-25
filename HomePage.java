package Sc1.Scenario1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(className="login")
	WebElement signIn;
	
	@FindBy(id="email")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="SubmitLoginbtn")
	WebElement logIn;
	
	
	public HomePage(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }
	
	
	public void signInClick() {
		signIn.click();
	}
	
	public void sendEmail(String email)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].scrollIntoView(true);", userName);

		userName.sendKeys(email);
	}
	
	public void sendPwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		logIn.click();
	}
	

}
