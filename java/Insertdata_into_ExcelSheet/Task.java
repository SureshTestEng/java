package Insertdata_into_ExcelSheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {

	public static void main(String[] args) throws IOException {

	/*	XSSFWorkbook wo=new XSSFWorkbook();
		XSSFSheet sh=wo.createSheet("Registre");
		XSSFRow r=sh.createRow(0);
		        r.createCell(0).setCellValue("Raju");
		        r.createCell(1).setCellValue("Raju@54321");
		        r.createCell(2).setCellValue("9676543246");
		
		XSSFRow r1=sh.createRow(1);
		        r1.createCell(0).setCellValue("Lokesh");
		        r1.createCell(1).setCellValue("Loki@987");
		        r1.createCell(2).setCellValue("9848763287");
		        
		XSSFRow r3=sh.createRow(2);
		        r3.createCell(0).setCellValue("Mahendra");
		        r3.createCell(1).setCellValue("Mahi@987");
		        r3.createCell(2).setCellValue("7645261708");
		        
       FileOutputStream fos=new FileOutputStream("C:\\Excel Sheet\\Register.xlsx");
       	        	wo.write(fos);
		*/        
		 
		
		
		XSSFWorkbook wo=new XSSFWorkbook();
		XSSFSheet sh=wo.createSheet("Register");
		XSSFRow r=sh.createRow(0);
		        r.createCell(0).setCellValue("First Name");
		        r.createCell(1).setCellValue("Last Name");
		        r.createCell(2).setCellValue("DOB");
		        r.createCell(3).setCellValue("Mobile Number");
		        r.createCell(4).setCellValue("Gmail Name");
		        
	    XSSFRow r1=sh.createRow(1);
	            r1.createCell(0).setCellValue("Mahendra");
	            r1.createCell(1).setCellValue("Singh");
	            r1.createCell(2).setCellValue("07-05-1993");
	            r1.createCell(3).setCellValue("9848780632");
	            r1.createCell(4).setCellValue("mahi@567");
	            
	    XSSFRow r2=sh.createRow(2);
	            r2.createCell(0).setCellValue("Mahesh");
	            r2.createCell(1).setCellValue("yadav");
	            r2.createCell(2).setCellValue("05-12-2000");
	            r2.createCell(3).setCellValue("7667548907");
	            r2.createCell(4).setCellValue("mahesh@079");
	            
	    XSSFRow r3=sh.createRow(3);
	            r3.createCell(0).setCellValue("Madhan");
	            r3.createCell(1).setCellValue("royal");
	            r3.createCell(2).setCellValue("23-03-1999");
	            r3.createCell(3).setCellValue("9876453954");
	            r3.createCell(4).setCellValue("madhan@5664");
	    
	     FileOutputStream ss=new FileOutputStream("C:\\Excel Sheet\\RegisterPage.xlsx");     
		                 wo.write(ss);
		
		
	
	}

}
