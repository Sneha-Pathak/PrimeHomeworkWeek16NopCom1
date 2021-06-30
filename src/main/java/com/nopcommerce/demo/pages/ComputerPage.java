package com.nopcommerce.demo.pages;

import com.cucumber.listener.Reporter;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
    WebElement desktop;

    public void clickOnDesktop()
    {
        clickOnElement(desktop);
        log.info("Clicking on Desktop...." + desktop.toString());
    }
}
