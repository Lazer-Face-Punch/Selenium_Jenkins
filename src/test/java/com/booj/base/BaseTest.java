package com.booj.base;

import org.testng.annotations.Test;

import com.booj.PageObject.AccountLoginTest;

public class BaseTest extends BaseTestSuper {
	/* WebDriver driver; */
	/* AccountLoginTest objLogin; */
	/* BaseTestSub objSetup; */

	@Test
	public void test_Account_Login_Page_Appear_Correct() throws Exception {
		// Create login page object
		objLogin = new AccountLoginTest(driver);

		objLogin.loginToBairdAccount("brenden@activewebsite.com", "active");

	}

}
