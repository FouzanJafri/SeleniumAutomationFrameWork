package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Users {
	public static WebDriver driver = DashBoard.driver;
	public static WebElement element;

	public static WebElement createUser(WebDriver driver) {
		String xPath = "//div[@id='b10-Content']/i";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}
	public static void clickOnCreateUser() {
		Users.createUser(driver).click();
	}

}
