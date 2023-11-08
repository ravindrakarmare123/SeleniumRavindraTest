package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	
	@FindBy (xpath = "//span[text()=\"Leave\"]" )
	private WebElement Leavlink;
	
	
	public WebElement getLeavLink() {
		// TODO Auto-generated method stub
		return Leavlink;
	}



}
