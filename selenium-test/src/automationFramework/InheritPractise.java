package automationFramework;

public class InheritPractise extends InheritedClass{

	
	
	public void sup1() {
		
		System.out.println("inside the sub class");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InheritPractise ob = new InheritPractise();
		
		InheritedClass ob1 = new InheritPractise();
		
//		ob.test();
		
		ob.sup1();
		
		ob1.sup1();

	}

}
