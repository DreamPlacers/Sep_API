package io.swagger;

import java.util.Enumeration;
import java.util.Hashtable;

public class Testing123 {
	public static void main(String[] args) {
		//Hashtable
		
		Hashtable<Integer,Integer> b=new Hashtable<Integer,Integer>();
		b.put(10,23);
		b.put(50,45);
		b.put(90,67);
		b.put(20,22);
		b.put(44,12);
		b.put(34,90);
		
		//get Enumeration object
		Enumeration<Integer> v=b.elements();
		
		//Iterate all values one by one
		while (v.hasMoreElements()) {
			Integer nextElement= v.nextElement();
			System.out.println(nextElement);
			
			
		}
		
		
		
		
		
		
	}




}
