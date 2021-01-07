package com;

import java.util.HashMap;
import java.util.Map;



public class StringExcercise {

	
/*
 * 1.reverse a string by word--> how are you to--> you are how
 * is string polindrom--> mom ---> mom
 * find the duplicate character
 * count the character from a string ---> 1. h 2.e 3.l 4.l. 5.o
 * reverse a string by character ---> how are you ---> woh era uoy
 */
	
	void reverse () {
		String s = "how are you";
		String[] s1 =s.split(" ");
		for (int i = s1.length-1; i>=0;i--) {
			System.out.print(s1[i]);
			
		}
		
		// another way of doing this:
		//1.
//		String s = "how are you";
//		String[] s1 =s.split(" ");
//		StringBuffer st =new StringBuffer();
//		
//		for (int i = s1.length-1; i>=0;i--) {
//			st.append(s1[i]).append(" ");
//			
//			
//	}
//		System.out.println(st.toString().trim());
		
	}
	void polindrom() {
		String word = "mom";
		StringBuffer reverseWord = new StringBuffer();
		if (word.equals("  ")) {
			System.out.println("  " + "is not a word");
		}
		else {
			for(int i=word.length()-1;i>=0;i--) {
				reverseWord.append(word.charAt(i));
				
			}
		}
		if (word.equals(reverseWord.toString())) {
			System.out.println("is polindrom");
		}
		
		
		
	}
	void duplicate() {
		String s = "momma";
		for (int i=0;i<s.length();i++) {
			for (int j=i+1;j<s.length();j++) {
				if (i==j) {
					System.out.println(i);
				}
	}
			}
		}
		
	void characterCount() {
		String s = "united states of america";
		char c[]=s.toCharArray();
		//map stores keys and values
		Map<Character, Integer> h = new HashMap<Character, Integer> ();
		for (int i =0;i<c.length;i++) {
			if (h.containsKey(c[i]))
			{
				h.put(c[i], h.get(c[i]+1));
			}else
				h.put(c[i], 1);
				
		}
		
		
	}
	void reverseChar() {
		
	}
	
}
