package actions;

import java.util.List;

import util.Excel_lib;

public class Excel_test {

	public static void main(String[] args) {
	
		Excel_lib.getworkbook("./target/master1.xlsx");
		Excel_lib.getsheet("Sheet1");
		
	    	
				List<String> l = Excel_lib.getcellvalues(1, Excel_lib.getcellcount(1));
			
		
		

	}

}
