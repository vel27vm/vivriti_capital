package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import wdMethods.ProMethods;

public class SS_date extends SS_Base {
	
	public SS_date() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//td[contains(@class,'today')]//following::td[2]")
	private WebElement ele_date;
	
	
	
	public void selectdate() {

		click(ele_date);
		

	}
	

}
