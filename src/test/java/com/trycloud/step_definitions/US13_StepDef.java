package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.ContactsPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US13_StepDef extends ContactsPage {

    @Given("User logged with {string} in and at dashboard page")
    public void user_logged_with_in_and_at_dashboard_page(String username) {
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("env3"));
        loginPage.loginTryCloud(username, ConfigurationReader.getProperty("universalPassword"));
    }

    @When("user clicks at ''Contacts'' module.")
    public void user_clicks_at_contacts_module() {
        searchContactsBtn.click();
    }

    @Then("user should see contacts list.")
    public void user_should_see_contacts_list() {
    Assert.assertTrue(contactsMenuPopup.isDisplayed());
    }

}
