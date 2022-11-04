package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends BasePage{

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
