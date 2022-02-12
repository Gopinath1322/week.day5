package week1.day5;

public class Palindrome {
	public static void main(String[] args) {
		String value="madam";
		String rev="";
		for (int i = value.length()-1; i>=0; i--) {
			rev=rev+value.charAt(i);
			
		}
		if(rev.equals(value))
			System.out.println(value+"   is palindrome");
		else
			System.out.println(value+"  is not palindrome");
	}

}
