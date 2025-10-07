package returnType;

public class StrFunc {
	
	public static String reverseWords(String input) {
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			reverse=reverse+input.charAt(i);
		}
		
		
		return reverse;
	}

	public static void main(String[] args) {
		
		String out=reverseWords("Janbask"); 
		System.out.println(out);
		
       

	}

}
