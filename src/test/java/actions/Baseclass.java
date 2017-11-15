package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Baseclass {
public static WebDriver driver=null;

//@Parameters("Browser")
public static WebDriver chooseBrowser(String Browser){
	try{
	if(Browser.equals("FF")){
	 driver= new FirefoxDriver();
			}
	else if(Browser.equals("GC")){
		driver= new FirefoxDriver();
	}
	}
	catch(Exception e){
		System.out.println("Problem launching browsers");
		e.printStackTrace();
	}
	return driver;
}

public static void loadurl(String url){
	try{
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	catch(Exception e){
		System.out.println("problem in the url");
		e.printStackTrace();
	}
	
}

}
