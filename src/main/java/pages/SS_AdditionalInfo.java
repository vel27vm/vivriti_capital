package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_AdditionalInfo extends ProMethods {
	
	public SS_AdditionalInfo() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//textarea[contains(@class,'textArea')]")
	private WebElement ele_textArea;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement ele_Next;

	
	public SS_AdditionalInfo enterInfo(String data) {
		
		type(ele_textArea, data);
		return this;
	}
	
	public SS_TimePeriod clickNext() {


		click(ele_Next);
		return new SS_TimePeriod();
	}
}
