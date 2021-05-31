package automationFramework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str = "test string for testing regex in q42021";
//		
//		String pattern = "(.*)(\\d+)(.*)";
//		
//        String text = "geeks1for2geeks3";        
//		
//		Pattern test = Pattern.compile(pattern);
//		
//		test.matches(pattern, str);
//		
//		Matcher m = test.matcher(str);
//		
//				
//		System.out.println(m.groupCount());
//		
//	//	System.out.println(m.end());
//	//	System.out.println(m.group(2));
//		
//		//System.out.println(m.group(1));
//		
//	//	System.out.println(m.group("test"));
//		
//		
//	     if (m.find( )) {
//	    	 
//	         System.out.println("Found value: " + m.group(0) );
//	         System.out.println("Found value: " + m.group(1) );
//	         System.out.println("Found value: " + m.group(2) );
//	      }else {
//	          System.out.println("NO MATCH");
//
//	}

		 String text = "geeks1-for2-geeks3";
		  
	        // Specifies the string pattern which is to be searched
	        String delimiter =  "\\-";
	        Pattern pattern = Pattern.compile(delimiter,
	                                        Pattern.CASE_INSENSITIVE);
	  
	        // Used to perform case insensitive search of the string
	        String[] result = pattern.split(text);
	  
	  
	        for (String temp: result)
	            System.out.println(temp);
		
		
}

}