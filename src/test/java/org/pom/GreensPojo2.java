package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensPojo2 extends BaseClass{
public GreensPojo2() {
	PageFactory.initElements(driver, this);
	}
@FindBy(xpath="(//a[text()=\"Course Content\"])[29]")
private WebElement cource;
public WebElement getCource() {
	return cource;
}


}
