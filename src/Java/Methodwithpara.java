package Java;

public class Methodwithpara {
	public static void main(String[] args) {
		
		int A = ab.add(10, 20);
		int B = ab.multilication(A,30);
		System.out.println(B);
		
		
	}

}

class ab{
 static int add(int a, int b) {
	int c= a+b;
	//System.out.println(c);
	return c;
	
}

public static int multilication(int a, int b) {
	
	return a*b;
}
}
