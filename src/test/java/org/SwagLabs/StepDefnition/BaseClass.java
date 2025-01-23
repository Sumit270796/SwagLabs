package org.SwagLabs.StepDefnition;

import org.SwagLabs.PageObject.InventoryPage;
import org.SwagLabs.PageObject.LoginPage;
import org.SwagLabs.Utilities.ReadConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BaseClass {
 public static   WebDriver driver;
	public LoginPage loginPg;
	public  InventoryPage inventoryPg;
	public ReadConfig readconfig;
    public Logger logger = LogManager.getLogger();
}
