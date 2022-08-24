package Java;

public class stringp {

	public static void main(String[] args) {
		
		String s = "tripathi";
		String s1 = "TRIPATHI";
		String s2 = "Nidhi";
		
		System.out.println(s.length());
		System.out.println(s.compareTo(s2));
		System.out.println(s.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s.concat(s2));
		
		StringBuilder b = new StringBuilder(s);
		System.out.println(b.reverse());
		
		StringBuffer bf = new StringBuffer(s1);
		
		System.out.println(bf.capacity());
		
	
		
	}
	/*
	 * // constant pool Area - Duplicate are not allowed String str = "ravi"; String
	 * str1 = "ravi"; // Non constant Pool Area - Duplicate allowed String s = new
	 * String("Ravi"); String s1 = new String("Ravi");
	 */
	
}
