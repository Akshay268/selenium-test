package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

public class CheckVacAvailaibilty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cowin.gov.in/home");		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				

		driver.findElement(By.xpath("//div[@data-checked='Search By District']")).click();

		driver.findElement(By.xpath("//mat-select[@class='mat-select ng-tns-c64-1 ng-tns-c62-0 mat-select-empty ng-untouched ng-pristine ng-invalid ng-star-inserted']")).click();
		
	//	WebElement selectStateDD = driver.findElement(By.xpath("//mat-select[@id='mat-select-40']"));
		
	//	WebElement seleectDistrictDD = driver.findElement(By.xpath("//mat-select[@id='mat-select-42']"));
		
		WebElement searchBtn = driver.findElement(By.xpath("//button[@class='pin-search-btn district-search']"));
		
		
	//	System.out.println("Is element displayed???? " + driver.findElement(By.xpath("//mat-select[@id='mat-select-40']")).isDisplayed());
		
		
		
//Select selectstatedd = new Select(driver.findElement(By.xpath("//mat-select[@id='mat-select-40']")));


//selectstatedd.selectByVisibleText("Bihar");

//Select selectdistrictdd = new Select(driver.findElement(By.xpath("//mat-select[@id='mat-select-42']")));

searchBtn.click();
		
		
	}

}
