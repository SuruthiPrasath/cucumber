package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass{

public FbLoginPojo() {
PageFactory.initElements(driver, this);		
}
@FindBy(id="email")
private WebElement username;
@FindBy(id="pass")
private WebElement password;
@FindBy(name="login")
private WebElement loginBtn;
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLoginBtn() {
	return loginBtn;
}



}
