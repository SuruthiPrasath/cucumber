package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo2 extends BaseClass {
	public AdactinPojo2() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNoOfRoom() {
		return noOfRoom;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getClk() {
		return clk;
	}

	@FindBy(id = "location")
	private WebElement loc;
	@FindAll({ @FindBy(id = "hotels"), @FindBy(name = "hotels") })
	private WebElement hotel;
	@FindBy(id = "room_type")
	private WebElement room;
	@FindBy(id = "room_nos")
	private WebElement noOfRoom;
	@FindBy(id = "adult_room")
	private WebElement adult;
	@FindBy(id = "child_room")
	private WebElement child;
	@FindBy(id = "Submit")
	private WebElement clk;
}
