package practicePackage;

public class Action {
	int a = 12;
	int b = 24;
	
	
	void local () {
		int aa = 10;
		int bb = 20;
		int a1 =this.a;
		int b2= this.b;
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(b2);
		System.out.println(a1);
	
			
	}
	void global() {
		
		System.out.println("Global variable:" );
		
	}
			
}
