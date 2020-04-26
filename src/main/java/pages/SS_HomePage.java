package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.How;

import wdMethods.ProMethods;

public class SS_HomePage extends ProMethods {

	public SS_HomePage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "postal_code_input")
	private WebElement ele_Where;
	
	@FindBy(how = How.XPATH, using = "//div[@data-val='Chennai']")
	private WebElement ele_slctChennai;
	

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Go')]")
	private WebElement ele_Go;

	public SS_HomePage enterCity(String data) {

		type(ele_Where, data);
		click(ele_slctChennai);
		return this;

	}

	public SS_InfoPage clickGo() {

		click(ele_Go);
		return new SS_InfoPage();

	}

}