package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestEventList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver dr = new ChromeDriver();
		
		TestAccess eventcls = new TestAccess();
		
		EventFiringWebDriver evnt = new EventFiringWebDriver(dr);
		
		evnt.register(eventcls);
		
		evnt.get("https://google.com");
		
		evnt.unregister(eventcls);
		
		
		
	}

}
