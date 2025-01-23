package org.SwagLabs.StepDefnition;


import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.SwagLabs.PageObject.InventoryPage;
import org.SwagLabs.PageObject.LoginPage;
import org.SwagLabs.Utilities.ReadConfig;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class StepDef1 extends BaseClass {

	@Given("User launch browser")
	public void user_launch_browser() throws IOException {
		logger.info("launch browser");
		readconfig = new ReadConfig();
		String browser = readconfig.getBrowser();
		switch (browser.toLowerCase()) {
		case "chrome" :
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions .addArguments("--headless");
			chromeOptions .addArguments("--disable-gpu");
			chromeOptions .addArguments("--no-sandbox");
			driver = new ChromeDriver(chromeOptions);
			break;

		case "firefox" : 
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.addArguments("--headless");
			firefoxOptions.addArguments("--disable-gpu");
			firefoxOptions.addArguments("--ni-sandbox");
			driver = new FirefoxDriver(firefoxOptions);
			break;

		case "edge" : 
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addArguments("--headless");
			edgeOptions.addArguments("--disable-gpu");
			edgeOptions.addArguments("--no-sandbox");
			driver = new EdgeDriver(edgeOptions);
			break;

		default :
			System.out.println("browser not found");

			return;
		}}

	@When("User enter url {string}")
	public void user_enter_url(String url) {
		logger.info("Enter url");
		driver.get(url);



	}

	@When("User enter username as {string} and password  as {string}")
	public void user_enter_username_as_and_password_as(String uname, String pwd) {
		loginPg = new LoginPage(driver);
		logger.info("Enter username and password");
		loginPg.enterUserName(uname);
		loginPg.enterPassword(pwd);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		loginPg.clickLoginBtn();  	
		logger.info("Click on login button");
	}

	@Then("User navigate to the page pageTitle  should be {string}")
	public void user_navigate_to_the_page_page_title_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle ,actualTitle);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@Then("User click on open menu button")
	public void user_click_on_open_menu_button() {
		inventoryPg = new InventoryPage(driver);

		inventoryPg.clickOpenMenuBtn();
		logger.info("Click on open menu button");
	}

	@Then("User click on logout link")
	public void user_click_on_logout_link() {
		inventoryPg.clickLogOutLink();  
		logger.info("Click on logout link");
	}

	@When("User enter invalid credential username as {string} and password as {string}")
	public void user_enter_invalid_credential_username_as_and_password_as(String username, String password) {
     loginPg = new LoginPage(driver);
     loginPg.enterUserName(username);
     loginPg.enterPassword(password);
	}
	@When("User should see an error message {string}")
	public void user_should_see_an_error_message(String expectedMessage) {
    String actualMessage = loginPg.errorMsg();
    Assert.assertEquals(expectedMessage, actualMessage);
	}

   @When("User close browser")
	public void user_close_browser() {
    driver.quit();
	}
	
	
	
	
	
	

	}



