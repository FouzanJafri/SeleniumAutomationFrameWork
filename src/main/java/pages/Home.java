package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	public static WebElement element;
	public static List<WebElement> elements;

	static Actions action;

	public static WebElement WomenEthnic(WebDriver driver) {
		String xPath = "//span[text()='Women Ethnic']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}

	public static WebElement WomenWestern(WebDriver driver) {
		String xPath = "//span[text()='Women Western']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}

	public static WebElement JandA(WebDriver driver) {
		String xPath = "//span[text()='Jewellery & Accessories']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}

	public static WebElement Men(WebDriver driver) {
		String xPath = "//span[text()='Men']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}

	public static WebElement BeautyAndHealth(WebDriver driver) {
		String xPath = "//span[text()='Beauty & Health']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}

	public static WebElement BagsnFootware(WebDriver driver) {
		String xPath = "//span[text()='Bags & Footwear']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}

	public static WebElement HomenKithcen(WebDriver driver) {
		String xPath = "//span[text()='Home & Kitchen']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}

	public static WebElement kids(WebDriver driver) {
		String xPath = "//span[text()='Kids']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}

	public static WebElement electronics(WebDriver driver) {
		String xPath = "//span[text()='Electronics']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}

	public static List<WebElement> Sarees(WebDriver driver) {
		String xPath = "//span[text()='Sarees']/ancestor::div[@class='sub-list-title']/following-sibling::a";
		elements = driver.findElements(By.xpath(xPath));
		return elements;

	}

	public static void moveToMenus() {
		action = new Actions(Common.driver);
		WebDriverWait wait = new WebDriverWait(Common.driver, 25);
		wait.until(ExpectedConditions.visibilityOf(Home.WomenEthnic(Common.driver)));
		action.moveToElement(Home.WomenEthnic(Common.driver)).perform();
		action.moveToElement(Home.WomenWestern(Common.driver)).perform();
		action.moveToElement(Home.JandA(Common.driver)).perform();
		action.moveToElement(Home.BeautyAndHealth(Common.driver)).perform();
		action.moveToElement(Home.BagsnFootware(Common.driver)).perform();
		action.moveToElement(Home.HomenKithcen(Common.driver)).perform();
		action.moveToElement(Home.kids(Common.driver)).perform();
		action.moveToElement(Home.electronics(Common.driver)).perform();
		Common.driver.close();

	}
	public static void assertSarees() {
		for(WebElement element: Home.Sarees(Common.driver)) {
			String elements =element.getText();
			System.out.println(elements);
		}
	}

}
