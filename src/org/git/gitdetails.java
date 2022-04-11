package org.git;

import java.util.ArrayList;
import java.util.List;

public class gitdetails {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(10);
		li.add("JAVA");
		li.add(25550.520);
		li.add('m');
		System.out.println(li);
		int size = li.size();
		System.out.println(size);
		
		Object object = li.get(3);
		System.out.println(object);
		
	
		li.add(2," MASTER");
		System.out.println(li);
		
		li.remove(2);
		System.out.println(li);
		
		li.set(1, "JAVA");
		System.out.println(li);
		
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		 
		int lastIndexOf = li.lastIndexOf('m');
		System.out.println(lastIndexOf);
		
		boolean contains = li.contains("JAVA");
		System.out.println(contains);
		

}}
