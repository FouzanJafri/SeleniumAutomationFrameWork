package base;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import abstracted.Report;
import pages.CreateUser;
import pages.DashBoard;
import pages.Prerequisite;
import pages.Users;

public class TestScript2 extends Report {

	@Test(priority = 1)
	public void TC_037() throws IOException {
		DashBoard.clickOnUser();
		Users.clickOnCreateUser();
		CreateUser.BirthDateSend();
		CreateUser.SaveBtn_Click();
		}
	@Test(priority = 2)
	public void TC_038() throws IOException {
		CreateUser.Refresh();
		CreateUser.SaveBtn_Click();
		CreateUser.javascriptScroll(CreateUser.DOBInputFeild());
		Assert.assertEquals(CreateUser.BirthDateErrorValidation(), "This field is required.");
	}
	@Test(priority = 3)
	public void TC_039() {
		CreateUser.FutureDateValidation();
		CreateUser.SaveBtn_Click();
		CreateUser.javascriptScroll(CreateUser.DOBInputFeild());

	}
	
	@Test(priority = 4)
	public void TC_040() {
		CreateUser.javascriptScroll(CreateUser.Status());
		Assert.assertEquals(CreateUser.Status().isDisplayed(), true);
	}
	@Test(priority = 5)
	public void TC_042() {
		CreateUser.Refresh();
		CreateUser.javascriptScroll(CreateUser.Status());
		assertEquals(CreateUser.Status().isEnabled(), true);
	}
	@Test(priority = 6)
	public void TC_043() {
		CreateUser.Refresh();
		CreateUser.javascriptScroll(CreateUser.RoleFeild());
		CreateUser.RoleFeildClick();
		//Prerequisite.WebdriverWait(CreateUser.SearchInputInRoleDrop());
		CreateUser.javascriptScroll(CreateUser.SearchInputInRoleDrop());
		Assert.assertEquals(CreateUser.SearchInputInRoleDrop().isEnabled(), true);
	}
	
	@Test(priority = 7)
	public void TC_044() {
		System.out.println(CreateUser.RoleFeildList().toString());
//		Assert.assertEquals(CreateUser.SearchInputInRoleDrop().isEnabled(), true);
	}
		
	
}
