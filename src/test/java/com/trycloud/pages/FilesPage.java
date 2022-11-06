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


}
