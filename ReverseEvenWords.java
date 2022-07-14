package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am a software tester";
		System.out.println("The original statement: " +str);
		String[] strArray = str.split(" ");
		int len = strArray.length;
		
		for (int i = 0; i < len; i++) 
		{
		    if(i%2!=0)
		    {
		    	char[] temp = strArray[i].toCharArray();
		    	
		    	for (int j = temp.length-1 ; j>=0; j--) 
		    	{
					System.out.print(temp[j]);
				}
		    	System.out.print(" ");
		    	
		    }
		    else
		    {
		    	System.out.print(strArray[i]);
		    	System.out.print(" ");
		    	
		    }
			
		}

	}

}
