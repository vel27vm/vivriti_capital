package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_date extends ProMethods {
	
	public SS_date() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//td[contains(@class,'today')]//following::td[2]")
	private WebElement ele_date;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement ele_Next;
	
	
	public SS_date selectdate() {

		click(ele_date);
		return this;

	}
	public SS_TimeSlot clickNext() {


		click(ele_Next);
		return new SS_TimeSlot();
	}

}
