package com.bridgelabz.java8features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachLoopDemo {
	public static void main(String []args)
	{
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Orange");
		
		 fruits.forEach(str->System.out.println(str));

		Map<Integer, String> hmap = new HashMap<Integer, String>();
	      hmap.put(1, "Monkey");
	      hmap.put(2, "Dog"); 
	      hmap.put(3, "Cat");  
	      hmap.put(4, "Lion");   
	      hmap.put(5, "Tiger");   
	      hmap.put(6, "Bear");
	      
	      hmap.forEach((key,value)-> {
	    	  if(key == 3)
	    		  System.out.println("Value is:-"+value);
	      });
	}

}

/*
 
 What:- 1)Java 8 provides a new feature called foreach Loop.
 		2)foreach loop work as an internal loop for collections
 		3)foreach loop is defined in iterable interface
 		4)Collection classes which extends iterable interface can use foreach method to iterate
 		5)A method takes a single argument as a functional interface, so that we can use lambda expressions  
*/