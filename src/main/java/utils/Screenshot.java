package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static String takeScreenshotAs(WebDriver driver, String fileName) throws IOException {
		String logfileName = new SimpleDateFormat("yyyyMMddHHmm'.png'").format(new Date());
		fileName = fileName + "_" + logfileName;
		String directory = System.getProperty("user.dir") + "\\outputs\\screenshot\\";
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		String destination = directory + fileName;
		return destination;

	}

}
