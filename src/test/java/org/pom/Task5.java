package org.pom;

import java.io.IOException;
import java.time.Duration;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class Task5 extends BaseClass{
public static void main(String[] args) throws InterruptedException, IOException {
	openChromeBrowser();
	launchUrl("http://www.adactin.com/HotelApp/");
	maxWindow();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	AdactinPojo1 a1= new AdactinPojo1();
	AdactinPojo2 a2= new AdactinPojo2();
	AdactinPojo3 a3= new AdactinPojo3();
	AdactinPojo4 a4= new AdactinPojo4();
	AdactinPojo5 a5= new AdactinPojo5();
	AdactinPojo6 a6= new AdactinPojo6();
	WebElement username = a1.getUserName();
	fillTextBox(username,readDataFromExcel("Login", 0, 0));
	WebElement pwd = a1.getPwd();
	fillTextBox(pwd, "GabbyNeha");
	WebElement btn = a1.getBtn();
	toClickButton(btn);
	WebElement loc = a2.getLoc();
	selByValue(loc, "Sydney");
	WebElement hotel = a2.getHotel();
	selByValue(hotel, "Hotel Creek");
	WebElement room = a2.getRoom();
	selByValue(room, "Double");
	WebElement adult = a2.getAdult();
	selByValue(adult, "2");
	WebElement child = a2.getChild();
	selByValue(child, "2");
	WebElement clk = a2.getClk();
	toClickButton(clk);
	WebElement btnclk = a3.getBtnclk();
	toClickButton(btnclk);
	WebElement cntnu = a3.getCntnu();
	toClickButton(cntnu);
	WebElement fstName = a4.getFstName();
	fillTextBox(fstName, "Suruthi");
	WebElement lstName = a4.getLstName();
	fillTextBox(lstName, "Prsath");
	WebElement adrs = a4.getAdrs();
	fillTextBox(adrs, "Nagercoil");
	WebElement cardNo = a4.getCardNo();
	fillTextBox(cardNo, "0987656758765432");
	WebElement cardType = a4.getCardType();
	selByValue(cardType, "VISA");
	WebElement expMonth = a4.getExpMonth();
	selByValue(expMonth, "12");
	WebElement expYear = a4.getExpYear();
	selByValue(expYear, "2022");
	WebElement ccvNo = a4.getCcvNo();
	fillTextBox(ccvNo, "456");
	WebElement bookBtn = a4.getBookBtn();
	toClickButton(bookBtn);
	WebElement orderNo = a5.getOrderNo();
	String s1 = toGetAttribute(orderNo, "value");
	//a5.toGetText(orderNo);
	//writeDataToExcel("Login", "a5.getOrderNo", 3, 3);
	//String s1 = a5.toGetText(orderNo);
	writeDataToExcel("Login", s1, 4, 3);
}
}
