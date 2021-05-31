package testpackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class OverlodTst {
	
	@Test(priority = 1)

  public void f() {
	  
	  System.out.println("super methid f method");
  }
	@Test(priority = 2)

  public void Test1() {
	  
	  System.out.println("first methid overloaded--- test1" );
  }
	@Test(priority = 3)

  public void _abc2() {
	  
	  System.out.println("first methid overloaded --- _abc" );
  }
  
}
