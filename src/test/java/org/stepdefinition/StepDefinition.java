package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class StepDefinition extends BaseClass{
	FbLoginPojo f;
	@Given("enter login page")
	public void enter_login_page() {
		 
	}

	@Given("click forgot password button")
	public void click_forgot_password_button() {
	    WebElement forgotBtn = driver.findElement(By.xpath("//a[contains(text(),'password')]"));
	    toClickButton(forgotBtn);
	}

	@When("enter phone number")
	public void enter_phone_number(DataTable d) {
		List<String> li = d.asList();
	   WebElement mobNum = driver.findElement(By.xpath("//input[contains(@placeholder,'mobile')]"));
	   fillTextBox(mobNum, li.get(10));
	}
	@Given("maximize window")
	public void maximize_window() {
	    maxWindow();
	}

	@When("click search button")
	public void click_search_button() {
	    driver.findElement(By.id("did_submit")).click();	
	    }

	@Then("recover page")
	public void recover_page() {
	    System.out.println("recovery Page");
	}
	@When("enter valid email and invalid password")
	public void enter_valid_email_and_invalid_password(DataTable d) {
		List<List<String>> li = d.asLists();
	    f=new FbLoginPojo();
	    WebElement txtUsr = f.getUsername();
	    fillTextBox(txtUsr, "fghjk");
	    WebElement txtPwd = f.getPassword();
	    fillTextBox(txtPwd, li.get(0).get(5));
	    
	}
	@When("click login button")
	public void click_login_button() {
	   f=new FbLoginPojo();
	   f.getLoginBtn().click();
	  
	}

	@Then("User have to be in invalid credentials page")
	public void user_have_to_be_in_invalid_credentials_page() {
	   System.out.println("Invalid credential page");	}

	@When("enter invalid email and valid password")
	public void enter_invalid_email_and_valid_password(DataTable d) {
		Map<String, String> m = d.asMap(String.class, String.class);
		String s = m.get("password");
	    f=new FbLoginPojo();
	    WebElement txtUsr = f.getUsername();
	    fillTextBox(txtUsr, s);
	    WebElement txtPwd = f.getPassword();
	    fillTextBox(txtPwd,m.get("username"));
	}

	@When("enter invalid email and invalid password")
	public void enter_invalid_email_and_invalid_password(DataTable d) {
		f=new FbLoginPojo();
		List<Map<String, String>> m = d.asMaps();
		String s = m.get(2).get("Username");
	    WebElement txtUsr = f.getUsername();
	    fillTextBox(txtUsr, s);
	    WebElement txtPwd = f.getPassword();
	    fillTextBox(txtPwd,m.get(1).get("phnumber"));
   
	}
	@Given("enter fb login page")
	public void enter_fb_login_page() {
		
	}

	@When("enter {string} and {string}")
	public void enter_and(String val1, String val2) {
	  f=new  FbLoginPojo();
	  WebElement username = f.getUsername();
	  fillTextBox(username, val1);
	  WebElement pwd = f.getPassword();
	  fillTextBox(pwd, val2);
	}

	@Then("invalid credential page")
	public void invalid_credential_page() {
		
	    System.out.println("invalid credential");
	}

}
