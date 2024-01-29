package Insertdata_into_ExcelSheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Modify {

	public static void main(String[] args) throws IOException {
		
		    XSSFWorkbook wo=new XSSFWorkbook();
		    XSSFSheet sh=wo.createSheet("module");
		    XSSFRow    r=sh.createRow(0);
		               r.createCell(0).setCellValue("Name");
		               r.createCell(1).setCellValue("mail");
		               r.createCell(2).setCellValue("password");
		               
		       XSSFRow r1=sh.createRow(1);
		               r1.createCell(0).setCellValue("Raghva");
		               r1.createCell(1).setCellValue("kumar@567");
		               r1.createCell(2).setCellValue("rkumar99");
		               
		       XSSFRow r2=sh.createRow(2);
		               r2.createCell(0).setCellValue("sunil");
		               r2.createCell(1).setCellValue("yadav@123");
		               r2.createCell(2).setCellValue("ysunil32");
		               
		   FileOutputStream fs=new FileOutputStream("C:\\Excel Sheet\\module.xlsx");
		               wo.write(fs);
		
		
		
		
		//Get particular value in column

  /*      FileInputStream fs=new FileInputStream("C:\\Excel Sheet\\ExcelDataforLogin.xlsx");
		  XSSFWorkbook wo=new XSSFWorkbook(fs);
		  XSSFSheet sh=wo.getSheet("Loginpage");
		  XSSFRow r=sh.getRow(1);		
		    System.out.println(r.getCell(1).getStringCellValue());
		*/
		
		//Modify the name
		
	/*   FileInputStream fs=new FileInputStream("C:\\Excel Sheet\\ExcelDataforLogin.xlsx");
		XSSFWorkbook wo=new XSSFWorkbook(fs);
		XSSFSheet sh=wo.getSheet("Loginpage");
		XSSFRow r=sh.getRow(1);
		XSSFCell c=r.getCell(1);
		c.setCellValue("suya@546");
	FileOutputStream fo=new FileOutputStream("C:\\Excel Sheet\\ExcelDataforLogin.xlsx");
	  wo.write(fo);
		*/
		
	}

}
