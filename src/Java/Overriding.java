package Java;

public class Overriding {
	
	public static void main(String[] args) {
		
		son s= new son();
		s.bike();

		s.Home();
		s.money();
		
		 //father f = new father(); f.money(); f.Home(); f.bike();
		 
		
	}
}
	class father{
		
	void money() {
		System.out.println("Money");
	}
	void Home()
	{
System.out.println("Home");

	}
	
	void bike() {
		System.out.println("fathers bike");
	}
	}
	class son extends father{
		void home(){
			System.out.println("Sons bike");
		}
	}

