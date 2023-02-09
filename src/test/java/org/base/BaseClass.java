package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	static Robot r;
	static Actions a;
	static Alert al;
	static JavascriptExecutor js;
	static Select s;
	public static void openChromeBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

}
public static void openEdgaeBrowser() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();

}
public static void maxWindow() {
	driver.manage().window().maximize();
}
public static void closeBrowser() {
	driver.quit();

}
public static void closeTab() {
	driver.close();

}
public static String toFetchUrl() {
	String url = driver.getCurrentUrl();
	return url;

}
public static String toFetchTitle() {
	String title = driver.getTitle();
	return title;

}
public static void launchUrl(String url) {
	driver.get(url);

}
public static void implicitWait(int time) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
}

public static void fillTextBox(WebElement element,String input) {
	element.sendKeys(input);

}
public static void toClickButton(WebElement element) {
	element.click();
}
public static String toGetText(WebElement webRef) {
	String st1 = webRef.getText();
	System.out.println(st1);
	return st1;
}
public static String toGetAttribute(WebElement webRef1,String value) {
	String st2 = webRef1.getAttribute(value);
	System.out.println(st2);
	return st2;
}
public static void holdPgm(int  time) throws InterruptedException {
	Thread.sleep(time);
}
public static void copy() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);
}
public static void paste() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);

}
public static void tab() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);

}
public static void selectAll() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);

}
public static void dragDrop(WebElement src,WebElement des) {
	a=new Actions(driver);
	a.dragAndDrop(src, des);
}
public static void doubleClick(WebElement ele) {
	a=new Actions(driver);
	a.doubleClick(ele);

}
public static void rightClick(WebElement ele) {
	a=new Actions(driver);
	a.contextClick(ele);
}
public static void takeSnap(String picName) throws IOException {
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\surut\\eclipse-workspace\\MavenPgm\\Screenshot\\"+picName+".png");
	FileUtils.copyFile(src, des);
}
public static void mouseHovering(WebElement ele1) {
	a=new Actions(driver);
	a.moveToElement(ele1);

}
public static void acceptAlert() {
	al=driver.switchTo().alert();
	al.accept();
}
public static void dismissAlert() {
	al.dismiss();

}
public static void sendKeysAlert(String ele2) {
	al.sendKeys(ele2);
}
public static void getTextAlert() {
	al.getText();

}
public static void toDateTime() {
	Date d= new Date();
	System.out.println(d);

}
public static void repSendKeys(String txt,WebElement ele2) {
	js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','txt')", ele2);
}
public static void repClick() {
	js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()");
}
public static void scrollDown(WebElement ele3) {
	js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", ele3);

}
public static void scrollUp(WebElement ele4) {
	js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)", ele4);

}
public static void switchFrameByIndex(int index) {
	driver.switchTo().frame(index);

}
public static void switchFrameById(String id) {
	driver.switchTo().frame("id");

}
public static void switchFrameByRef(WebElement elemref) {
	driver.switchTo().frame(elemref);
}
public static void switchParentFrame() {
	driver.switchTo().parentFrame();

}
public static void selByValue(WebElement ele5,String val) {
	s=new Select(ele5);
	s.selectByValue(val);
}
public static void selByIndex(WebElement ele6,int indexNum) {
	s=new Select(ele6);
	s.selectByIndex(indexNum);

}
public static void selByText(WebElement ele7,String text) {
	s=new Select(ele7);
	s.selectByVisibleText(text);

}
public static void checkIsMultiple() {
	boolean multi = s.isMultiple();

}
public static void noOfOptions() {
	List<WebElement> allOption = s.getOptions();
	System.out.println(allOption.size());
}
public static void fstSelOPtion() {
	WebElement fstOption = s.getFirstSelectedOption();
	System.out.println(fstOption);

}
public static void allSelOption() {
	List<WebElement> allSelOption = s.getAllSelectedOptions();
	System.out.println(allSelOption);

}
public static void deSelByVal(String val) {
	
	s.deselectByValue(val);

}
public static void deSelByIndex(int index) {
	s.deselectByIndex(index);

}
public static void deSelByText(String txt) {
	s.deselectByVisibleText(txt);

}
public static void deSelAll() {
	s.deselectAll();
}
public static void switchToWindById(String id) {
	driver.switchTo().frame(id);

}
public static void switchToWindowByUrl(String url) {
	driver.switchTo().frame(url);

}
public static void switchToWindByTitle(String title) {
	driver.switchTo().frame(title);

}
public static void parentWindId() {
	String parId = driver.getWindowHandle();
	System.out.println(parId);

}
public static void allWindId() throws InterruptedException {
	Set<String> allWindId = driver.getWindowHandles();
	List<String> li = new ArrayList<String>(allWindId);
	driver.switchTo().window(li.get(1));
	
}
public static String readDataFromExcel(String sheetName,int rowNo,int cellNo) throws IOException {
	File f = new File("C:\\Users\\surut\\eclipse-workspace\\MavenPgm\\ExcelSheets\\GreensTech.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook b = new XSSFWorkbook(fin);
	Sheet sh = b.getSheet(sheetName);
	Row r = sh.getRow(rowNo);
	Cell c = r.getCell(cellNo);
	int type = c.getCellType();
	String input;
	if (type==1) {
		input=c.getStringCellValue();
	}
	else if (DateUtil.isCellDateFormatted(c)) {
		Date da = c.getDateCellValue();
		SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy"); 
		input = sim.format(da);
	}
	else {
		double d = c.getNumericCellValue();
		long l=(long)d;
		input = String.valueOf(l);
		
	}
	return input;
}
public static void writeDataToExcel(String sheetName,String val,int rowNo,int cellNo) throws IOException {
	File f = new File("C:\\Users\\surut\\eclipse-workspace\\MavenPgm\\ExcelSheets\\GreensTech.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook b = new XSSFWorkbook(fin);
	Sheet s = b.getSheet(sheetName);
	Row r = s.createRow(rowNo);
	Cell c = r.createCell(cellNo);
	c.setCellValue(val);
	FileOutputStream fout=new FileOutputStream(f);
	b.write(fout);
}
}


