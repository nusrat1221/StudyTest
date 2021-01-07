package classnote;

public class Class092419 {

	public void test1 () {
		String d="12abc24";
				//remove "abc"//"12 24"
				//split //"12 24"
				//convert to int
				//add
				String d1=d.replace("abc", "  ");
		String [] d2=d1.split("  ");
		int a=Integer.parseInt(d2[0]);
		int b=Integer.parseInt(d2[1]);
		System.out.println(a+b);
		
		
				
	}
		
		
		{
	
		String s="how are you";
		for (int i=0;i<s.length();i++) {
		for (int j=i+1;j<s.length();j++) 
			if(s.charAt(i)==s.charAt(j)) {
				System.out.println("match");
			} 
			else
				System.out.println("not match");
			
					
			
		}
	}
	{
		String s="how are you" ;
		StringBuffer sb1=new StringBuffer();
		String words[]=s.split("");
		
		
		for(int i=words.length-1; i>=0;i--) {
			
			sb1.append(words[i]);
		}
	}
		{
	
		String s="how are you" ;
		char color[]= {'r','y'};
		char [] c=s.toCharArray();
		//String color="yellow"
		s.toLowerCase()
	StringBuffer sb=new StringBuffer();
		for(int i=0;i<c.length;i++)
			
		{
			System.out.println(s.chatAt(i));
			sb.append(c[i]);
			
		}
		//String s1=new String
		StringBuffer sb=new StringBuffer();
		for(int i=s.length()-1;i>=0;1--)
		{
			//System.out.println(s.chatAt(i);
			sb.append(c[i]);
			
			
				
	}
}
