package models;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Meathods_Getter_And_Setter {
 private static List<WebElement> list= new ArrayList<WebElement>();
 private static String objectlocator;
 private static WebElement element;
 private static String actions;
public static String getActions() {
	return actions;
}

public static void setActions(String actions) {
	Meathods_Getter_And_Setter.actions = actions;
}

List<WebElement> getList() {
	return list;
}

public  void setList(List<WebElement> list) {
	Meathods_Getter_And_Setter.list = list;
}

public  String getObjectlocator() {
	return objectlocator;
}


public void setObjectlocator(String objectlocator) {
	Meathods_Getter_And_Setter.objectlocator = objectlocator;
}

public WebElement getElement() {
	return element;
}

public void setElement(WebElement element) {
	Meathods_Getter_And_Setter.element = element;
}


}
