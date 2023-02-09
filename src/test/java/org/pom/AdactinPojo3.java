package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo3 extends BaseClass {
public AdactinPojo3() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="radiobutton_0")
private WebElement btnclk;
@FindBy(id="continue")
private WebElement cntnu;
@FindBy(id="cancel")
private WebElement cancel;
public WebElement getBtnclk() {
	return btnclk;
}
public WebElement getCntnu() {
	return cntnu;
}
public WebElement getCancel() {
	return cancel;
}

}
