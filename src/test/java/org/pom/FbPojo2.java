package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojo2 extends BaseClass {
public FbPojo2() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//h1[text()='Sorry, something went wrong.']")
private WebElement wrongmsg;
public WebElement getWrongmsg() {
	return wrongmsg;
}

}
