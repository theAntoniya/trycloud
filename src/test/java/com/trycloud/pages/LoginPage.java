package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.joda.time.field.DividedDateTimeField;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//input[@id='user']")
    public WebElement usernameInput;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;

    //Login Method
    public void loginTryCloud(String username,String password){

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
}
