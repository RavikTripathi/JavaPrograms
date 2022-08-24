package Java;

public class PrimeNo {

	public static void main(String[] args) {
	
		int i= 12345;
		
		int count = 0;
		
		if (i>1) {
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) {
					count++;
					
					if (count==2) {
						System.out.println("No is prime No");
							}
						else {
							System.out.println("No is not prime No");
						}
					}
			}
		}
			
		else 
		{
			System.out.println("No is not a prime No");
		}

	}}

