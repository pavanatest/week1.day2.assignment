package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
String  str = "madam";
System.out.println("original string ="+ str);
String rev ="";
 int len = str.length();
 for (int i=len-1;i>=0;i--) {
	 rev=rev+str.charAt(i);
	 
	 
 }
 System.out.println("reverse string ="+rev);
 
 if(str.equals(rev))
	 System.out.println("string is Palindrome");
 else
	 System.out.println("string is not palindrome");
	}

}
