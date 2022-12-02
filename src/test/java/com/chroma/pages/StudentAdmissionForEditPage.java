package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class StudentAdmissionForEditPage extends PageInitializer {

    // Admission No Text Box
    @FindBy(xpath = "//input[@name='admission_no']")
    public WebElement admissionNoTextBox;

     // Class DropDown
     @FindBy(xpath = "//select[@name='class_id']")
     public WebElement classIdDropDown;

  public StudentAdmissionForEditPage() {
    PageFactory.initElements(WebDriverUtils.driver, this);


}

}