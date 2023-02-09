package org.pom;

import org.base.BaseClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusPojo extends BaseClass {
	public RedBusPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="signin-block")
	private WebElement signIn;
	@FindBy(id="hc")
	private WebElement clkSignIn;
	public WebElement getSignIn() {
		return signIn;
	}
	public WebElement getClkSignIn() {
		return clkSignIn;
	}
	
}

