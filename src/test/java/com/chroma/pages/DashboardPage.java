package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class DashboardPage extends PageInitializer {
    //used a simple xpath for a boolean
    @FindBy(xpath = "//span[normalize-space()='Chroma Tech Academy']")
    public WebElement textBox;

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
