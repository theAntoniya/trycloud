package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DeckPage extends BasePage{

    public DeckPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }





}
