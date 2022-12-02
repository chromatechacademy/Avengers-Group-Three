package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentDetailsPage{

    // locate Search by keyword text box
    @FindBy(xpath = "(//input[@name='search_text'])[2]")
    public WebElement searchByKeywordTextBox;

    // locate Search button
    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement searchButton;

    // locate no available data message
    @FindBy(xpath = "//*[contains(text(),'No data available in table ')]")
    public WebElement noDataAvailableMessage;

    public StudentDetailsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
