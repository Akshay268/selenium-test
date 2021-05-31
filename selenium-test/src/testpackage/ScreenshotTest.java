package testpackage;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.utils.FileUtil;

public class ScreenshotTest {
  @Test
  public void screenshot() {
	  
	  
WebDriver driver = new ChromeDriver();	  

driver.get("https://google.com");

driver.manage().window().maximize();




File drc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

try {
	org.apache.commons.io.FileUtils.copyFile(drc, new File("C:\\Akshay\\screenshot.png"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	
	System.out.println(e.getMessage());
}



  }
}
