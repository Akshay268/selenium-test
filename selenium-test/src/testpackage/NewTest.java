package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {

//	  @Test
//
//	public void firstMethodTestNG() {
//	
//	WebDriver driver = new ChromeDriver();
//
//	driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
//
//	driver.manage().window().maximize();
//	
//	WebElement mcheckbox = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
//			
//			if ( mcheckbox.isDisplayed() && mcheckbox.isEnabled() ) {
//	
//	mcheckbox.click();
//	}
//	
//	if ( mcheckbox.isSelected()) { 
//	
//	driver.findElement(By.id("buttoncheck")).click();
//	
//	System.out.println("Page title is : " + driver.getTitle());
//	}
//	
//	
//	Assert.assertEquals("Radio button 'Male' checked", driver.findElement(By.xpath("//p[@class='radiobutton']")).getText());
//	driver.quit();
//	
//}
	  
	  @Test(groups = "g1")
	  public void sample1() {
		  
		  WebDriver dr = new ChromeDriver();
		  
		  
		  
		  dr.get("https://google.com");
		  System.out.println("sample test execution first one ");
		  
	  }
	  
	  @Test(groups = "g1")
	  public void sample2() {
		  
		  System.out.println("sample test execution second one ");
	  }
	  
	  @Test(groups = "g2")
	  public void sample3() {
		  
		  System.out.println("sample test execution third one ");
		  
	  }
	  
}
