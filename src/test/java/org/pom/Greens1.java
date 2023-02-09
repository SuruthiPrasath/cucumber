package org.pom;

import java.time.Duration;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Greens1 extends BaseClass {
	public static void main(String[] args) {
		GreensPojo1 g1 = new GreensPojo1();
		GreensPojo2 g2 = new GreensPojo2();
		openChromeBrowser();
		launchUrl("http://www.greenstechnologys.com/");
		maxWindow();
		implicitWait(20);
		WebElement down = g1.getScrldwn();
		scrollDown(down);
		WebElement up = g1.getScrlup();
		scrollUp(up);
	}
}
