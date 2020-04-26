package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_InfoPage extends ProMethods {
	
	public SS_InfoPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement ele_Next;
	
	public SS_Problem clickNext() {
		
		click(ele_Next);
		return new SS_Problem();
	}

	

}
