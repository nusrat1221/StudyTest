package com.returnPractice;

/*public class Practice {
*int a=10;
*public void abc() {
*	System.out.println("i am a void method");
	
}
/*
 * in order to return any data in a method;
 * last line of the method has B
 */
//return all data types 


import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	int a = 10;
	
	public void  abc() {
		System.out.println("I am a Void method");
	}
	
	/*
	 * in order to return any data in a method:
	 * last line of the method has to B the return keyWord 
	 * return value type N method return type has to be same 
	 * we can return only 1 value at a time 
	 * value can come from anywhere 
	 * return type method can be parameterized or not, doesn't matter
	 * we can return value, variable, method or object 
	 * returned method must a return type method as well 
	 * 
	 * to get any return value from any method:
	 * we have to assign that method to a variable 
	 * 
	 */
	public int getData() {
		int b = 2;
		int c = 100;
		System.out.println(b+c);
		
		return 10; // returned a value 
		//int e =1;
	}
	
	public int getData1() {
		
		return a; //returned a variable 
	}
	
	public int getData2() {
		
		return getData1(); //returned a method 
	}
	
	public ChromeDriver getBrowser() {
		//ChromeDriver dr = new ChromeDriver();
		
		return new ChromeDriver(); //returned an object 
	

	}
	
	
	
	}
	
	
	//create methods and return each of the data type 
	//and call them in another methods 
	
	
	
	
	
	
