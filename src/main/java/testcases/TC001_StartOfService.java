package testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SS_HomePage;
import wdMethods.ProMethods;

public class TC001_StartOfService extends ProMethods {

	@BeforeTest
	public void setData() {

		browserName = "chrome";
		Url = "https://www.starofservice.in/dir/telangana/hyderabad/hyderabad/plumbing#/";
		

	}

	@Test
	public void starOfService() {

		new SS_HomePage()
		.enterCity("Chennai")
		.clickGo()
		.clickNext()
		.selectTap()
		.clickNext()
		.selectReplace()
		.clickNext()
		.selectLeak()
		.clickNext()
		.enterInfo("Anything else the Plumber should know?")
		.clickNext()
		.selectTimePeriod()
		.clickNext()
		.selectdate()
		.clickNext()
		.enterTimeSlot("02:00")
		.clickNext()
		.verifyEmail();
	}

}