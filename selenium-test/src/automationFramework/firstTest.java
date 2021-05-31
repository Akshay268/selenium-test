package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTest extends Third{
	
	int Age;
	static float tst;
	enum size{small,med,large} 
//	size testsize;
	
	WebDriver driver = new ChromeDriver();


	public void setA (int age) {
		Age = age;
	}
	
	
	public int getAb() {
		
		return Age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	System.setProperty("webdriver.chrome.driver", "");
	
		//webdriverma
		//WebDriver driver = new ChromeDriver();
		
		
		//driver.get("https://google.com");
		
		int local;
		
		local=10;
		local=15;
		firstTest obj = new firstTest();
		Object obj1 = new firstTest();
		
		obj.setA(78);
		
		System.out.println("get the age yeah + " + obj.getAb());
		System.out.println("This is the default val :\" " + tst);
		System.out.println("driver val : " + obj.driver);
		
System.out.println("enum value " +size.med);
		

		
	}

}
 