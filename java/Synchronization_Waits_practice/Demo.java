package Synchronization_Waits_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.partialLinkText("Example 2")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		Thread.sleep(5000);
WebElement data=driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
      System.out.println(data.getText());
		
		
	}

}
