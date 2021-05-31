package automationFramework;

public class VirtualDemo {
	
	
	int a;
	int b;
	
	public void setval(int a,int b) {
		
		
		System.out.println("before setting A value is : " +a );
		System.out.println("before setting B value is : " +b);
		
		this.a=a;
		this.b=b;
		
		System.out.println(this.a);
		
		System.out.println("after setting A value is : " +a );
		System.out.println("after setting B value is : " +b);
		
	}
	
	public void showval() {
		
		System.out.println("A value is : " +a );
		System.out.println("B value is : " +b);
	}

	   public static void main(String [] args) {
	      
		   VirtualDemo ob = new VirtualDemo();
		   
		   VirtualDemo ob1 = new VirtualDemo();

		   ob.setval(2, 3);
		   
		   
		   ob.showval();
		   
		   ob1.setval(7, 8);
		   
		   
		   ob1.showval();
		   
		   ob.showval();
	   }
	}
