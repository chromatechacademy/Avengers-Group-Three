package com.chroma.pages;

import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class RealEstateProjectsPage {

    

    public RealEstateProjectsPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
