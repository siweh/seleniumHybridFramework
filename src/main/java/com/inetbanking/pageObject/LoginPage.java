package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

//    @FindBy(name = "emailid")
//    WebElement txtEmail;
    @FindBy(name = "uid")
    WebElement txtUserName;

    @FindBy(name = "password")
    WebElement txtPassword;

    @FindBy(name = "btnLogin")
    WebElement btnLogin;

//    public void enterEmail(String email){
//        txtEmail.sendKeys(email);
//        btnLogin.click();
//    }

    public void enterUsername(String username){
        txtUserName.sendKeys(username);
    }
    public void enterPassword(String password){
        txtPassword.sendKeys(password);
    }

    public void clickLoginBtn(){
        btnLogin.click();
    }

}
