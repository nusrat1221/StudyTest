package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoopPrac {

	public static void main(String[] args){
	//while 
//	WebDriver dr;
//	
//	public void m4() {
//		while(dr.findElement(By.id("").isEnabled()){
//			dr.findElement(By.id)
//		}
	int a = 1;
	while(a>0&&a<20) {
		System.out.println(a+"while loop is done");
		a++;
	}
		
	System.out.println("***************");
	//do while loop 
	
	int b = 1;
	do {
		System.out.println(b+2);
	}while (a<2);
		
	// for loop 
	// has to be in one line{
		for (int i=0;i<10;i+=2) {
			System.out.println(i);
		} 
	System.out.println("***************");
	// for enhanced loop(used in arrays), for each loop ( only increment, doesnt need initialization, something where theres more then one value ) 
	//single dimention array
	int k []= {1,2,3,4,5,6,7,8,9,90};
	
	for(int d : k) {
		System.out.println(d);
		}
	System.out.println("*******2-dARRAY********");
	// two dimentional array 
	int l [][]= {{1,2,3,4,5}, {6,7,8,9,}};
	for (int m[]:l) {
		for (int n:m) {
		System.out.print(n);
	}
		System.out.println();
	}
	System.out.println("***************");
// nested loop ( one loop inside another loop)
//	( option  inside an option ) (menus and submenus)
//row and column 
//  --> once u will go to nested loop, 
//	you cannot come out from this loop until condition is false
// nested loop contains one or more loops inside another loop-->
	// each time the out loop is executed, the inner loop is also executed 
	// name of out loop variable is different then name of inner loop variable 
	// 10 multiplication table  
	for (int i=1; i<=10; i++) {
		for (int j=1; j<=10; j++ )
			System.out.print((i *  j)+" ");
		System.out.println();
	}
	
	}
} 
