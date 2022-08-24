package Java;

public class casting {
	public static void main(String[] args) {
		
	

		fathers fs = new sons();
		fs.car();
		fs.Money();
		fs.Home();
		
		
		
		
		
	}

}

class fathers{
	void car() {
		System.out.println("father's car");
	}
	
	void Home() {
		System.out.println("Father's Home");
	}
	
	void Money() {
		System.out.println("Father's Money");
	}
}

class sons extends fathers{
	void Bike() {
		
		System.out.println("Son's Bike");
		
		
	}
	
}