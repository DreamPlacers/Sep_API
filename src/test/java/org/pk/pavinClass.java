package org.pk;

public class pavinClass {
	public static void main(String[]args) {
		
		int n=7;
		int count =0;
		
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				count=1;
			}
		}
		if (count==0) {
			System.out.println("its a prime number");
		}else {
			System.out.println("its NOt prime number");
		}	
		
		
		
		
		
		
		//check for elegible for vote//
		int age = 20;
		if(age >=18) {
			System.out.println("Elegible for vote");
		} else {
			System.out.println("Not Elegible for vote");
		}	
		
		
		
		
		
	}
	

	

}

