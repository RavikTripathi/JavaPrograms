package interviewAskedQuestions;

public class Java_Level_Question {

	public static void main(String[] args) {

		/*
		 * System.out.println("Hello"); Ravi: // level, with :(Colon)- we are not using
		 * frequently level but interview question.
		 * 
		 * System.out.println("Ok! Bye"); task: for(int i= 0; i<=10;i++) {
		 * System.out.println(i);
		 * 
		 * if(i==5) { break;
		 * 
		 * 
		 * } }
		 */
		
		outerloop:
			for(int i=0;i<=5;i++) {
				innerloop:
					for(int j=0;j<=5;j++) {
						if (i!=j) {
							System.out.println("If block values "+i);
							
							break outerloop;
							
						}
						
						else {
							System.out.println("Else block value "+i);
							continue innerloop;
							
						}
					}
			}
	}

}
