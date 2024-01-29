package Asseration.TestngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public  class AsseratinsExampel {
	
	@Test
	public  void login() {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	    WebElement ss=driver.findElement(By.id("Email"));
		ss.clear();
		ss.sendKeys(" admin@yourstore.com");
		
	    WebElement pws=driver.findElement(By.id("Password"));
		pws.clear();
		pws.sendKeys("admin");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String expactedvalue="Dashboard";
		String actualvalue=driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
	//	Assert.assertEquals(expactedvalue,actualvalue );
		Assert.assertTrue(expactedvalue.equals(actualvalue));
		
		
//		SoftAssert s=new SoftAssert();
//		s.assertEquals(expactedvalue, actualvalue);
//		
//		System.out.println("hii");
//		System.out.println("surya");
//		s.assertAll();

	}
}
