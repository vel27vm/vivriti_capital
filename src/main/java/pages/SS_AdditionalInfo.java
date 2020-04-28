package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_AdditionalInfo extends SS_Base {
	
	public SS_AdditionalInfo() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//textarea[contains(@class,'textArea')]")
	private WebElement ele_textArea;
	

	public void enterInfo(String data) {
		
		type(ele_textArea, data);
		
	}
	
	
}
