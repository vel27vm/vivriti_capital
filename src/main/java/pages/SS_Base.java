package pages;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProMethods;

public class SS_Base extends ProMethods {
	
	public SS_Base() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement ele_Next;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'checkbox')]")
	private WebElement ele_checkBox;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'title')])[1]")
	private WebElement ele_tittle;
	
	
	public void click_Next() {

		click(ele_Next);
		
	}
	
	public void select_CheckBoxOnNewPage() {
		
		click(ele_checkBox);
		
	}
	
	public String get_title() {
		
		 String title = ele_tittle.getText();
		System.out.println(title);
		 return title;
	}
	

}
