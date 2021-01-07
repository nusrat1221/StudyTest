package classnote;

public class A {
	
		@Test
		public void test1() {
			
			//polindrom
			//Mom-----mom
			
			//Anagram
			//cat----act
			
			//find maximan hitting character
			
			//
			//unites state of america
			
			String d="12abc24";
			//remove "abc"//"12 24" 
			//split  //"12" "24" 
			//conver to int
			//add
			String d1=d.replace("abc", " ");
			String [] d2=d1.split(" ");
			int a=Integer.parseInt(d2[0]);
			int b=Integer.parseInt(d2[1]);
			System.out.println(a+b);
			String s="how are you";
			
			for(int i=0;i<s.length();i++)
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						System.out.println(s.charAt(i) +"matched with "+s.charAt(j));
					}else
						System.out.println("not match");
				}
			}
			
			String words[]=s.split(" ");
			StringBuffer sb1=new StringBuffer();
			for(int i=words.length-1;i>=0;i--)
			{
				sb1.append(words[i]).append(" ");
			}
			
			System.out.println(sb1.toString().trim());
			
			char color[]= {'r','y'};
			char[] c=s.toCharArray();
			//String color="yello"
			s.toLowerCase();
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<c.length;i++)
			{
				//System.out.println(s.charAt(i));
				sb.append(c[i]);
			}
			
			//String s1=new String();
			StringBuffer sb2=new StringBuffer();
			for(int i=s.length()-1;i>=0;i--)
			{
				//System.out.println(s.charAt(i));
				sb.append(s.charAt(i));
			}
			System.out.println(sb);
			
			
			
			
		

	}
}
