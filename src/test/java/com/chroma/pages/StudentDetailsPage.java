package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class StudentDetailsPage extends PageInitializer{
    @FindBy(xpath = "(//input[@name='search_text'])[2]")
    public static WebElement searchByKeywordTextBox;

    @FindBy(xpath = "//button[@value='search_full']")
    public static WebElement searchButton;

    @FindBy(xpath = "//*[contains(text(),'No data available in table ')]")
    public static WebElement noDataAvailableMessage;

    public StudentDetailsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
