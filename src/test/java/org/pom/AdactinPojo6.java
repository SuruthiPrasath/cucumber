package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo6 extends BaseClass {
public AdactinPojo6() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="order_no") 
private WebElement orderid;
public WebElement getOrderid() {
	return orderid;
}

}
