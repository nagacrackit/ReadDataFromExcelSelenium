package readdata;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File f=new File("E:\\AutomationSelenium\\ApachePOI\\testdata.xlsx");
		
		FileInputStream fs=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheetAt(0);
		int count=sheet.getLastRowNum();
		for(int i=0;i<count;i++) {
			String data=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		}
		
		wb.close();
	}

}
