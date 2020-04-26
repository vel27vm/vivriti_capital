package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_TimeSlot extends ProMethods  {
	
	public SS_TimeSlot() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'selectBox')]//child::select")
	private WebElement ele_timeSlot;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement ele_Next;

	
	public SS_TimeSlot enterTimeSlot(String data) {
		
		selectDropDownUsingText(ele_timeSlot, data);
		return this;
	}
	
	public SS_EmailPage clickNext() {


		click(ele_Next);
		return new SS_EmailPage();
	}

}
