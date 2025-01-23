package org.SwagLabs.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     
WebDriver driver;

public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//input[@name='user-name']")
WebElement username;

@FindBy(xpath = "//input[@id='password']")
WebElement password;

@FindBy(xpath = "//input[@id='login-button']")
WebElement loginBtn;

@FindBy(xpath = "//h3[@data-test='error']")
WebElement invalidCredErrorMessage;

@FindBy(xpath = "//h3[normalize-space()='Epic sadface: Password is required']")
WebElement blankPwdErrorMsg;

@FindBy(xpath = "//h3[normalize-space()='Epic sadface: Username is required']")
WebElement  blankUnameErrorMsg;

public void enterUserName(String uname) {
username.sendKeys(uname);
}
                                                                      
public void enterPassword(String pwd) {
	password.sendKeys(pwd);
}

public void clickLoginBtn() {
	loginBtn.click();
	
}

public String  errorMsg() {
return invalidCredErrorMessage.getText();	
}

public String blankPasswordErrorMsg() {
	return blankPwdErrorMsg.getText();

}

public String blankUsernameErrorMsg() {
	return blankUnameErrorMsg.getText();

}


}
	
	
	



