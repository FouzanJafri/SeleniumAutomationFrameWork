package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.BrowserManager;
import utils.ConfigurationReader;

public class Common {
	public static WebDriver driver;

	public static void openURL(String browser) throws IOException {
		driver = BrowserManager.setProperty(driver, ConfigurationReader.readbrowserName(browser));
		driver.get(ConfigurationReader.readbaseURL());
	}

	
}
