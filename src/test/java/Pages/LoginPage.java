package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	// Locator for usernamefield
	@FindBy (name = "username" )
	private WebElement UserNameFiled;
	
	@FindBy (name ="password" )
	private WebElement PasswordField;
	
	@FindBy ( xpath = "//button[@type='submit']")
	private WebElement LoginButton;
	
	
	//Business Method
	public void loginToApp(String uname, String pass)
	{
		UserNameFiled.sendKeys(uname);
		PasswordField.sendKeys(pass);
		LoginButton.click();
		
	}

}
