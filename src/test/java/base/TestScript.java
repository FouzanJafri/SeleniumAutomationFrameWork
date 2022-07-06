package base;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import abstracted.Report;
import pages.CreateUser;
import pages.DashBoard;
import pages.Prerequisite;
import pages.Users;
import utils.ExtentReport;

public class TestScript extends Report {
	@Test(priority=0)
	public void prerequisite() throws IOException {
		report = ExtentReport.init();
		logger = report.startTest("ALM User Story 9");

		Prerequisite.enterUsername();
		Prerequisite.enterPassword();
		Prerequisite.login();
	}

	
}
