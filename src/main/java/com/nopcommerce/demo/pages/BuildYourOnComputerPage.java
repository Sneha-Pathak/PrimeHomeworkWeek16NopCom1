package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildYourOnComputerPage extends Utility
{
    private static final Logger log = LogManager.getLogger(BuildYourOnComputerPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyTextBuildOwnComputer;

    @FindBy(id = "product_attribute_1")
    WebElement processor;

    @FindBy(id = "product_attribute_2")
    WebElement ram;

    @FindBy(id = "product_attribute_3_7")
    WebElement radio_hdd_400;

    @FindBy(id = "product_attribute_4_9")
    WebElement radio_os_vista_premium;

    @FindBy(id = "product_attribute_5_12")
    WebElement total_commander_checkbox;

    @FindBy(id = "add-to-cart-button-1")
    WebElement cart_btn;

    @FindBy(xpath = "//span[@class='close']")
    WebElement close_shopping_popup_bar;

    @FindBy (id = "price-value-1")
    WebElement price;

    @FindBy (xpath = "//div[@id='bar-notification']/div/p")
    WebElement popUp_msg;

    public String getBuildYourOwnComputerText()
    {
        log.info("Verifying Build Your Own Computer text...." + verifyTextBuildOwnComputer.toString());
        return getTextFromElement(verifyTextBuildOwnComputer);
    }
    public void selectProcessor(String value)
    {
        selectByValueFromDropDown(processor,value);
        log.info("Select Processor...." + processor.toString());
    }

    public void selectRam(String value)
    {
        selectByValueFromDropDown(ram,value);
        log.info("Select RAM...." + ram.toString());
    }

    public void clickOnHDD400RadioBtn()
    {
        clickOnElement(radio_hdd_400);
        log.info("Select HDD 400...." + radio_hdd_400.toString());
    }

    public void clickOnOSVistaPremiumRadioBtn()
    {
        clickOnElement(radio_os_vista_premium);
        log.info("Select os vista premium " + radio_os_vista_premium.toString());
    }

    public void clickOnTotalCommanderCheckBox() throws InterruptedException
    {
        clickOnElement(total_commander_checkbox);
        Thread.sleep(5000);
        log.info("Select total commander check box " + total_commander_checkbox.toString());
    }

    public void clickOnAddToCartBtn()
    {
        clickOnElement(cart_btn);
        log.info("Clicking on Add to cart" + cart_btn.toString());
    }

    public void setClose_shopping_popup_bar()
    {
        clickOnElement(close_shopping_popup_bar);
        log.info("Clicking on pop up");
    }

    public String getPriceText()
    {
        log.info("Verifying Price");
        return getTextFromElement(price);
    }

    public String getPopUpMsg()
    {
        log.info("Verifying Product added to cart");
        return getTextFromElement(popUp_msg);
    }
}
