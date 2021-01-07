package com;

public class ArrayPractices {
	
	
	
	// how to find highest number 
	//how to 
	
	public void getHighestNum() {
		int [] arrs = {2,3,4,5,6,7,7};
		int maxNum=arrs[0];
		for (int i=1;i<arrs.length;i++)
		{
			if (arrs[i]>maxNum) {
				maxNum=arrs[i];
			}
		}
		
	
	//how to find the second highest number
	int h=arrs[0];
	int sh=arrs[1];
	if (h<sh) {
		h=arrs[1];
		sh=arrs[0];
		
	}
	
		for (int j=2;j<arrs.length;j++) {
			if (arrs[j]>sh && arrs[j]<h) {
				sh=arrs[j];
				
			}else if (arrs[j]>h) {
				sh=h;
				h=arrs[j];
				
			}
		}
	//how to find the duplicate number 	
		
		for (int i=0;i<arrs.length;i++) {
			for (int j=i+1;j<arrs.length;j++) {
				if (arrs[i]==arrs[j]) {
					System.out.println(arrs[i]);
				}
					
			}
			
		}
		
	// how to find two number which equals to 500 if you add them 
		
//		int a	[]= {200,300,400,100,150};
//		for (int i=0;i<a.length;i++) {
//			for (int j=i+1;j<a.length;j++) {
//				if (a[i]+a[j]==500) {
//					System.out.println();
//				}
//			}
//		}
//		}
//		
		//highest mode number,
	int numm []= {1,2,3,3,3,4,5,6,7,8};
	int m= numm[0];
	int mm= numm[1];
	
	for (int i=0;i<numm.length;i++) {
		for (int j=i+1;j<numm.length;j++) {
		
		}
	}
		
		
		//find the sum of all odd number from an array
		
	//public static void main(String[] args){
	
	int b [] = {1,2,3,4,5,6,7,8,9};
	int sum = 0;
	for (int i=0;i<b.length;i++) {
		if (i%2!=0) {
			sum = sum+i;
			
			
			
		}
		
	}
	

	
	}
	}
//}


