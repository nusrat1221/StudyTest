package classnote;

//092619
	//array is a placeholder who can hold more than one value fixed type and fixed size 
	
//when 
/*	int  a[]=new int[3];
	a[0]=5;
	a[1]=25;
	a[2]=57;
	
	String s[]=new String[3];
	a[0]="5";
	a[1]="hi";
	a[2]="Hello";
	
	Object o[]=new Object[3];
	a[0]=5;
	a[1]="25";
	a[2]=57;
	int b[]= {5,7,8,9}; */
//ArrayPractice a2[]=new ArrayPractice[3];

	
	

	import java.util.Arrays;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;

	public class ArrayPractice {
		
//		//Array is a placeholder who can hold more than one value fixed type and fixed size
//		int a1[]=new int[3];
//		a1[0]=6;
//		a1[1]=56;
//		a1[2]=57;
//		a[3]=8;
//		String a1[]=new String[3];
//		a[0]="6";
//		a[1]="hi";
//		a[2]="helloo";
	//	
//		Object a2[]=new Object[3];
//		a[0]=6;
//		a[1]="56";
//		a[2]=57;
//		int b[]= {5,7,8,5};
	//	
//		//ArrayPractice a2[]=new ArrayPractice[3];
		
		public int[] copyAnArray(int [] x) {
			int y[]=new int[x.length];
			
			for(int i=0;i<x.length;i++)
			{
				y[i]=x[i];
			}
			return y;
			
		}
		
		WebDriver driver;
		
		public String[] copyValueFromMenu(List<WebElement> elements) {
			String y[]=new String[elements.size()];
			
			for(int i=0;i<y.length;i++)
			{
				y[i]=elements.get(i).getText();
			}
			return y;
			
		}
		
		public void printArray(int a[]) {
			//int a[]= {5,87,56,3,56};
			
			Arrays.sort(a);
			
			
			for(int i=a.length-1;i>=0;i--)
			{
				System.out.println(a[i]);
			}
			
		}
		
		
		public void getMaxNum(int a[]) {
			int max=a[0];
			for(int i=0;i<a.length;i++)
			{
				for (int j=i+1; j<a.length; j++)
				{
				if(a[i]==a[j]) {
					System.out.println("duplicate has been found");
				}
				else
					System.out.println("No Duplication");
				}
			}
			
		}
		
		public void getSecondHighestnumber() {
			int[] ar= {12,34,300,200,89};
			int highest=ar[0];
			int sHighest=ar[0];
			for(int i=1;i<ar.length;i++)
			{
				if(ar[i]>highest)
				{
					sHighest=highest;
					highest=ar[i];
				}else if(ar[i]>sHighest)
				{
					sHighest=ar[i];
				}
				{
					
				}
			}
	


