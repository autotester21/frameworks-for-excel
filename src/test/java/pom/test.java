package pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import actions.Baseclass;
import models.Meathods_Getter_And_Setter;
import util.Findwebelements;
import util.webdriverclasss;
import util.webmethods;

public class test extends Baseclass {
	Baseclass base= new Baseclass();

	//Findwebelements elements = new Findwebelements(driver);
   
	@Test
	public void run(){
		   
	    Meathods_Getter_And_Setter s1 = new Meathods_Getter_And_Setter();
		webdriverclasss.setDriver(Baseclass.chooseBrowser("FF"));
		webmethods meth= new webmethods();
	   // Baseclass.chooseBrowser("FF");
	    //webdriverclasss.setDriver(Baseclass.chooseBrowser("FF"));
		Findwebelements elements = new Findwebelements(webdriverclasss.getDriver());
		Baseclass.loadurl("http://upgrade.uniqreate.net");
	    elements.webelementtypes("name", "email");
	    meth.sendkeys("rahul");
	    
		//s1.getElement().sendKeys("zsxfgckjm");
	    
		
	}

}
