package util;

import models.Meathods_Getter_And_Setter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.Baseclass;
public class Findwebelements {
 WebDriver driver=null;
  
	 //Meathods_Getter_And_Setter s1 = new Meathods_Getter_And_Setter();
	public Findwebelements(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
       }

	public void webelementtypes(String locatortype, String objectlocator){
		Meathods_Getter_And_Setter s1 = new Meathods_Getter_And_Setter();
		s1.setObjectlocator(objectlocator);

switch (locatortype.toLowerCase())
{
case "id":
	findelementbyid(s1.getObjectlocator());
	break;
	
case "name":
	System.out.println(driver);
	findelementbyName(s1.getObjectlocator());
	break;
	
case "xpath":
	findelementbyXpath(s1.getObjectlocator());
	break;

case "xpath elements":
	findelementsbyXpath(s1.getObjectlocator());
	break;
}
}

public  void findelementbyid(String objectloactor){
	try {
		Meathods_Getter_And_Setter s1 = new Meathods_Getter_And_Setter();
		WebDriverWait wait =new WebDriverWait(this.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(objectloactor)));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(objectloactor))));
		s1.setElement(driver.findElement(By.id(objectloactor)));
		//s1.setList(driver.findElements(By.id(objectloactor)));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

public  void findelementbyName(String objectloactor){
	try {
		Meathods_Getter_And_Setter s1 = new Meathods_Getter_And_Setter();
		WebDriverWait wait =new WebDriverWait(this.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name(objectloactor)));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(objectloactor))));
		s1.setElement(driver.findElement(By.id(objectloactor)));
		//s1.setList(driver.findElements(By.id(objectloactor)));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	

public  void findelementbyXpath(String objectloactor){
	try {
		Meathods_Getter_And_Setter s1 = new Meathods_Getter_And_Setter();
		WebDriverWait wait =new WebDriverWait(this.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(objectloactor)));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(objectloactor))));
		s1.setElement(driver.findElement(By.id(objectloactor)));
		//s1.setList(driver.findElements(By.id(objectloactor)));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
public void findelementsbyXpath(String objectloactor){
	try {
		Meathods_Getter_And_Setter s1 = new Meathods_Getter_And_Setter();
		WebDriverWait wait =new WebDriverWait(this.driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(objectloactor)));
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath(objectloactor))));
		
		s1.setList(driver.findElements(By.id(objectloactor)));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}

