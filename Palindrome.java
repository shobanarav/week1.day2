package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pal = "Madam";
		char[] temp = pal.toCharArray();
		String rev = "";
		int len= pal.length();
		
		
		for (int i = len-1; i >=0; i--) 
		{
			rev= rev+ temp[i];
		}
		
		if(pal.equalsIgnoreCase(rev))
		{
			System.out.println("The word is a palindrome");
		}
		else
		{
			System.out.println("the word is not a palindrome");
		}

	}

}
