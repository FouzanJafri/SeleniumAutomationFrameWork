package utils;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport {
	public static ExtentReports init() {

		return new ExtentReports(System.getProperty("user.dir")+"/outputs/Reports/Extent.html", false);
	}

}
