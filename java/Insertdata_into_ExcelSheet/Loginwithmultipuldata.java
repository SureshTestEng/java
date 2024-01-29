package Insertdata_into_ExcelSheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginwithmultipuldata {
	
	@Test
	public void hrm() throws IOException {
		
		
		   XSSFWorkbook wo=new XSSFWorkbook();
		   XSSFSheet sh=wo.createSheet("loginpage");
		   XSSFRow r=sh.createRow(0);
		           r.createCell(0).setCellValue("user name");
		           r.createCell(1).setCellValue("password");
		           
		   XSSFRow r1=sh.createRow(1);
		           r1.createCell(0).setCellValue("surya");
		           r1.createCell(1).setCellValue("surya@123");
		           
		   XSSFRow r2=sh.createRow(2);
		           r2.createCell(0).setCellValue("vasu");
		           r2.createCell(1).setCellValue("vasu@000");
		           
		   XSSFRow r3=sh.createRow(3);
		           r3.createCell(0).setCellValue("Admin");
		           r3.createCell(1).setCellValue("admin123");
		   FileOutputStream fo=new FileOutputStream("C:\\Excel Sheet\\login.xlsx");
		   wo.write(fo);
		   
		   
	}
	
	
	
	
	@Test
	public void name() throws IOException, InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		FileInputStream fi=new FileInputStream("C:\\Excel Sheet\\login.xlsx");
		XSSFWorkbook wo=new XSSFWorkbook(fi);
		XSSFSheet sh=wo.getSheet("loginpage");
		int rowcount  =sh.getLastRowNum();
		XSSFRow r;
		for(int i=0;i<=rowcount;i++) {
			r=sh.getRow(i);
			
			driver.findElement(By.name("username")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(5000);
			
		}
		
		
	}
	

}
