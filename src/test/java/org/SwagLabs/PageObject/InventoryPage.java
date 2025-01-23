package org.SwagLabs.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
WebDriver driver;

public InventoryPage(WebDriver driver) {
	this.driver=driver;
PageFactory.initElements(driver, this);
}
 
@FindBy(xpath = "//button[text()='Open Menu']")
WebElement openMenuBtn;

@FindBy(xpath = "//a[@id='logout_sidebar_link']")
WebElement logOutLink;

public void clickOpenMenuBtn() {
 openMenuBtn.click();
}

public void clickLogOutLink() {
	logOutLink.click();
}
}
