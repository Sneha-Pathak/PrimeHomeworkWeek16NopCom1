package com.nopcommerce.demo.stepdef;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TopMenu
{
    @Given("^I am on homepage$")
    public void iAmOnHomepage()
    {

    }

    @When("^I select top menu catagory$")
    public void iSelectTopMenuCatagory()
    {
        new HomePage().mouseHoverOnTopMenu();
    }

    @Then("^I should navigate to selected menu page successfully$")
    public void iShouldNavigateToSelectedMenuPageSuccessfully()
    {
        new HomePage().selectMenu("Apparel"); //Menu are Computers,Electronics,Apparel,Digital downloads,Books,Jewelry,Gift Cards
        Assert.assertEquals("Apparel",new HomePage().getTopMenuText());
    }
}
