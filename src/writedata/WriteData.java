package writedata;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("E:\\\\AutomationSelenium\\\\ApachePOI\\\\testdata.xlsx");
		FileInputStream fs=new FileInputStream(f);
		
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		sheet.getRow(0).createCell(2).setCellValue("pass");
		sheet.getRow(1).createCell(2).setCellValue("Fail");
		
		FileOutputStream fout=new FileOutputStream(f);
		wb.write(fout);
		wb.close();
	}

}
