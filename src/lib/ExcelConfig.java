package lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {
	//global variables
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	 public ExcelConfig(String path) {
		try {
			
			File f=new File(path);
			FileInputStream fs=new FileInputStream(f);
			wb=new XSSFWorkbook(fs);
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(int sheetNum,int row,int col) {
		sheet=wb.getSheetAt(sheetNum);
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}

}
