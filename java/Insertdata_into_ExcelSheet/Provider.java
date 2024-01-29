package Insertdata_into_ExcelSheet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Provider {
	
	@DataProvider
	@Test
	public Object[][] data()
	{
		Object[][] ss= {
				
				{"surya","roy@789"},
				{"kumar","raju@444"},
				{"mahi","maharaj@989"},
				{"student","Password123"},
				
				
		};
		return ss;
	}
	
		@Test(dataProvider = "data")
		public void Method(String username,String pws ) {
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(pws);
			driver.findElement(By.id("submit")).click();
			System.out.println(driver.findElement(By.xpath("//h1[@class=\"post-title\"]")).getText());
			
			
			
		}
		
		
		
		
		
	}

	