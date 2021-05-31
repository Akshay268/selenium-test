package automationFramework;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Third extends Second {

	

	public void t1() { 
	System.out.println(" Inside the third class");

}
	
	
	public void  setSal(double heysal) {
		
		 sal = heysal;
		 System.out.println("inside the third class---- hurrya ");
	}
	
	
	public double getSalary() {
		
		System.out.println("and the sal is : " + sal);
		return sal;
	}
	
	public static void main(String[] args) {
		
		Third obj = new Third();
		
		Date date = new Date();
		
		obj.setSal(98);
		obj.getSalary();
		
		int a = 10;
		double d = 100.50;
		double f = 12.51;
		
		
		System.out.println("floor");
		System.out.println(Math.rint(d));

		System.out.println(Math.min(f,11));

		System.out.println("ceil");
		System.out.println(Math.min(100.51,100.51));

		System.out.println(date.toString());
		
		
		GregorianCalendar gcal = new GregorianCalendar();
		
		System.out.println(gcal.get(Calendar.DATE));
		System.out.println(gcal.get(Calendar.MONTH));

		System.out.println(gcal.get(Calendar.YEAR));
		System.out.println(gcal.get(Calendar.HOUR));

		System.out.println(gcal.get(Calendar.MINUTE));

		System.out.println(gcal.get(Calendar.SECOND));


		
	}
	
}
