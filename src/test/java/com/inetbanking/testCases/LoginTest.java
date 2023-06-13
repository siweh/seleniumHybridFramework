package com.inetbanking.testCases;

import com.inetbanking.pageObject.LoginPage;
import com.inetbanking.utilities.WebDriverUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends  WebDriverUtil{

    @Test
    private void LoginTest(){
        driver.get(baseUrl);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginBtn();

        if (driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
        }else {
            Assert.assertFalse(false);
        }
    }
}
