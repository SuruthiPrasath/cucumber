package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensPojo1 extends BaseClass{
public GreensPojo1() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//span[@class='red_text'])[3]")
private WebElement scrldwn;
@FindBy(xpath="(//span[@class='blue_text'])[1]")
private WebElement scrlup;
public WebElement getScrldwn() {
	return scrldwn;
}
public WebElement getScrlup() {
	return scrlup;
}


}
