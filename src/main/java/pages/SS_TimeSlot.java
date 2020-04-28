package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_TimeSlot extends SS_Base  {
	
	public SS_TimeSlot() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'selectBox')]//child::select")
	private WebElement ele_timeSlot;
	

	
	public void enterTimeSlot(String data) {
		
		selectDropDownUsingText(ele_timeSlot, data);
		
	}
	
	
}
