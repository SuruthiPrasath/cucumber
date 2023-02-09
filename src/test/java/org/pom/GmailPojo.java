package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPojo extends BaseClass {
public GmailPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(name="identifier")
private WebElement userName;
@FindBy(xpath="//span[text()='Next']")
private WebElement nxt;
public WebElement getUserName() {
	return userName;
}
public WebElement getNxt() {
	return nxt;
}

}
