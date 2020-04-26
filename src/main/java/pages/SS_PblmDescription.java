package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_PblmDescription extends ProMethods {
	
	public SS_PblmDescription() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Leak in a pipe')]//preceding-sibling::div//child::div[contains(@class,'checkbox')]")
	private WebElement ele_Leak;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement ele_Next;
	
	
	public SS_PblmDescription selectLeak() {

		click(ele_Leak);
		return this;

	}
	public SS_AdditionalInfo clickNext() {


		click(ele_Next);
		return new SS_AdditionalInfo();
	}

}
