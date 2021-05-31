package automationFramework;

public class Array_String {

	
	
//	int[] array = {21,12,32};
	

	
//	array_test[0] = 12;
	
	
	public static void test (int[] a ) {
		
		a[1] = 77;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "     Welocme to Learning";
		
		String ste_new = "null";
		
		char str1 = str.charAt(4);
		
		
	//	StringBuffer strbuffer = ste_new;
		
		String substr = str.substring(2);
		
		String substr1 = str.substring(2, 13);
		
		//String test1 = str.strip();
		
		String tolowercase = str.toLowerCase();
		
		String toUppercase = str.toUpperCase();
		
		String test3 = str.concat(" of the string methods in java");
		
	//	String test4 = str.repeat(2);
		
		String trimstr = str.trim();
		
		String test5 = str.join("-", str);
		
		String truetst = str.valueOf(5+4<=10);
		
		String falsetst = str.valueOf(5+4<=4);

		Boolean containstst = str.contains("Learning");

		Boolean containsfalse = str.contains("hey");

		Boolean endwith = str.endsWith("Learning");
		
		int indexval = str.indexOf("hey",0);
		
		int indexofvaltest = str.indexOf("welcome");

	//	System.out.println(ste_new.isBlank());
		
		System.out.println(ste_new.length());
		
		System.out.println(str1 + "\n");
		
		
		System.out.println(substr + " substr \n");
		
		System.out.println(substr1 + " substr with 2 parameter \n");
	//	System.out.println(test1 + " strip method \n");

		System.out.println(tolowercase + " tolowercase \n");
		System.out.println(toUppercase + " toUppercase \n");
		System.out.println(test3 + " concat \n");
	//	System.out.println(test4 + " repeat method  \n");
		System.out.println(trimstr + " trimstr \n");
		System.out.println(test5 + " join method \n");
		System.out.println(truetst + " value of true \n");
		System.out.println(falsetst + " value of false \n");
		System.out.println(containstst + " containstst true \n");
		System.out.println(containsfalse + " containsfalse \n");
		System.out.println(endwith + " endwith method \n");
		System.out.println(indexval + " indexval \n");
		System.out.println(indexofvaltest + " indexofvaltest \n");
	


		
		int[] array_test = new int[6];
		
		int[][] multi = new int[3][3];
		
		
		int[] array1 = {10,12,11,13};
		
	////	System.out.println(array1);
	
	//	System.out.println("before fn call" + array1[1]);

		
		test(array1);
		
	//	System.out.println("after fn call" + array1[1]);

		
	}

}
