package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

public class Task1 extends BaseClass{
public static void main(String[] args) {
	openChromeBrowser();
	launchUrl("https://www.facebook.com");
	maxWindow();
	FbLoginPojo l=new FbLoginPojo();
	FbPojo2 l2 =new FbPojo2();
	WebElement email = l.getUsername();
	//fillTextBox(email, "suruthigeo@gmail.com");
	//driver.navigate().refresh();
	//fillTextBox(email, "Greenstech");
	//fillTextBox(l.getPassword(), "GREens123");
	//WebElement btnlogin = l.getLoginBtn();
	//toClickButton(btnlogin);
	//WebElement wrongmsg = l2.getWrongmsg();
	//toGetText(wrongmsg);
	scrollDown(email);
	
	
	
}
}
