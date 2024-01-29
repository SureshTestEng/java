package Insertdata_into_ExcelSheet;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wo=new XSSFWorkbook();
		XSSFSheet sh=wo.createSheet("Loginpage");
		XSSFRow r=sh.createRow(0);
		        r.createCell(0).setCellValue("Kumar");
		        r.createCell(1).setCellValue("Kumar@123");
		        
	    XSSFRow r1=sh.createRow(1);
	            r1.createCell(0).setCellValue("Surya");
	            r1.createCell(1).setCellValue("Surya@123");
	            
	    XSSFRow r2=sh.createRow(2);
	            r2.createCell(0).setCellValue("Suresh");
	            r2.createCell(1).setCellValue("Suresh@123");
	            
	            XSSFRow r3=sh.createRow(3);
	            r3.createCell(0).setCellValue("Sudresh");
	            r3.createCell(1).setCellValue("Surdesh@123");
	            
	   FileOutputStream fos=new FileOutputStream("C:\\Excel Sheet\\ExcelDataforLogin123.xlsx");
	         wo.write(fos);
		
	}

}