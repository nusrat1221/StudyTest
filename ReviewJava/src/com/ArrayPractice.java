package com;

public class ArrayPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int i=20;
i = 10;
System.out.println(i);


//array variable 
to store similar data type values in array variables*/

		
		// one dimentional array  
			//advantage: store multiple values in a single variable, with similar data types
		
		// disadvantage:
			//1.size is fixed (static array)-- to over come this -- we use collection, arraylist, hashtable -use dynamic array 
			/*2. stores only similar data types -- to overcome this problem we use object array
				 
				
		*/
		
		
//1. integer array:
		//lowest bound or index is = 0
		// upper bound is n-1 (n is the size of array)
		

	int i[] =new int [4];
	i[0]=10;
	i[1]=20;
	i[2]=30;
	i[3]=40;
	
	System.out.println(i[2]);
	System.out.println(i[3]);
	//System.out.println(i[4]);//ArrayIndexOutOfBoundException
	
	System.out.println(i.length);//size or length of array
	
	//print all the values of array for loop 
    for (int j= 0;j< i.length; j++) {
	System.out.println(i[j]); 

}
    //2. double array 
    double d[]= new double [3];
    d[0]=12.33;
    d[1]=13.44;
    d[2]=45.55;
    
    System.out.println(d[2]+ d[1]);
    
    
    //3 char array 
    char c[]=new char [3];
    c[0]= 'a';
    c[1]='b';
    c[2]= '$';
    
    //4.boolean array
    boolean b[] = new boolean[2];
    b[0]=true;
    b[1]=false;
    
    //5.string array 
    String s[]= new String [3];
    s [0]= "test";
    s [1]= "hello";
    s [2]="world";
    
    
    System.out.println(s.length);
    System.out.println(s[0]+s[1]+s[2]);
    		
       		
    //6. object array: (superclass)== is used to store different data type values 
    Object ob[]= new Object [6];
    ob[0]="tom";
    ob[1]= 25;
    ob[2]= 12.33;
    ob[3]="1/1/1990";
    ob[4]="M";
    ob[5]="London";
    
    System.out.println(ob[5]);
    
    System.out.println(ob.length);
    
    for(int k=0; k < ob.length; k++) {
    	System.out.println(ob[k]);
    }
    
    		
    
	}

}
/*
class Practice2{
	int [] x= new int [5];
	
	
	public int[] copyArray(int [] y) {
		int [] x= new int [5];
		for (int i =0;i<x.length;i++) {
			x[i]=y[i];
		}
		return x;
	}
	public static  void main (String[] args) {
		copyArray(); 
		int x[]= {4,7,5,9,5}
		int[] ar= copyArray(x); 
		for (int z:ar) {
		system.out.println(z);
		
	}
}
*/
