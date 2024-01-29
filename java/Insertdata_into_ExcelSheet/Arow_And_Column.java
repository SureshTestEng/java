package Insertdata_into_ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Arow_And_Column {

	public static void main(String[] args) throws IOException {

	//	FileInputStream fi=new FileInputStream("‪C:\\Excel Sheet\\ExcelDataforLogin.xlsx");
		FileInputStream fi = new FileInputStream("‪C:\\Excel Sheet\\RegisterPage.xlsx");
		
		 XSSFWorkbook wo=new XSSFWorkbook(fi);
		 XSSFSheet sh=wo.getSheet("Loginpage");
		  int rowcount=  sh.getLastRowNum();
		  XSSFRow r;
		  for(int i=0;i<=rowcount;i++) {
			        r=sh.getRow(i);
		  int columncount=r.getLastCellNum();
		  
		  for (int j=0;j<columncount;j++) {
			  System.out.print(r.getCell(j).getStringCellValue()+"  ");
			
		}
			System.out.println();  
		  }
		
	}

}
