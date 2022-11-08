package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_StepDef extends BasePage {
    @Given("User logged with {string} in and at dashboard page.")
    public void user_logged_with_in_and_at_dashboard_page(String username) {
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("env3"));
        loginPage.loginTryCloud(username,ConfigurationReader.getProperty("universalPassword"));
    }
    @When("user clicks at ''Contacts'' module")
    public void user_clicks_at_contacts_module() {
        contactsLink.click();
    }
    @Then("user should see ''Contacts - Trycloud QA'' as title")
    public void user_should_see_contacts_trycloud_qa_as_title() {
        Assert.assertEquals("Contacts - Trycloud QA",Driver.getDriver().getTitle());
    }

}
