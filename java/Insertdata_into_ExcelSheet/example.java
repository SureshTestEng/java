package Insertdata_into_ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class example {

	@Test
	public void getdata () throws IOException {
		
		FileInputStream fi = new FileInputStream("C:\\Excel Sheet\\module.xlsx");
		
		 XSSFWorkbook wo=new XSSFWorkbook(fi);
		 XSSFSheet sh=wo.getSheet("module");
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

