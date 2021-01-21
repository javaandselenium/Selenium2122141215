package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo {
	@FindBy(id="email")
	private WebElement emailaddresstb;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	Demo(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void emailtb(String email) {
		emailaddresstb.sendKeys(email);
	}
	
	public void passwordtb(String pass) {
		passwordtb.sendKeys(pass);
	}

}
