package org.SwagLabs.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = ".//Features" ,
		glue =  "org.SwagLabs.StepDefnition" ,
		dryRun = false,
		monochrome = true,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)	
public class Run  extends AbstractTestNGCucumberTests{
}
		
		
		
		
		
		

