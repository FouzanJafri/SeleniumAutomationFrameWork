package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateUser {
	public static WebDriver driver = Users.driver;
	public static WebElement element;
	WebDriverWait wait =  new WebDriverWait(driver, 7);


	public static WebElement pageTitleSpan(WebDriver driver) {
		String xPath = "//div[@id='b1-Title']/h1/span";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}

	public static WebElement userDetailsHeading(WebDriver driver) {
		String xPath = "//div[@class='padding-left-m font-semi-bold font-size-h6 text-secondary' and text()='User Details']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}

	public static WebElement verifyFullNameFieldPresence(WebDriver driver) {
		String xPath = "//div[@id='b3-Content']/div[1]/div/label[text()='Full Name']";
		element = driver.findElement(By.xpath(xPath));
		return element;

	}

	public static WebElement verifyContactFieldPresence(WebDriver driver) {
		String xPath = "//div[@id='b3-Content']/div[2]/div/label[text()='Contact']";
		element = driver.findElement(By.xpath(xPath));
		return element;

	}

	public static WebElement verifyEmailFieldPresence(WebDriver driver) {
		String xPath = "//div[@id='b3-Content']/div[3]/div/label[text()='Email']";
		element = driver.findElement(By.xpath(xPath));
		return element;

	}

	public static WebElement verifyPasswordFieldPresence(WebDriver driver) {
		String xPath = "//div[@id='b3-Content']/div[4]/div/label[text()='Password ']";
		element = driver.findElement(By.xpath(xPath));
		return element;

	}

	public static WebElement verifyNSIDFieldPresence(WebDriver driver) {
		String xPath = "//div[@id='b3-Content']/div[5]/div/label[text()='NSID']";
		element = driver.findElement(By.xpath(xPath));
		return element;

	}

	public static WebElement verifyGenderFieldPresence(WebDriver driver) {
		String xPath = "//div[@id='b3-Content']/div[6]/div/label[text()='Gender']";
		element = driver.findElement(By.xpath(xPath));
		return element;

	}

	public static WebElement verifyBirthDateFieldPresence(WebDriver driver) {
		String xPath = "//div[@id='b3-Content']/div[7]/div/label[text()='Birth Date']";
		element = driver.findElement(By.xpath(xPath));
		return element;

	}

	public static WebElement verifyJoiningDateFieldPresence(WebDriver driver) {
		String xPath = "//div[@id='b3-Content']/div[8]/div/label[text()='Joining Date']";
		element = driver.findElement(By.xpath(xPath));
		return element;

	}

	public static WebElement verifyStatusFieldPresence(WebDriver driver) {
		String xPath = "//div[@id='b3-Content']/div[9]/div/label[text()='Status']";
		element = driver.findElement(By.xpath(xPath));
		return element;

	}

	public static String pageTitle() {
		String title = CreateUser.pageTitleSpan(driver).getText();
		return title;
	}

	public static String parentContainerTitle() {
		String title = CreateUser.userDetailsHeading(driver).getText();
		return title;
	}

	public static String getFullName() {
		String title = CreateUser.verifyFullNameFieldPresence(driver).getText();
		return title;
	}

	public static String getContact() {
		String title = CreateUser.verifyContactFieldPresence(driver).getText();
		return title;
	}

	public static String getEmail() {
		String title = CreateUser.verifyEmailFieldPresence(driver).getText();
		return title;
	}

	public static String getPassword() {
		String title = CreateUser.verifyPasswordFieldPresence(driver).getText();
		return title;
	}

	public static String getNSID() {
		String title = CreateUser.verifyNSIDFieldPresence(driver).getText();
		return title;
	}

	public static String getGender() {
		String title = CreateUser.verifyGenderFieldPresence(driver).getText();
		return title;
	}

	public static String getBirthDate() {
		String title = CreateUser.verifyBirthDateFieldPresence(driver).getText();
		return title;
	}

	public static String getJoiningDate() {
		String title = CreateUser.verifyJoiningDateFieldPresence(driver).getText();
		return title;
	}

	public static String getStatus() {
		String title = CreateUser.verifyStatusFieldPresence(driver).getText();
		return title;
	}

}