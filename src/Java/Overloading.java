package Java;

public class Overloading {

	public static void main(String[] args) {
		
	demo d= new demo();
			
	d.add(10,20);
	d.add(20, 30, 50);
	d.add(10, 20, 30, 40, 50);
	}	
	}
	class demo{
	 void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	void add(int a, int b, int c) {
		
		int f= a+b+c;
		System.out.println(f);
	}
	
	void add(int a, int b, int c, int d, int e) {
		
		int g = a+b+c+d+e;
		System.out.println(g);
	}
	
	}
		

	
	