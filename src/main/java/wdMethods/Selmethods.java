package wdMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Selmethods implements Base {

	public static RemoteWebDriver driver;

	@Override
	public void startApp(String browser, String sUrl) {

		try {

			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				System.setProperty("webdriver.chrome.silentOutput", "true");
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else {

				System.out.println("Invalid browser name. Please check browsername ");
				throw new Exception("Invalid Browser name");

			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get(sUrl);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {

			case ("id"):
				return driver.findElementById(locValue);
			case ("link"):
				return driver.findElementByLinkText(locValue);
			case ("partiallink"):
				return driver.findElementByPartialLinkText(locValue);
			case ("xpath"):
				return driver.findElementByXPath(locValue);
			case ("name"):
				return driver.findElementByName(locValue);
			case ("class"):
				return driver.findElementByClassName(locValue);
			case ("css"):
				return driver.findElementByCssSelector(locValue);
			}
		} catch (NoSuchElementException e) {
			System.out.println("The element with locator " + locator + " not found.");
			System.out.println(e.getMessage());
		} catch (WebDriverException e) {
			System.out.println("Unknown exception occured while finding " + locator + " with the value " + locValue);
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);

			System.out.println("The data: " + data + " entered successfully in the field :" + ele);
		} catch (InvalidElementStateException e) {
			System.out.println("The data: " + data + " could not be entered in the field :" + ele);
		} catch (WebDriverException e) {
			System.out.println("Unknown exception occured while entering " + data + " in the field :" + ele);
		}
	}

	@Override
	public void click(WebElement ele) {

		String text = "";
		try {

			text = ele.getText();
			ele.click();
			System.out.println("The element " + text + " is clicked");
		} catch (InvalidElementStateException e) {
			System.out.println("The element: " + text + " could not be clicked");
		} catch (WebDriverException e) {
			System.out.println("Unknown exception occured while clicking in the field :");
		}

	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {

		try {
			new Select(ele).selectByVisibleText(value);
			System.out.println("The dropdown is selected with text " + value);
		} catch (WebDriverException e) {
			System.out.println("The element: " + ele + " could not be found.");
		}

	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			new Select(ele).selectByIndex(index);
			System.out.println("The dropdown is selected with index " + index);
		} catch (WebDriverException e) {
			System.out.println("The element: " + ele + " could not be found.");
		}

	}

	@Override
	public void verifyDisplayed(WebElement ele) {

		try {
			if (ele.isDisplayed()) {
				System.out.println("The element " + ele + " is displayed");
			} else {
				System.out.println("The element " + ele + " is not displayed");
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : " + e.getMessage());
		}

	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("The opened browsers are closed");
		} catch (Exception e) {
			System.out.println("Unexpected error occured in Browser");
		}
	}

}