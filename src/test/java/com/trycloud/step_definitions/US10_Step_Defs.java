package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class US10_Step_Defs {

    FilesPage filesPage = new FilesPage();
    String amountOfMemoryUsedBeforeUploading;
    String amountOfMemoryUsedAfterUploading;
    int newValue;
    int oldValue;

    @And("user clicks Settings on the left bottom corner")
    public void userClicksSettingsOnTheLeftBottomCorner() {
        filesPage.settingsBtn.click();
    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {
        if (!filesPage.showRichWorkspasesCheckboxFA.isSelected()) {
            BrowserUtils.sleep(3);
            filesPage.showRichWorkspasesCheckbox.click();
            Assert.assertTrue(filesPage.showRichWorkspasesCheckboxFA.isSelected());
        }

        if (!filesPage.showRecommendationsCheckboxFA.isSelected()) {
            BrowserUtils.sleep(3);
            filesPage.showRecommendationsCheckbox.click();
            Assert.assertTrue(filesPage.showRecommendationsCheckboxFA.isSelected());
        }

        if (!filesPage.showHiddenFilesFA.isSelected()) {
            BrowserUtils.sleep(3);
            filesPage.showHiddenFiles.click();

            Assert.assertTrue(filesPage.showHiddenFilesFA.isSelected());
        }

    }

    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {
        for (WebElement each : filesPage.leftSideMenuOptions) {
            if (each.getText().contains("B used")) {
              amountOfMemoryUsedBeforeUploading = each.getText();
                System.out.println(amountOfMemoryUsedBeforeUploading);
                if(amountOfMemoryUsedBeforeUploading.contains(" KB ")){
                    oldValue = (int)Double.parseDouble(amountOfMemoryUsedBeforeUploading.substring(0, amountOfMemoryUsedBeforeUploading.indexOf(" "))) * 1000;
                }else if(amountOfMemoryUsedBeforeUploading.contains(" MB ")){
                    oldValue = (int)Double.parseDouble(amountOfMemoryUsedBeforeUploading.substring(0, amountOfMemoryUsedBeforeUploading.indexOf(" "))) * 1_000_000;
                }else if (amountOfMemoryUsedBeforeUploading.contains(" GB ")){
                    oldValue = (int)Double.parseDouble(amountOfMemoryUsedBeforeUploading.substring(0, amountOfMemoryUsedBeforeUploading.indexOf(" "))) * 1_000_000_000;
                }
            }
        }
        System.out.println("oldValue = " + oldValue);
    }

    @And("user  uploads file with the Upload file option")
    public void userUploadsFileWithTheUploadFileOption() {
        BrowserUtils.sleep(5);
        filesPage.uploadFileElement.sendKeys("C:\\Users\\Sviatlana\\Downloads\\CRM_project (1).pdf");
        BrowserUtils.sleep(5);
    }

    @When("user refresh the page")
    public void user_refresh_the_page() {
       Driver.getDriver().navigate().refresh();
    }
    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {

        for (WebElement each : filesPage.leftSideMenuOptions) {
            if (each.getText().contains("B used")) {
                amountOfMemoryUsedAfterUploading = each.getText();
                System.out.println(amountOfMemoryUsedAfterUploading);
                if(amountOfMemoryUsedAfterUploading.contains(" KB ")){
                    newValue = (int)Double.parseDouble(amountOfMemoryUsedAfterUploading.substring(0, amountOfMemoryUsedAfterUploading.indexOf(" "))) * 1000;
                }else if(amountOfMemoryUsedAfterUploading.contains(" MB ")){
                    newValue = (int)Double.parseDouble(amountOfMemoryUsedAfterUploading.substring(0, amountOfMemoryUsedAfterUploading.indexOf(" "))) * 1_000_000;
                }else if (amountOfMemoryUsedAfterUploading.contains(" GB ")){
                    newValue = (int)Double.parseDouble(amountOfMemoryUsedAfterUploading.substring(0, amountOfMemoryUsedAfterUploading.indexOf(" "))) * 1_000_000_000;
                }
            }
        }
        System.out.println("newValue = " + newValue);
        Assert.assertTrue(oldValue < newValue);
    }

}
