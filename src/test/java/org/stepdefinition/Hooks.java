package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
@Before(order=3)
public void befSce3() {
	openChromeBrowser();
	launchUrl("https://www.facebook.com");
	System.out.println("Scenario3 started");
}
@After(order=1)
public void aftSce1() {
closeBrowser();
System.out.println("Scenario1 completed");
}

@After(order=2)
public void aftSce3(Scenario s) {
	if (s.isFailed()) {
		TakesScreenshot tk=(TakesScreenshot)driver;
		byte[] screen = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(screen, "image.png");
	}

}
}
