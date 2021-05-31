package testpackage;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessbrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new HtmlUnitDriver();
		
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File file = ts.getScreenshotAs(OutputType.FILE);
		
	//	String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";

		FileUtils.copyFile(file, new File("C:\\Akshay"));
				
		driver.get("https://github.com/SeleniumHQ/htmlunit-driver/releases");
		
		driver.findElement(By.xpath("//a[@href='/SeleniumHQ/htmlunit-driver/issues']//span[@data-content='Issues']")).click();
		
		System.out.println("title of the page is : "+driver.getTitle());
		
	}

}
