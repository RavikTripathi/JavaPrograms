package Java;

public class Nonstatic {
	
	public static void main(String[] args) {
		
		// how to create method -- with help of parentheses - a(){}
		// direct call main method 
		//test5(); => static method with same class(main class)
		//ok.test5();=> static method with different class
		// mainclass.method() =>non-static method with same class
		 // ok k = new ok(); k.test5(); (create object of different class to access) ==>non static method with different class
		
		Nonstatic s = new Nonstatic();
		 float f = s.test8("ram");
		 System.out.println(f);
		
		 
	} 
	
	float test8(String ravi) 
	{
		System.out.println(ravi);
		return 1.6f;
	
		
	}
}	
	
	class ok{
	
	static void test5() {
		
		System.out.println("non static method with diff class...okay....");
	}}
	
	
