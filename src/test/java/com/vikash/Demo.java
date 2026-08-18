package com.vikash;

public class Demo {

	public static void main(String[] args) {
		String a = "vikash";
		String b = "";
		
		for(int i = a.length()-1;i>=0;i--) {
			char ch = a.charAt(i);
			b = b+ch;
		}
		System.out.println(b);
		if(b.equals(a)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	
	}
}
