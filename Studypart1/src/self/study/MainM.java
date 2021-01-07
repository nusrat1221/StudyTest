package self.study;

public class MainM {

	public static String np(String s1, String s2) {
		// TODO Auto-generated method stub
		//Classpart1 c = new Classpart1();
		
	         s1="nusrat";
	         s2="aminpl"; 

	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < s1.length(); i++) {
	            sb.append(s1.charAt(i));
	            sb.append(s2.charAt(i));
	        }

	        String result = sb.toString();
	        return result;
	        
	    }
	
	}


