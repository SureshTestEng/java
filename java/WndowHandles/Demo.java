package WndowHandles;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		Set ids=driver.getWindowHandles();
		java.util.Iterator id=ids.iterator();
		String window1=id.next().toString();
		String window2=id.next().toString();
		driver.switchTo().window(window2);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		
		
	}

}
