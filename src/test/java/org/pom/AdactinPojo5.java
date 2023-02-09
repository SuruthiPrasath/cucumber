package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo5 extends BaseClass{
public AdactinPojo5() {
	PageFactory.initElements(driver, this);
	}
@FindBy(id="order_no")
private WebElement orderNo;
public WebElement getOrderNo() {
	return orderNo;
}
}
