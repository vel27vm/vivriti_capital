package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SS_AdditionalInfo;
import pages.SS_Base;
import pages.SS_EmailPage;
import pages.SS_HomePage;
import pages.SS_PblmDescription;
import pages.SS_Problem;
import pages.SS_TimePeriod;
import pages.SS_TimeSlot;
import pages.SS_action;
import pages.SS_date;

public class TC001_StartOfService extends SS_Base {

	@BeforeTest
	public void setData() {

		browserName = "chrome";
		Url = "https://www.starofservice.in/dir/telangana/hyderabad/hyderabad/plumbing#/";

	}

	@Test
	public void starOfService() {

		SS_Base base = new SS_Base();
		// based on given questions,get known count
		int knownQues_Count = 8;

		SS_HomePage home = new SS_HomePage();
		home.enterCity("Chennai");
		// home.clickGo();
		home.click_Next();

		// Handle unorder page questions , new added page and verify Email'

		for (int i = 0; i < knownQues_Count; i++) {

			if (base.get_title().contains("The problems are to do with which of the following things")) {

				SS_Problem prob = new SS_Problem();
				prob.selectTap();
				prob.click_Next();

			} else if (base.get_title().contains("What do you need done")) {

				SS_action action = new SS_action();
				action.selectReplace();
				action.click_Next();

			} else if (base.get_title().contains("What problem(s) do you have")) {

				SS_PblmDescription pblmdes = new SS_PblmDescription();
				pblmdes.selectLeak();
				pblmdes.click_Next();

			} else if (base.get_title().contains("Is there anything else that the Plumber needs to know")) {

				SS_AdditionalInfo info = new SS_AdditionalInfo();
				info.enterInfo("Anything else the Plumber should know?");
				info.click_Next();

			} else if (base.get_title().contains("When do you require plumbing")) {

				SS_TimePeriod time = new SS_TimePeriod();
				time.selectTimePeriod();
				time.click_Next();

			} else if (base.get_title().contains("On what date")) {

				SS_date date = new SS_date();
				date.selectdate();
				date.click_Next();

			} else if (base.get_title().contains("What time do you need the Plumber")) {

				SS_TimeSlot timeslot = new SS_TimeSlot();
				timeslot.enterTimeSlot("02:00");
				timeslot.click_Next();

			} else if (base.get_title().contains("Matching you with the best Professionals") || base.get_title().contains("Where would you like us to notify you") ){
				
				// Verify Email
				SS_EmailPage email = new SS_EmailPage();
				email.verifyEmail();
				
			} else {
				// Assume new question added

				base.select_CheckBoxOnNewPage();
				base.click_Next();
				knownQues_Count++;

			}

		}

		
	}

	/*
	 * new SS_HomePage() .enterCity("Chennai") .clickGo() .clickNext() .selectTap()
	 * .clickNext() .selectReplace() .clickNext() .selectLeak() .clickNext()
	 * .enterInfo("Anything else the Plumber should know?") .clickNext()
	 * .selectTimePeriod() .clickNext() .selectdate() .clickNext()
	 * .enterTimeSlot("02:00") .clickNext() .verifyEmail();
	 */
}
