package Asseration.TestngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Work {
	ChromeDriver driver;
     
	@BeforeMethod
	public void line() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://practicetestautomation.com/practice-test-login/");
		
	}
   @Test
   
   public void Test_1() {
	   
	   driver.findElement(By.id("username")).sendKeys("student");
	   driver.findElement(By.id("password")).sendKeys("Password123");
	   driver.findElement(By.id("submit")).click();
	   
	   String expactedvalue="Logged In Successfully";
	   String actualvalue=driver.findElement(By.xpath("//h1[@class=\"post-title\"]")).getText();
	   Assert.assertEquals(expactedvalue, actualvalue);
	   
	   
   }
   
	@Test
	
	public void Test_2() {
		
		 driver.findElement(By.id("username")).sendKeys("student");
		   driver.findElement(By.id("password")).sendKeys("surya");
		   driver.findElement(By.id("submit")).click();
		   
		   String expactedvalue="Logged In Successfully";
		   String actualvalue=driver.findElement(By.xpath("//h1[@class=\"post-title\"]")).getText();
		   Assert.assertTrue(expactedvalue.equals(actualvalue));
		   
		
	}
	
	
	  @Test
	  
	  public void Test_3() {
		     ChromeDriver driver=new ChromeDriver();
		     driver.get("https://practicetestautomation.com/practice-test-login/");
		     driver.manage().window().maximize();
		     driver.findElement(By.id("username")).sendKeys("Surya");
		     driver.findElement(By.id("password")).sendKeys("Password123");
		     driver.findElement(By.id("submit")).click();
		     
		     String expactedvalue="Logged In Successfully";
			// String actualvalue=driver.findElement(By.xpath("//h1[@class=\"post-title\"]")).getText();
		  
		     String actualvalue = driver.findElement(By.id("error")).getText();
		 //     SoftAssert s=new SoftAssert();
		   //   System.out.println("surya");
		     // s.assertAll();
		  
			 SoftAssert sn = new SoftAssert();
			 sn.assertEquals(expactedvalue, actualvalue);
			 
			 System.out.println("hey hii");
			 System.out.println("hello");
			 sn.assertAll();
			 
		  
	  }
	
	

} 
