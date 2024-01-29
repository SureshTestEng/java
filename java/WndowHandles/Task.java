package WndowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		Set ids=driver.getWindowHandles();
		Iterator id=ids.iterator();
		String window1=id.next().toString();
		String window2=id.next().toString();
		driver.switchTo().window(window2);
		driver.switchTo().window(window1);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.findElement(By.linkText("Elemental Selenium")).click();
		Set ss=driver.getWindowHandles();
		Iterator id1=ss.iterator();
		String parent1=id1.next().toString();
		String child2=id1.next().toString();
		String child3=id1.next().toString();
		driver.switchTo().window(child2);
		driver.switchTo().window(window1);
		driver.switchTo().window(child3);
		
			//Thread.sleep(2000);
	   System.out.println(driver.findElement(By.xpath("//div[@class='home-wrapper']//h1[1]")).getText());
	
		
		
	}

}
