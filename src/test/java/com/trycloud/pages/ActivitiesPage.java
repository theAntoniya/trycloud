package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ActivitiesPage extends BasePage {

    public ActivitiesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
