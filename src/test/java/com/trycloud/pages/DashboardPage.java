package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DashboardPage extends BasePage{

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//span")
    public List<WebElement>modulesName;


    public void verifyMainModulesName(List<String>expectedNames){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(dashboardLink).perform();
        List<String>actualNames =new ArrayList<>();
        for (WebElement element : modulesName) {
            actualNames.add(element.getText());
            if (element.getText().equals("Deck")){
                break;
            }
        }
        Assert.assertEquals(expectedNames,actualNames);
    }


    /**
     *
     * this method will access all the main modules and get the title
     * and create one list for all the titles
     * verify given modules name contains in the title
     * @param mainModulesName List of given name.
     */
    public void verifyAccessibilityOfMainModules(List<String>mainModulesName){
        List<String>mainModulesTitle = new ArrayList<>();
        for (String mainModule : mainModulesName) {
           WebElement module=Driver.getDriver().
                   findElement(By.xpath("//ul[@id='appmenu']//li//a[@aria-label='"+mainModule+"']"));
           module.click();
           mainModulesTitle.add(Driver.getDriver().getTitle());
        }

        for (String name : mainModulesName) {
            boolean contains= false;
            for (String title : mainModulesTitle) {
                    if(title.contains(name)) {
                        contains = true; // if title contains the name it will break the loop and start next name
                        break;
                    }
                }
            Assert.assertTrue(contains);
            }
        }

    /**
     * it takes given string list and use for loop to access all the modules
     * and get the title
     * then create map add name as key title as value
     * loop the map verify title contains the key
     * @param mainModulesName List of given name.
     */
    public void  verifyAccessibilityOfMainModulesWithMap(List<String>mainModulesName){
        Map<String,String> mainModules = new LinkedHashMap<>();
        for (String mainModule : mainModulesName) {
            WebElement module=Driver.getDriver().
                    findElement(By.xpath("//ul[@id='appmenu']//li//a[@aria-label='"+mainModule+"']"));
            module.click();
            mainModules.put(mainModule,Driver.getDriver().getTitle());
        }
        for (Map.Entry<String, String> entry : mainModules.entrySet()) {
            String title = entry.getValue();
            String expectedContains = entry.getKey();
            Assert.assertTrue(title.contains(expectedContains));
        }
    }



}
