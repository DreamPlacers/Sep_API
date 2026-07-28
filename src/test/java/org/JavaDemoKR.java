package org;

public class JavaDemoKR {


	public static boolean isDuplicate (String a, String b) {  
		return a.equals(b);
		
	}

	public static boolean isDuplicateIgnoreCase(String c, String d) {
		return c.equalsIgnoreCase(d);
	}
	
	public static void main (String [] args) {
		
		System.out.println("Were the given String value duplicate? "+ isDuplicate("Name","Anme"));
		System.out.println("Were the given value is duplicate including its case ? "+ isDuplicateIgnoreCase("name","Name"));
	}
	
}
