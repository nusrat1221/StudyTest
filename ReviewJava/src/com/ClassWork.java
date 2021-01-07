package com;

public class ClassWork {
	 public static void main (String[]args ) {
	/* from number 1 to 100	
	 * if number divisible by 3 print "hi"
	 * if number divisible by 5 print "hello" 
	 * if number divisible by 3 and 5 print "hi hello"
	 * otherwise print number  
	 */
		for (int i= 1; i<100; i++) {
			if (i%3==0) {
				System.out.println("hi");
			} else if (i%5==0) {
				System.out.println("Hello");
			}
			else if (i%3==0&&i%5==0){
				System.out.println("HiHello");
			}else {
				System.out.println(i);
			}
			
				
			}
		System.out.println("********************************");
	 // find the prime numbers from 1 to 100
	 for (int n=1; n<100; n++) {
		 
		  int limit = 100;

          //System.out.println("Prime numbers between 1 and " + limit);

          //loop through the numbers one by one
          for(int i=1; i < 100; i++){

                  boolean isPrime = true;

                  //check to see if the number is prime
                  for(int j=2; j < i ; j++){

                          if(i % j == 0){
                                  isPrime = false;
                                  break;
                          }
                  }
                  // print the number
                  if(isPrime)
                          System.out.print(i + " ");
          }
		 
	 }
		System.out.println("********************************");
	 for (int s=1; s<100; s++) {
		
	 }
	 // find factorial value of 5
	 
		 
	 }
	 
	 // swap 2 numbers lets say a=10, b=7 result will be a=7 and b=10
}

		
