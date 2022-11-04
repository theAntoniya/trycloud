package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class PhotosPage extends BasePage{

    public PhotosPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
