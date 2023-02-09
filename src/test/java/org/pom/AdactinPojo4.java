package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo4 extends BaseClass{
public AdactinPojo4() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="first_name")
private WebElement fstName;
@FindBy(id="last_name")
private WebElement lstName;
@FindBy(id="address")
private WebElement adrs;
@FindBy(id="cc_num")
private WebElement cardNo;
@FindBy(id="cc_type")
private WebElement cardType;
@FindBy(id="cc_exp_month")
private WebElement expMonth;
@FindBy(id="cc_exp_year")
private WebElement expYear;
@FindBy(id="cc_cvv")
private WebElement ccvNo;
@FindBy(id="book_now")
private WebElement bookBtn;
@FindBy(id="cancel")
private WebElement cancelBtn;
public WebElement getFstName() {
	return fstName;
}
public WebElement getLstName() {
	return lstName;
}
public WebElement getAdrs() {
	return adrs;
}
public WebElement getCardNo() {
	return cardNo;
}
public WebElement getCardType() {
	return cardType;
}
public WebElement getExpMonth() {
	return expMonth;
}
public WebElement getExpYear() {
	return expYear;
}
public WebElement getCcvNo() {
	return ccvNo;
}
public WebElement getBookBtn() {
	return bookBtn;
}
public WebElement getCancelBtn() {
	return cancelBtn;
}

}
