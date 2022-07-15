package abstracted;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.DashBoard;
import pages.Prerequisite;
import pages.Users;
import utils.ExtentReport;
import utils.Screenshot;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.Driver;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class Report {
	public ExtentReports report;
	public ExtentTest logger;

	@AfterMethod
	public void afterMethod(ITestResult res) throws IOException {
//		if (Prerequisite.driver.getTitle().equals("InvalidPermissions")) {
//			Prerequisite.driver.navigate().back();
//			report = ExtentReport.init();
//			logger = report.startTest("ALM automation");
//			Prerequisite.enterUsername();
//			Prerequisite.enterPassword();
//			Prerequisite.login();
//		}else if (Prerequisite.driver.getTitle().equals("Login")) {
//			report = ExtentReport.init();
//			logger = report.startTest("ALM automation");
//			Prerequisite.enterUsername();
//			Prerequisite.enterPassword();
//			Prerequisite.login();
//		}
		if (res.getStatus() == ITestResult.FAILURE) {
			String path = Screenshot.takeScreenshotAs(Prerequisite.driver, res.getMethod().getMethodName());
			String imagePath = logger.addScreenCapture(path);
			logger.log(LogStatus.FAIL, res.getMethod().getMethodName(), imagePath);

		} else if (res.getStatus() == ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, res.getMethod().getMethodName());
		} else {
			logger.log(LogStatus.PASS, res.getMethod().getMethodName());
		}

	}

//	@Parameters({ "browser" })
	@BeforeTest
	public void beforeClass() throws IOException {
		Prerequisite.openURL("browserName1");
		report = ExtentReport.init();
		logger = report.startTest("ALM automation");
		Prerequisite.LOGINGOO();
	}

	@AfterClass
	public void afterClass() {
		report.endTest(logger);
		report.flush();
	}
	@AfterTest
	public void afterTest() {
		Prerequisite.CloseDriver();
	}

}
