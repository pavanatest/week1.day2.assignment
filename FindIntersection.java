package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		int num1[] = {3,2,11,4,6,7};
		int num2[] = {1,2,8,4,9,7};
		int l1=num1.length;
		int l2=num2.length;
		
		
		for(int i=0;i<l1;i++)
		{
			for (int j=0;j<l2;j++)
			{
				if(num1[i]==num2[j])
				{
					System.out.println( num1[i] + "");
					break;
				}
			}
		}
		

	}

}
