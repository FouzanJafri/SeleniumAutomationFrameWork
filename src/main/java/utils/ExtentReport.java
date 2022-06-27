package utils;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport {
	public static ExtentReports init() {

		return new ExtentReports("outputs/Reports/Extent.html", false);
	}

}
