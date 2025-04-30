package com.automateQA.stepDefinitions;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.automateQA.accountPage.AccountPage;
import com.automateQA.driverM.DriverM;
import com.automateQA.editAccount.EditAccount;
import com.automateQA.loginPage.LoginPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    WebDriver wd;
    LoginPage lpObj;
    AccountPage apObj;
    EditAccount eaObj;
	DriverM driverObj = new DriverM();

    @Before
    public void setUp() {
        wd = driverObj.getDriver();
        lpObj = new LoginPage();
        apObj = new AccountPage();
        eaObj = new EditAccount();
    }

//scenario 1 tag 1
	@Given("I am at the login page")
	public void Given_I_am_at_the_login_page() {
		lpObj.launchBrowser();
		System.out.println("Given I am at the login page");
	}
	@When("I enter my correct email")
	public void When_I_enter_my_correct_email() {
		lpObj.enterUserEmail("sample123@gmail.com");
	    System.out.println("When I enter my correct email");
	}

	@When("I enter my correct password")
	public void When_I_enter_my_correct_password() {
		lpObj.enterPassword("sample123");
	    System.out.println("When I enter my correct password");
	}

	@And("I click on login button")
	public void And_I_click_on_login_button() {
		lpObj.clickLogin();
	    System.out.println("And I click on login button");
	}

	@Then("I would be navigated to home page")
	public void Then_I_would_be_navigated_to_home_page() {
	    System.out.println("Then I would be navigated to home page");
	}

//	scenario two tag1

	@Given("I am at the home page")
	public void Given_I_am_at_the_home_page() {
		System.out.println("Given I am at the home page");
	}

	@And("I extract text from the page")
	public void And_I_extract_text_from_the_page() {
		apObj.extractHeadText();
		System.out.println("And I extract text from the page");
	}
	
	@Then("I would do nothing")
	public void Then_I_would_do_nothing() {
		System.out.println("Then I would do nothing");
	}
	
//	scenario three  tag1
	 @Given("I am at the homepage")
	    public void Given_I_am_at_the_homepage() {
	        System.out.println("Navigated to the homepage.");
	    }

	    @When("I click onto edit account settings")
	    public void When_I_click_onto_edit_account_settings() {
	    	eaObj.clickEditAccount();
	        System.out.println("Clicked on edit account settings.");
	    }

	    @And("I go to the account setting page")
	    public void And_I_go_to_the_account_setting_page() {
	        System.out.println("Navigated to the account settings page.");
	    }

	    @And("^I change (.*$)")
	    public void And_I_change_last_name(String lastname) {
	    	
	    	eaObj.editLastName(lastname);
	        System.out.println("Changed the last name.");
	    }

	    @And("I click on continue")
	    public void And_I_click_on_continue() {
	    	eaObj.clickContinue();
	        System.out.println("Clicked on continue.");
	    }
	
}
