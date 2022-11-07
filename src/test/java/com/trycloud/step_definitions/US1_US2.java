package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_US2 {

    LoginPage loginPage = new LoginPage();



    @Given("user on the tryCloud login page")
    public void user_on_the_try_cloud_login_page() {
        Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=1");
    }

    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String username, String password) {

        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginBtn.click();
    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Trycloud"));

    }

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String invalidUsername, String invalidPassword) {
        loginPage.loginTryCloud(invalidUsername,invalidPassword);

    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String errorMessage) {

        Assert.assertEquals(errorMessage, loginPage.errorMessage.getText());

    }




}
