package readdata;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//specify the file location
		File file=new File("E:\\AutomationSelenium\\ApachePOI\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		String data0=sheet.getRow(1).getCell(0).getStringCellValue();
		String data1=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data0+""+data1);
		wb.close();
	}

}
