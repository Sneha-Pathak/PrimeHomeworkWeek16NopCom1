package com.nopcommerce.demo.stepdef;

import com.nopcommerce.demo.pages.BuildYourOnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestSuite
{
    @When("^I select computers menu$")
    public void iSelectComputersMenu()
    {
        new HomePage().clickOnComputer();
    }

    @And("^I select desktops$")
    public void iSelectDesktops() throws InterruptedException
    {
        Thread.sleep(3000);
        new ComputerPage().clickOnDesktop();
    }

    @And("^I select sort by position Name: Z to A$")
    public void iSelectSortByPositionNameZToA() throws InterruptedException
    {
        Thread.sleep(3000);
        new DesktopPage().sortByValuePosition("6"); //Name Z To A value is 6
    }

    @Then("^I should see the product in descending order$")
    public void iShouldSeeTheProductInDescendingOrder()
    {
        new DesktopPage().verifyProductListSortedOrNot();
    }

    @And("^I select sort by position Name: A to Z$")
    public void iSelectSortByPositionNameAToZ()
    {
        new DesktopPage().sortByValuePosition("5"); //Name A To Z value is 5
    }

    @And("^I click on Add to Cart$")
    public void iClickOnAddToCart() throws InterruptedException
    {
        Thread.sleep(3000);
        new DesktopPage().clickOnAddToCart();
    }

    @And("^I should navigate to Build your computer page$")
    public void iShouldNavigateToBuildYourComputerPage()
    {
        Assert.assertEquals("Build your own computer", new BuildYourOnComputerPage().getBuildYourOwnComputerText());
    }


    @And("^I select (\\d+)\\.(\\d+) GHz Intel Pentium Dual-Core E(\\d+) Processor$")
    public void iSelectGHzIntelPentiumDualCoreEProcessor(int arg0, int arg1, int arg2)
    {
        new BuildYourOnComputerPage().selectProcessor("1");
    }

    @And("^I select (\\d+)GB \\[\\+\\$(\\d+)\\.(\\d+)\\] RAM$")
    public void iSelectGB$RAM(int arg0, int arg1, int arg2)
    {
        new BuildYourOnComputerPage().selectRam("5");
    }

    @And("^I select (\\d+)GB \\[\\+\\$(\\d+)\\.(\\d+)\\] HDD$")
    public void iSelectGB$HDD(int arg0, int arg1, int arg2)
    {
        new BuildYourOnComputerPage().clickOnHDD400RadioBtn();
    }

    @And("^I select Vista Premium \\[\\+\\$(\\d+)\\.(\\d+)\\] OS$")
    public void iSelectVistaPremium$OS(int arg0, int arg1)
    {
        new BuildYourOnComputerPage().clickOnOSVistaPremiumRadioBtn();
    }

    @And("^I select Total Commander \\[\\+\\$(\\d+)\\.(\\d+)\\] Software$")
    public void iSelectTotalCommander$Software(int arg0, int arg1) throws InterruptedException
    {
        new BuildYourOnComputerPage().clickOnTotalCommanderCheckBox();
    }

    @And("^I verify total price \\$(\\d+),(\\d+)\\.(\\d+)$")
    public void iVerifyTotalPrice$(int arg0, int arg1, int arg2) throws InterruptedException
    {
        Thread.sleep(20000);
        Assert.assertEquals("$1,475.00",new BuildYourOnComputerPage().getPriceText());
    }

    @And("^I click on Add to cart button$")
    public void iClickOnAddToCartButton()
    {
        new BuildYourOnComputerPage().clickOnAddToCartBtn();
    }

    @Then("^I should able to add product in shopping cart$")
    public void iShouldAbleToAddProductInShoppingCart()
    {
        Assert.assertEquals("The product has been added to your shopping cart", new BuildYourOnComputerPage().getPopUpMsg());
    }
}
