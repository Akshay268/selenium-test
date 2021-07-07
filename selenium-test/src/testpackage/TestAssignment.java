import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAssignment {

	
	static WebDriver driver = new ChromeDriver();

	
	public static void addToCartAndCheckout() {
		
		//Adding to the cart 
		driver.findElement(By.xpath("//button[@name=\"Submit\"]")).click();
		
	 //Clicking on proceed to checkout
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		
		checkout.click();
	}
	
	public static void main(String[] args) {
	
		driver.get("http://automationpractice.com/index.php?id_product=2&controller=product");
		
		driver.manage().window().maximize();
		
		addToCartAndCheckout();
		
		//Clicking on icon to add another item
		driver.findElement(By.xpath("//td[@class=\"cart_product\"]/a/img")).click();
		
		//changing colour and adding another item
		driver.findElement(By.xpath("//a[@name=\"White\"]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//select[@id=\"group_1\"]"));
		
		Select select = new Select(ele);
		
		select.selectByValue("3");

		addToCartAndCheckout();

		driver.quit();

	}

}
