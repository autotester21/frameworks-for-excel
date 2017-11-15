package util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_lib {
public static Map<String, Workbook> wbmap= new HashMap<String, Workbook>();
public static Workbook wb=null;
public static Sheet sheet=null;
public static Row row=null;

/****** This is to create an object of workbook)************/

public static Workbook getworkbook(String path){
		if(wbmap.containsKey(path)){
		 wb=wbmap.get(path);
		
		}
		else
		{
			File file= new File(path);
			try {
				wb=WorkbookFactory.create(file);
				wbmap.put(path, wb);
				
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return wb;
		
	}
	
/*****************To return sheet******************/
public static Sheet getsheet(String Sheetname){
	sheet=wb.getSheet(Sheetname);
	
	return sheet;
	
}


/***********************To get last Row count**************************/
public static int getRowcount(){
int	rowcount=sheet.getLastRowNum();
	return rowcount;
	
}

/***********************To get last cell count**************************/
public static int getcellcount(int rowcount){
int	cellcount=sheet.getRow(rowcount).getLastCellNum();
	
	return cellcount;
	
}

/***************************To get no of sheets and sheet name in the excel ******************************************/
public static List<String> getsheetcount(String path){
	List<String> listOfSheets = new ArrayList<String>();
	getworkbook(path);
	int sheetscount=wb.getNumberOfSheets();
	for (int i = 0; i < wb.getNumberOfSheets(); i++) {
		listOfSheets.add(wb.getSheetName(i));
	}
	return listOfSheets;
	
	
}

/******************************To get cell values of a row*******************************************/
public static List<String> getcellvalues(int rowmnumber, int lastcellnumber)
{
	ArrayList<String> cellstringvalue=new ArrayList<String>();
	for (int i = 0; i < lastcellnumber ; i++) {
		try{
           cellstringvalue.add(sheet.getRow(rowmnumber).getCell(i).getStringCellValue());
		}
		catch(Exception e){
			System.out.println("exc");
		}
	}

	return cellstringvalue;
	
}

/******************************                         *****************************************/
}
