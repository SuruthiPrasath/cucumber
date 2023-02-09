package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo1 extends BaseClass {
public AdactinPojo1() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement userName;
@FindBy(id="password")
private WebElement pwd;
@FindBy(id="login")
private WebElement btn;
public WebElement getUserName() {
	return userName;
}
public WebElement getPwd() {
	return pwd;
}
public WebElement getBtn() {
	return btn;
}

}