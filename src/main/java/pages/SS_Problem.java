package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_Problem extends ProMethods {

	public SS_Problem() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Tap')]//preceding-sibling::div//child::div[contains(@class,'checkbox')]")
	private WebElement ele_Tap;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement ele_Next;

	public SS_Problem selectTap() {

		click(ele_Tap);
		return this;

	}

	public SS_action clickNext() {

		click(ele_Next);
		return new SS_action();
	}

}
