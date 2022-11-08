package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US3_StepDef {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    @Given("User successfully login to the app")
    public void user_successfully_login_to_the_app() {
       String url = ConfigurationReader.getProperty("env3");
       String username = ConfigurationReader.getProperty("user7");
       String password = ConfigurationReader.getProperty("universalPassword");
       Driver.getDriver().get(url);
       loginPage.loginTryCloud(username,password);
    }
    @When("User sees {string}  is in the title")
    public void user_sees_is_in_the_title(String titleContains) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(titleContains));

    }
    @Then("Verify the user see and access the following modules")
    public void verify_the_user_see_and_access_the_following_modules(List<String> mainModulesName)  {

        // created utility method in Dashboard page for verify names
        dashboardPage.verifyMainModulesName(mainModulesName);

        //
      //  dashboardPage.verifyAccessibilityOfMainModules(mainModulesName);

        dashboardPage.verifyAccessibilityOfMainModulesWithMap(mainModulesName);




    }

}
