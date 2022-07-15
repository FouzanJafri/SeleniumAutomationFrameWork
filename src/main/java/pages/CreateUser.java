package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigurationReader;

public class CreateUser {
	public static WebDriver driver = Users.driver;
	public static WebElement element;
	public static WebDriverWait wait =  new WebDriverWait(driver, 7);
	public static JavascriptExecutor js =  ((JavascriptExecutor) driver);


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

	public static WebElement DOBInputFeild() {
		return driver.findElement(By.xpath("//input[@id='Input_BirthDate']"));
	}
	public static void BirthDateSend() throws IOException {
		CreateUser.DOBInputFeild().sendKeys(ConfigurationReader.readDOBDate("dob"));
	}

	
	public static String BirthDateErrorValidation() {
		return driver.findElement(By.xpath("//input[@id='Input_BirthDate']/following-sibling::span")).getText();
	}
	public static void JoinDateSend() {
		CreateUser.verifyJoiningDateFieldPresence(driver).sendKeys("07022022");
	}

	
	public static String JoinDateErrorValidation() {
		return driver.findElement(By.xpath("//input[@id='Input_JoiningDatel']/following-sibling::span")).getText();
	}
	public static WebElement SaveBTN() {
		return driver.findElement(By.xpath("//button[text()='Save']"));
	}
	public static void SaveBtn_Click() {
		js.executeScript("arguments[0].scrollIntoView();", CreateUser.SaveBTN());
		CreateUser.SaveBTN().click();
	}
	
	public static void javascriptScroll(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public static void FutureDateValidation() {
		try {
			CreateUser.DOBInputFeild().sendKeys(ConfigurationReader.readDOBDate("Futuredob"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void Refresh() {
		driver.navigate().refresh();
	}

	public static WebElement Status() {
		return driver.findElement(By.xpath("//input[@id='Status_switch']"));
	}
	
	public static WebElement RoleFeild() {
		return driver.findElement(By.xpath("//div[@id='b6-DropdownTags']/div"));
	}
	public static void RoleFeildClick() {
		Actions acc = new Actions(driver);
		acc.click(CreateUser.RoleFeild()).perform();
	}
	public static List<WebElement> RoleFeildList() {
		return driver.findElements(By.xpath("//div[text() ='Select Roles']"));
	}
	public static WebElement SearchInputInRoleDrop() {
		return driver.findElement(By.xpath("//input[@class='vscomp-search-input']"));
	}
	
	
	}
