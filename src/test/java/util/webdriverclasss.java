package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class webdriverclasss {

	static WebDriver driver=null;
public webdriverclasss(){
	webdriverclasss.getDriver();
	}
	public static WebDriver getDriver() {
	
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		webdriverclasss.driver = driver;
	}
	

}
