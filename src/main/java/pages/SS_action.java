package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_action extends ProMethods {
	
	public SS_action() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Replace')]//preceding-sibling::div//child::div[contains(@class,'checkbox')]")
	private WebElement ele_Replace;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement ele_Next;
	
	
	public SS_action selectReplace() {

		click(ele_Replace);
		return this;

	}
	public SS_PblmDescription clickNext() {


		click(ele_Next);
		return new SS_PblmDescription();
	}


}
