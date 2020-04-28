package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_PblmDescription extends SS_Base {
	
	public SS_PblmDescription() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Leak in a pipe')]//preceding-sibling::div//child::div[contains(@class,'checkbox')]")
	private WebElement ele_Leak;
	
	
	public void selectLeak() {

		click(ele_Leak);
		

	}
	

}
