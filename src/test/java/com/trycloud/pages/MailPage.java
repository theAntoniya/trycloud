package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class MailPage extends BasePage{

    public MailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
