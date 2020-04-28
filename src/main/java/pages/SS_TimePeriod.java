package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_TimePeriod extends SS_Base{
	
	public SS_TimePeriod() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'On a specific date')]//preceding-sibling::div//child::div")
	private WebElement ele_TimePeriod;
	
	
	
	public void selectTimePeriod() {

		click(ele_TimePeriod);
		

	}
	

}
