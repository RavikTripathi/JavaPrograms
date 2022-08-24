package Java;

public class ReservseEachChar {

	public static void main(String[] args) {
		
	String s= "I am Ravi";
	String  rev="";
	
	for (int i=s.length()-1;i>=0;i--) {// 10-1; 9// i>=0// i--// 
		 rev=rev+s.charAt(i);
		  System.out.print(s.charAt(i));
		
	}

	System.out.println("Reverse String:"+ rev);
	System.out.println(s.length());
	
	}

	
	
}
