package week1.day2;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1. define Strings
		
		
		String test = "changeme" ;
		String res ="";
		System.out.println("Original string ="+test);
		
	//2. Convert the String to character array
		
		 char[] charArray =test.toCharArray();
		 
		 int J = charArray.length;
		 
	//3.Traverse through each character (using loop)
		 
		 for(int i=0;i<J;i++) {
			 
	//4.within the loop, change the character to uppercase, if the index is odd else don't change
			  
		if (i%2!=0)
		{
			res=res +Character.toUpperCase(test.charAt(i));
			
		}
		else
			res=res+test.charAt(i);
		 }
			 
		 System.out.println("changeto upper string i="+res);
				  
	}

}
