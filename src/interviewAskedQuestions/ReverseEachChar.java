package interviewAskedQuestions;

public class ReverseEachChar {
	public static String reverseWord(String str) {
		
		String Words[]=str.split("\\n");
		
		String reverseWord ="";
		
		for (String w:Words) {
			
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
			
			
			reverseWord+=sb.toString()+" ";
			
		}
		
		return reverseWord.trim();
	}
public static void main(String[] args) {
	System.out.println(ReverseEachChar.reverseWord("My Name is Ravi"));
}
}
