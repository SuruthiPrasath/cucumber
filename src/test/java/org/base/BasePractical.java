package org.base;
import java.awt.AWTException;
import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class BasePractical extends BaseClass {
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	openChromeBrowser();
	launchUrl("http://adactinhotelapp.com/");
	maxWindow();
	WebElement usrName = driver.findElement(By.id("username"));
	fillTextBox(usrName, readDataFromExcel("Sheet2", 1, 0));
	WebElement pwd = driver.findElement(By.id("password"));
	fillTextBox(pwd, readDataFromExcel("Sheet2", 1, 1));
	driver.findElement(By.id("login")).click();
	WebElement loc = driver.findElement(By.id("location"));
	selByValue(loc, "New York");
	WebElement hotel = driver.findElement(By.id("hotels"));
	selByText(hotel, "Hotel Hervey");
	WebElement room = driver.findElement(By.id("room_type"));
	selByValue(room, "Double");
	WebElement roomNo = driver.findElement(By.id("room_nos"));
	selByValue(roomNo, "4");
	//WebElement dateIn = driver.findElement(By.id("datepick_in"));
	//a.doubleClick();
	//repSendKeys(readDataFromExcel("Sheet2", 1, 2), dateIn);
	//WebElement dateOut = driver.findElement(By.id("datepick_out"));
	//repSendKeys(readDataFromExcel("Sheet2", 2, 2), dateOut);
	WebElement adlt = driver.findElement(By.id("adult_room"));
	selByValue(adlt, "2");
	WebElement child = driver.findElement(By.id("child_room"));
	selByValue(child, "2");
	driver.findElement(By.id("Submit")).click();
	driver.findElement(By.id("radiobutton_0")).click();
	driver.findElement(By.id("continue")).click();
	WebElement fstName = driver.findElement(By.id("first_name"));
	fillTextBox(fstName, readDataFromExcel("Sheet2", 2, 0));
	WebElement lstName = driver.findElement(By.id("last_name"));
	fillTextBox(lstName, readDataFromExcel("Sheet2", 3, 0));
	WebElement adrs = driver.findElement(By.id("address"));
	fillTextBox(adrs, readDataFromExcel("Sheet2", 1, 3));
	WebElement crdNo = driver.findElement(By.id("cc_num"));
	fillTextBox(crdNo, readDataFromExcel("Sheet2", 1, 4));
	WebElement crdType = driver.findElement(By.id("cc_type"));
	selByValue(crdType, "VISA");
	WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
	selByText(expMonth, "December");
	WebElement expYear = driver.findElement(By.id("cc_exp_year"));
	selByValue(expYear, "2022");
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	fillTextBox(cvv, readDataFromExcel("Sheet2", 1, 5));
	driver.findElement(By.id("book_now")).click();
	
}
}
