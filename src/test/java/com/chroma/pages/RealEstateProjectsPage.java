package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateProjectsPage  {

    // Projects Tab
    @FindBy(xpath = "//span[normalize-space()='Projects']")
    public WebElement projectsText;

    // All Projects Text
    @FindBy(xpath = "//h1[@class='mainUserText']")
    public WebElement allProjectsText;

    public RealEstateProjectsPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
