package TestScripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Genericlib.BaseClass;
import Genericlib.WebdriverCommonLib;
import Pages.DashboardPage;
import Pages.LeavePage;
import Pages.LoginPage;

public class Assignment1 extends BaseClass {
	
	
	@Test
	public void addLeaveTest()
	{   
		//Login to application
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
	
		lp.loginToApp("Admin", "admin123");
		
		// click on leave
		DashboardPage dp = PageFactory.initElements(driver, DashboardPage.class);
		dp.getLeavLink().click();
		
		LeavePage LeavePage = PageFactory.initElements(driver, LeavePage.class);
		
		// click on entitlement
		WebElement ele = LeavePage.getEntitlement();
		
		WebdriverCommonLib wlb = new WebdriverCommonLib();
		wlb.selectByVisibleText(ele,"Add Entitlements");
		
		// click on individual employee
				
		LeavePage.getIndividualEmployeeCheckbox().click();
		
		// Enter employee text
		
		LeavePage.getEmployeeNameTextField().sendKeys("test");
		LeavePage.getEmployeeNameTextField().sendKeys(Keys.ARROW_DOWN);
		LeavePage.getEmployeeNameTextField().sendKeys(Keys.ENTER);
		
		//Add leave type
		
		WebElement leavetype = LeavePage.getLeaveTypeFiled();
		wlb.selectByValue(leavetype, "CAN - Personal");
		
		//Add Leave Period
		
	    WebElement leaveperiod = LeavePage.getLeavePeriodFiled();
		wlb.selectByVisibleText(leaveperiod, "01-01-2024 - 12-31-2024");
		
		// Add Entitlement Text
		
		LeavePage.getEntitlementTextBox().sendKeys("10");
		
		//Click on Save
		
		LeavePage.getclickOnSaveButton().click();
		
		//Click Confirm in the pop up
		
		
		LeavePage.getConfirmOnPopUp().click();
		
		
		
	}
	
	@Test
	public void verifyLeaveTest()
	{
		
	}

}
