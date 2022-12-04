package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class ValidateAgentModulePage {

    // Click on Agent Btn
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public WebElement agentBtn;

    // Text Memebers List
    @FindBy(xpath = "//button[@class='sidebar-item']")
    public WebElement membersSign ;

     // Text Active Sign
     @FindBy(xpath = "(//*[contains(text(),'Active')])[1]")
     public WebElement activeSign ;

     // Text Inactive Sign
     @FindBy(xpath = "//*[contains(text(),'Inactive')]")
     public WebElement inactiveSign ;
     
     // Text AllAgents Sign
     @FindBy(xpath = "(//*[contains(text(),'All Agents')])[1]")
     public WebElement allAgentsign ;

     // Text Add Now Sign
     @FindBy(xpath = "//*[contains(text(),'Add Now')]")
     public WebElement addNowsign ;

    // Text Name Sign
    @FindBy(xpath = "(//*[contains(text(), 'Name')])[1]")
      public WebElement nameSign;

    // Text Mail Sign
    @FindBy(xpath = "//*[contains(text(), 'Mail')]")
    public WebElement mailSign;

    // Text Contac Number Sign
    @FindBy(xpath = "//*[contains(text(), 'Contact Number')]")
    public WebElement contactNumberSign;

    // Text Contac Actions Sign
    @FindBy(xpath = "//*[contains(text(), 'Actions')]")
    public WebElement actionsSign;

    public ValidateAgentModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }  
}
