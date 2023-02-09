package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusPojo2 extends BaseClass {
public RedBusPojo2() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="mobileNoInp")
private WebElement mob;
public WebElement getMob() {
	return mob;
}

}
