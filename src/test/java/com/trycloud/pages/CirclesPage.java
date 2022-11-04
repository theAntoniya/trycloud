package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class CirclesPage extends BasePage{

    public CirclesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
