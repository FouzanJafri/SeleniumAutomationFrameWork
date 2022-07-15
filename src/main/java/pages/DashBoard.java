package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoard {
	public static WebElement element;
	public static WebDriver driver = Prerequisite.driver;
	public static JavascriptExecutor js = ((JavascriptExecutor)driver);

	public static WebElement userButton(WebDriver driver) {
		String xPath = "//a[@href='/ALM/Users']";
		element = driver.findElement(By.xpath(xPath));
		return element;

	}

	public static WebElement master(WebDriver driver) {
		String xPath = "//span[text()='Master']";
		element = driver.findElement(By.xpath(xPath));
		return element;

	}

	public static void clickOnUser() {
		DashBoard.master(driver).click();
		DashBoard.userButton(driver).click();
	}


}
