package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_action extends SS_Base {
	
	public SS_action() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Replace')]//preceding-sibling::div//child::div[contains(@class,'checkbox')]")
	private WebElement ele_Replace;
	
	public void selectReplace() {

		click(ele_Replace);
		

	}
	


}
