package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.BrowserManager;
import utils.ConfigurationReader;

public class Prerequisite {
	public static WebDriver driver;
	public static WebElement element;

	public static void openURL(String browser) throws IOException {
		driver = BrowserManager.setProperty(driver, ConfigurationReader.readbrowserName(browser));
		driver.get(ConfigurationReader.readbaseURL());
	}

	public static WebElement usernameField(WebDriver driver) {
		String id = "Input_emailVal";
		element = driver.findElement(By.id(id));
		return element;
	}

	public static WebElement passwordField(WebDriver driver) {
		String id = "input_password";
		element = driver.findElement(By.id(id));
		return element;
	}

	public static WebElement loginbtn(WebDriver driver) {
		String xPath = "//button[@type='submit']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}

	public static void enterUsername() throws IOException {
		Actions actn = new Actions(driver);
		actn.moveToElement(Prerequisite.usernameField(driver)).click().perform();
		Prerequisite.usernameField(driver).clear();
		Prerequisite.usernameField(driver).sendKeys(ConfigurationReader.username());
	}

	public static void enterPassword() throws IOException {
		Actions actn = new Actions(driver);
		actn.moveToElement(Prerequisite.passwordField(driver)).click().perform();
		Prerequisite.passwordField(driver).clear();
		Prerequisite.passwordField(driver).sendKeys(ConfigurationReader.password());
	}

	public static void login() {
		//Prerequisite.ClickAbleWebdriverWait(Prerequisite.loginbtn(driver));
		Actions actn = new Actions(driver);
		actn.moveToElement(Prerequisite.loginbtn(driver));
		Prerequisite.loginbtn(driver).click();
		//actn.click(Prerequisite.loginbtn(driver)).perform();
	}
	
	public static void LOGINGOO() throws IOException, InterruptedException {
	
		String expected = "Dashboard";
	       String actual = driver.getTitle();
	 
   //    while(!expected.equals(actual)) {
//	           driver.findElement(By.xpath("//input[@type=\"email\"]")).clear();
//	           driver.findElement(By.xpath("//input[@type=\"password\"]")).clear();
//	           driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("praghuwanshi@netlink.com");
//	           driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456");
//	           element = driver.findElement(By.xpath("//button[@type=\"submit\"]")); 
//	              Actions act = new Actions(driver);
//	              act.moveToElement(element).click().perform();

//    	   Prerequisite.usernameField(driver).clear();
//    	   Prerequisite.passwordField(driver).clear();
    	   		Prerequisite.enterUsername();
	    	   Prerequisite.enterPassword();
//	    	   Prerequisite.login();
	           element = driver.findElement(By.xpath("//button[@type=\"submit\"]")); 
	           Thread.sleep(2000);
	              Actions act = new Actions(driver);
	              act.moveToElement(element).click().perform();

	//       }
	}
	
	public static void WebdriverWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void ClickAbleWebdriverWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public static void CloseDriver() {
		driver.close();
		
	}

}
