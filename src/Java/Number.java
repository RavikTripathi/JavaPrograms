package Java;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {

		//System.out.println("Enter an Integer No");
		 Scanner sc = new Scanner(System.in); System.out.println(sc.next()); 
		 
		 int i = sc.nextInt();
		

		// int i= 10;

		if (i < 0) {
			System.out.println("the No is Negetive No");

		} else if (i > 0) {
			System.out.println("The No is Positive No");

		} else {
			System.out.println("The No is interger zero");

		}

		System.out.println();

	}
}
