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
	@Test(priority = 0)
	public void prerequisite() throws IOException {
		report = ExtentReport.init();
		logger = report.startTest("ALM automation");

		Prerequisite.enterUsername();
		Prerequisite.enterPassword();
		Prerequisite.login();
	}

	@Test(dependsOnMethods = { "prerequisite" }, priority = 1)
	public void TC_001() throws IOException {
		DashBoard.clickOnUser();
		Users.clickOnCreateUser();
		Assert.assertEquals(CreateUser.pageTitle(), "Create User");

	}

	@Test(priority = 2)
	public void TC_002() {
		Assert.assertEquals(CreateUser.parentContainerTitle(), "User Details");
		Assert.assertEquals(CreateUser.getFullName(), "Full Name");
		Assert.assertEquals(CreateUser.getContact(), "Contact");
		Assert.assertEquals(CreateUser.getEmail(), "Email");
		Assert.assertEquals(CreateUser.getGender(), "Gender");
		Assert.assertEquals(CreateUser.getJoiningDate(), "Joining Date");
		Assert.assertEquals(CreateUser.getBirthDate(), "Birth Date");
		Assert.assertEquals(CreateUser.getStatus(), "Status");

	}

	public void TC_003() {

	}

}
