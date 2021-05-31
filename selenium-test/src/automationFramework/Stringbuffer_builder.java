package automationFramework;

public class Stringbuffer_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuilder stringbuilder = new StringBuilder("Test value");
		
		System.out.println(stringbuilder);
		
		String test = "1234";
		
		stringbuilder.append("New test value");
		
		System.out.println("new value :\t " + stringbuilder);
		
		System.out.println(stringbuilder.reverse());

		int a = Integer.parseInt(test);
		
		System.out.println(a);
		
		
		
		
	}

}
