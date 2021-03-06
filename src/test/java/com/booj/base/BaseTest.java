package com.booj.base;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.booj.PageObject.AccountLoginTest;

public class BaseTest extends BaseTestSuper {
	/* WebDriver driver; */
	/* AccountLoginTest objLogin; */
	/* BaseTestSub objSetup; */
	/*test*/

	@Test
	public void test_Account_Login_Page_Appear_Correct() throws Exception {
		// Create login page object
		objLogin = new AccountLoginTest(driver);

		objLogin.loginToBairdAccount("brenden@activewebsite.com", "active");
		
		//Returns welcome title and asserts true
		String loginWelcomeTitle = objLogin.getLoginWelcome();
		System.out.println(loginWelcomeTitle);
		try{
		Assert.assertTrue(loginWelcomeTitle.equals("Welcome, brenden thornsberry"));
		}catch(Throwable e){
			System.out.println("Welcome Text not Present/Does not Match" + e);
		}
	}

}
