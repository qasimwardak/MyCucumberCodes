package com.hrms.stepdefinitions;

import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition extends CommonMethods {

    @Given("navigate to the HRMS login page")
    public void navigate_to_the_hrms_login_page() {
    setUp();
    }

    @When("enter valid credentials")
    public void enter_valid_credentials() {
       loginPage.login("Admin", "Hum@nhrm123");
    }

    @When("click on login button")
    public void click_on_login_button() {
      loginPage.clickOnLoginBtn();
    }

    @Then("verify dashboard is displayed")
    public void verify_dashboard_is_displayed() {
        Assert.assertTrue(dashboardPage.welcomeMessage.isDisplayed());
    }
    @Then("quit the browser")
    public void quit_the_browser() {
        tearDown();
    }
    @When("enter invalid credentials")
    public void enter_invalid_credentials() {
       loginPage.login("Adam", "Humdfkdjd");
    }

    @Then("verify error messages")
    public void verify_error_messages() {
        Assert.assertEquals("Verifying error message", "Invalid credentials", loginPage.getErrorTextMsg());
    }

    }
