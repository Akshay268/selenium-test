package automationFramework;

public class Second {

	
	
	public static String empn ;
	
	public static final int[] ABC= {10,20,25,30,35,40};
	protected double sal;
	
//	public Second( String emp1) {
//		
//		empn=emp1;
//	}
	
	protected void  setSal(double heysal) {
		
		 sal = heysal;
	}
	
	
	public static void stat_test() {
			
		System.out.println("static method ");
	}
	
	protected double getSalary() {
				
		System.out.println("and the sal is : " + sal);
		return sal;
	}
	
	public static void main(String[] args) {
		
		
		Second ob = new Second();

		ob.setSal(1234.34);
		//Second.a = 20;
		ob.getSalary();
ob.empn = "test";
stat_test();

ob.stat_test();

empn = "hello";
		System.out.println("employee name : " + ABC instanceof String);
		System.out.println("emp sal : " + ob.sal);
		
		
		for (int num : ABC) {
			
			System.out.println("here's the numb"+ num);
		}
		
		
		switch ( 10) {
		
		case 3:
			System.out.println("case 3");
		
		
		
		case 10:
		
			System.out.println("case 10");

		case 11:
			
			System.out.println("case 11");
			break;
			
		case 12:
			
			System.out.println("case 12");
		case 6:
			System.out.println("case 6");
		}
		
		
		
	}

}