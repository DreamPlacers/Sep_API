package io.swagger;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class TEsting {
	public static void main(String[] args) {
		List <Integer> b =new Vector<Integer>();
		
		b.add(20);
		b.add(40);
		b.add(60);
		b.add(80);
		b.add(100);
		b.add(120);
		b.add(140);
		System.out.println(b);
	
		ListIterator <Integer> ele=b.listIterator();
		
		while (ele.hasNext()) {

		Integer i=	ele.next();
			
		System.out.println(i);
		
		
		
		}
	while (ele.hasPrevious()) {
		
		Integer pre=ele.previous();
	    System.out.println(pre);
	  if(pre==80) {
		  
		ele.remove();
		
	  }
		/* System.out.println(b); */
	
	}
	
	System.out.println(b);
	}

}
