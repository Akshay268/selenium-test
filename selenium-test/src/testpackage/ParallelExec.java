package testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExec {
	
	NewTest ob = new NewTest();

	
	@Test
	
	public void sample1() {
		
		System.out.println("sample 1 overloaded methid ");
	}
	
	@Test
	public void setUp()
	{      
		
		
		ob.sample1();
		sample1();
		
                // This will write the log in HTML and on console as well 
		Reporter.log("Test1 is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
	}
	
	@Test
	public void loginApplication()
	{
		Reporter.log("Test2 is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
	}
	
	@Test
	public void logoutApplication()
	{
	 		Reporter.log("Test3 is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
	}

}
