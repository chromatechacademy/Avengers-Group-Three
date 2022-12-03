package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class RealEstateDashboardPage {

    // Hello Admin Text
    @FindBy(xpath = "//h1[normalize-space()='Hello, Admin']")
    public WebElement dashboardHelloAdminText;

    public RealEstateDashboardPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
