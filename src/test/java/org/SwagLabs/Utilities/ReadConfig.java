package org.SwagLabs.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
Properties properties;

public ReadConfig() throws IOException {
     properties = new Properties();
	String File = "Config.properties";
 FileInputStream fis = new FileInputStream(File);
         properties.load(fis);

}

public String getBrowser() {
	return properties.getProperty("browser");
}


}
