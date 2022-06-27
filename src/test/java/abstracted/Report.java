package abstracted;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.Common;
import utils.Screenshot;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class Report {
	public ExtentReports report;
	public ExtentTest logger;

	@AfterMethod
	public void afterMethod(ITestResult res) throws IOException {
		if (res.getStatus() == ITestResult.FAILURE) {
			String path = Screenshot.takeScreenshotAs(Common.driver, res.getTestName());
			String imagePath = logger.addScreenCapture(path);
			logger.log(LogStatus.FAIL, res.getMethod().getMethodName(), imagePath);

		} else if (res.getStatus() == ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, res.getMethod().getMethodName());
		} else {
			logger.log(LogStatus.PASS, res.getMethod().getMethodName());
		}

	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
		report.endTest(logger);
		report.flush();
	}
	@Parameters({"browser"})
	@BeforeTest
	public void setUp(String browser) throws IOException {
		Common.openURL(browser);

	}


}
