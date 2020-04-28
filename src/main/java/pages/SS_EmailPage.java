package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_EmailPage extends SS_Base{
	
	public SS_EmailPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Email address')]")
	private WebElement ele_Email;
	
	public void verifyEmail() {
		
		verifyDisplayed(ele_Email);
	}

}
