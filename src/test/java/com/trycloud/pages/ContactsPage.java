package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage{

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
