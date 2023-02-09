package org.run;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReportGeneration {
public static void buildReports(String jsonPath) {
	//1.File location
	File f=new File("C:\\Users\\surut\\eclipse-workspace\\Cucumber\\Reports\\JVMReport");
	Configuration c = new Configuration(f, "FACEBOOK");
	c.addClassifications("Pplatform", "Windows-11");
	c.addClassifications("JDKVersion", "1.8");
	c.addClassifications("IDE", "Eclipse-Oxygen3a");
	List<String> li = new ArrayList<>();
	li.add(jsonPath);
	ReportBuilder r = new ReportBuilder(li, c);
	r.generateReports();
	

}
}
