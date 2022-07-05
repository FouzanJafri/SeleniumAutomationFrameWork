package base;

import java.io.IOException;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

import abstracted.Report;
import dataProvider.Data;
import utils.ExtentReport;

public class TestSctript extends Report {

	@Test(dataProvider = "data", dataProviderClass = Data.class, groups = "regression", priority = 1)
	public void searching_products(String data) throws IOException, StaleElementReferenceException {
		report = ExtentReport.init();
		logger = report.startTest("Framework assesment");

	}

}
