package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage extends BasePage {

    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//span[@class='icon icon-more'])")
    public WebElement actionsBtnsNOTUNIQUE;

    @FindBy (xpath = "//tr[@data-type]")
    public List<WebElement> allFolderAndFiles;

    @FindBy (xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//li")
    public List<WebElement> fileActionsMenuElements;


    @FindBy (xpath = "//div[@id='app-navigation']//li//a")
    public List<WebElement> leftSideMenuOptions;

    @FindBy (xpath = "(//table[@id='filestable']//tbody[@id='fileList'])[12]//tr")
    public List<WebElement> allDeletedFiles;

    @FindBy ( xpath = "//button[@class='settings-button']")
    public WebElement settingsBtn;

    @FindBy ( xpath = "(//input[@class='checkbox'])[1]")
    public WebElement showRichWorkspasesCheckboxFA;

    @FindBy ( xpath = "//input[@id='showRichWorkspacesToggle']/following-sibling::label[@for='showRichWorkspacesToggle']")
    public WebElement showRichWorkspasesCheckbox;

    @FindBy ( xpath = "(//input[@class='checkbox'])[2]")
    public WebElement showRecommendationsCheckboxFA;

    @FindBy ( xpath = "//input[@id='recommendationsEnabledToggle']/following-sibling::label[@for='recommendationsEnabledToggle']")
    public WebElement showRecommendationsCheckbox;

    @FindBy ( xpath = "(//input[@class='checkbox'])[3]")
    public WebElement showHiddenFilesFA;

    @FindBy ( xpath = "//input[@id='showhiddenfilesToggle']/following-sibling::label[@for='showhiddenfilesToggle']")
    public WebElement showHiddenFiles;

    @FindBy ( xpath = "//input[@type='file']")
    public WebElement uploadFileElement;
}
