package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage {
	
			
	@FindBy (xpath = "//span[text()='Entitlements ']" )
	private WebElement Entitlements;
	
	
	@FindBy (xpath = "//label[text()='Individual Employee']" )
	private WebElement IndividualEmployeeCheckBox;
			
			
	@FindBy (xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']" )
	private WebElement EmployeeNameTextField;
	
	@FindBy (xpath = "//div[text()='-- Select --']")
	private WebElement LeaveType;
	
	@FindBy (xpath = "//div[text()='01-01-2023 - 12-31-2023']")
			private WebElement LeavePeriodField;
	
	@FindBy (xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement EntitlementTextBox;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickOnSaveButton;
	
	@FindBy (xpath = "//button[text()=\" Confirm \"]")
	private WebElement ConfirmOnPopUp;
	
	public WebElement getIndividualEmployeeCheckbox()
	{
		return IndividualEmployeeCheckBox;
	}
	
	public WebElement getEmployeeNameTextField()
	{
		return EmployeeNameTextField;
	}

	public WebElement getEntitlement() {
		// TODO Auto-generated method stub
		return Entitlements;
	}
	
	public WebElement getLeaveTypeFiled() {
		// TODO Auto-generated method stub
		return LeaveType;
	}

	public WebElement getLeavePeriodFiled() {
		// TODO Auto-generated method stub
		return LeavePeriodField;
	}
	
	public WebElement getEntitlementTextBox() {
		// TODO Auto-generated method stub
		return EntitlementTextBox;
	}
	
	public WebElement getclickOnSaveButton() {
		// TODO Auto-generated method stub
		return clickOnSaveButton;
	}

	public WebElement getConfirmOnPopUp() {
		
		// TODO Auto-generated method stub
		return ConfirmOnPopUp;
	}

}
