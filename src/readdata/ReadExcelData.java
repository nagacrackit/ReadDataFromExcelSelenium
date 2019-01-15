package readdata;

import lib.ExcelConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ExcelConfig obj=new ExcelConfig("E:\\AutomationSelenium\\ApachePOI\\testdata.xlsx");
		System.out.println(obj.getData(0, 0, 1));
		System.out.println(obj.getData(1, 0, 0));
	}

}
