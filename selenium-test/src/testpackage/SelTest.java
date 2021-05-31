
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.events.internal.EventFiringKeyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class SelTest {

	
//	@FindBy(how=How.XPATH,using="//input[@value='Male' and @name='optradio']")
//	WebElement mcheckbox;

	@Test
	public void firstAutoTest() throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriverEventListener tets;
		
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://demo.guru99.com/test/basic_auth.php");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
//WebDriverWait wait = new WebDriverWait(driver, 20);

//Alert alert = driver.switchTo().alert();		

//alert.accept();

//Runtime.getRuntime().exec("C:\\Akshay\\test-automation\\testproxy.exe");
//driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

//Actions act = new Actions(driver);

//act.contextClick().perform();

//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-5760-particle\"]/nav/ul/li[2]/div/span[1]/span")));

//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-5760-particle\"]/nav/ul/li[2]/ul/li/div/div[2]/ul/li[3]/a/span/span")));

//act.click().build().perform();


//				if ( mcheckbox.isDisplayed() && mcheckbox.isEnabled() ) {
//		
//					mcheckbox.click();
//		}
//		
//		if ( mcheckbox.isSelected()) { 
//		
//		driver.findElement(By.id("buttoncheck")).click();
//		
//		System.out.println("Page title is : " + driver.getTitle());
//		}
//		
		

		driver.quit();
		
	}

}
