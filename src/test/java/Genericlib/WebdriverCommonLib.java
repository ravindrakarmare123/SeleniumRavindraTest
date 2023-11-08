package Genericlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebdriverCommonLib {
	
	

	public void selectByIndex (WebElement ele , int i)
	{
		Select s = new Select (ele);
		s.selectByIndex(0);
	}
	
	public void selectByValue(WebElement ele, String s)
	{
		Select sv = new Select (ele);
		sv.selectByValue(s);
	}
	
	public void selectByVisibleText(WebElement ele, String s)
	{
		 Select st = new Select(ele);
		 st.selectByVisibleText(s);
	}
	
	
	
	

	
	
}
