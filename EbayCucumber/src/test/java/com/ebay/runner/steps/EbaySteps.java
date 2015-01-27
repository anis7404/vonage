package com.ebay.runner.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbaySteps {
	
	protected WebDriver driver;

    
    public EbaySteps() {
          driver = new FirefoxDriver();
          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          driver.manage().window().maximize();
    }
    
   
    @Given("^i want to go ebay$")
    public void i_want_to_go_ebay() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^enter URL \"(.*?)\"$")
    public void enter_URL(String url) throws Throwable {
        driver.navigate().to(url);
    }

    @Then("^ebay HomePage should show$")
    public void ebay_HomePage_should_show() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^As a product owner i want to see ebay logo$")
    public void as_a_product_owner_i_want_to_see_ebay_logo() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^i nevagite to ebayhome page \"(.*?)\"$")
    public void i_nevagite_to_ebayhome_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^ebay logo should display$")
    public void ebay_logo_should_display() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^As a user i want to seach for tv$")
    public void as_a_user_i_want_to_seach_for_tv() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I Enter \"(.*?)\" in search text box$")
    public void i_Enter_in_search_text_box(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Click on Search button$")
    public void click_on_Search_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Text \"(.*?)\" Should be display$")
    public void text_Should_be_display(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
