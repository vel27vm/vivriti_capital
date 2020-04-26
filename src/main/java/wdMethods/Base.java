package wdMethods;

import org.openqa.selenium.WebElement;

public interface Base {

	public void startApp(String browser, String url);

	public WebElement locateElement(String locator, String locValue);

	public void click(WebElement ele);

	public void selectDropDownUsingText(WebElement ele, String value);

	public void selectDropDownUsingIndex(WebElement ele, int index);

	public void verifyDisplayed(WebElement ele);

	public void closeAllBrowsers();

	public void type(WebElement ele, String data);

}