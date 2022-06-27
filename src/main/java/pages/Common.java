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
	private static WebElement element;
	private static String actual;
	private static String expected;

	public static void openURL(String browser) throws IOException {
		driver = BrowserManager.setProperty(driver, ConfigurationReader.readbrowserName(browser));
		driver.get(ConfigurationReader.readbaseURL());
	}

	public static WebElement searchBox(WebDriver driver) {
		String xPath = "//input[@placeholder='Try Saree, Kurti or Search by Product Code']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}

	public static void searchProduct(String product) {
		Common.searchBox(driver).sendKeys(product + Keys.ENTER);
		Common.searchBox(driver).clear();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

	}

	public static void assertTitle() {
		actual = Common.driver.getTitle();
		expected = "Online Shopping Site for Fashion, Electronics, Home & More | Meesho";
		Assert.assertEquals(actual, expected);
		System.out.println("Driver successfully went to url");

	}

}
