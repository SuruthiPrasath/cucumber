package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPojo extends BaseClass{
public DemoqaPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="firstname")
private WebElement fstName;
@FindBy(id="lastname")
private WebElement lstName;
@FindBy(id="userName")
private WebElement usrName;
@FindBy(id="password")
private WebElement pwd;
@FindBy(xpath="//iframe[@title='reCAPTCHA']")
private WebElement frame;
public WebElement getFrame() {
	return frame;
}
@FindBy(xpath="//span[@role='checkbox']")
private WebElement robot;
@FindBy(id="register")
private WebElement register;
public WebElement getFstName() {
	return fstName;
}
public WebElement getLstName() {
	return lstName;
}
public WebElement getUsrName() {
	return usrName;
}
public WebElement getPwd() {
	return pwd;
}
public WebElement getRobot() {
	return robot;
}
public WebElement getRegister() {
	return register;
}

}
