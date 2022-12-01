package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class DashboardPage extends PageInitializer {

    // Chroma Tech Academy dashboard text
    @FindBy(xpath = "//span[normalize-space()='Chroma Tech Academy']")
    public WebElement dashBoardChromaTechText;

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
