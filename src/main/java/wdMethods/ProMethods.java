package wdMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProMethods extends Selmethods {

	public String browserName;
	public String Url;

	@BeforeMethod
	public void beforeMethod() {

		startApp(browserName, Url);
	}

	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();

	}

}