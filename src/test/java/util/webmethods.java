package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.Baseclass;
import models.Meathods_Getter_And_Setter;

public class webmethods {
	
public static void chooseAction(String actiontype){
	
	switch(actiontype.toLowerCase()){
	case "click":
		click();
	break;
	
	case "doubleclick":
		doubleclick();
	break;
	
	case "navigate":
	break;
	}
	
	
}
public static void click(){
	
	Meathods_Getter_And_Setter s1 = new Meathods_Getter_And_Setter();
	WebDriverWait wait = new WebDriverWait(webdriverclasss.getDriver(), 20);
	wait.until(ExpectedConditions.elementToBeClickable(s1.getElement()));
	s1.getElement().click();
}
public static void sendkeys(String text){
	
	Meathods_Getter_And_Setter s1 = new Meathods_Getter_And_Setter();
	WebDriverWait wait = new WebDriverWait(webdriverclasss.getDriver(), 20);
	wait.until(ExpectedConditions.visibilityOf(s1.getElement()));
	s1.getElement().sendKeys(text);
}

public static void doubleclick(){
	
	Actions action = new Actions(webdriverclasss.getDriver());
	Meathods_Getter_And_Setter s1 = new Meathods_Getter_And_Setter();
	WebDriverWait wait = new WebDriverWait(webdriverclasss.getDriver(), 20);
	wait.until(ExpectedConditions.visibilityOf(s1.getElement()));
	action.doubleClick(s1.getElement());
}
}
