package org.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		//List
				List variable = new ArrayList();


				//To add values to list - method : add()
				variable.add(100);			//0
				variable.add("Name");	    //1
				variable.add('@');			//2
				variable.add("Name");		//3


//				ArrayList<String> values = new ArrayList<String>();
//				values.add("Kavi Raj");
//				values.add("Shamili");


				//To find the size of the list - size()
				int size = variable.size();
				System.out.println("Size of the list is : "+size);


				//To get elements from list - get()
				System.out.println(variable.get(1));


				//To find the index - first occurring position - indexOf()
				int firstIndex = variable.indexOf("Name");
				System.out.println("First Index value is : "+firstIndex);


				//To find the last index - last occurring position - lastIndex()
				int lastIndex = variable.lastIndexOf("Name");
				System.out.println("Last Index value is : "+lastIndex);


				//To replace an element - set()
				variable.set(0, 1000);


				System.out.println(variable);


				//For comparison creating another list
				List<Integer> list1 = new LinkedList<Integer>();
				list1.add(20);
				list1.add(30);
				list1.add(1000);


				//Contains
				boolean contains = list1.contains(20);
				System.out.println("Contains : "+contains);


				//ContainsAll
				boolean containsAll = list1.containsAll(variable);
				System.out.println("Contains All : "+containsAll);




				//To remove uncommon values - retainAll()
				list1.retainAll(variable);
				System.out.println("Retain All "+list1);


				//To check two list are equal or not - equals()
				boolean equals = list1.equals(variable);
				System.out.println("list1 is equal to variable list : "+equals);


				//To copy one list to another - addAll()
				list1.addAll(variable);
				System.out.println(list1);


				//to print list values using loop
				for(int i=0;i<list1.size();i++) {
					System.out.println(list1.get(i));
				}


				System.out.println("------------------------------------------");


				//To remove value - remove()
				list1.remove(3);
				//print values after removing
				for(int i=0;i<list1.size();i++) {
					System.out.println(list1.get(i));
				}


				System.out.println("-----------------------------------------------");


				//To remove all values
				list1.removeAll(variable);
				for(int i=0;i<list1.size();i++) {
					System.out.println(list1.get(i));
				}


			}


	}


