package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPojo extends BaseClass {
public FlipkartPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement userName;
@FindBy(xpath="//input[@type='password']")
private WebElement pwd;
@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement click;
public WebElement getUserName() {
	return userName;
}
public WebElement getPwd() {
	return pwd;
}
public WebElement getClick() {
	return click;
}

}
