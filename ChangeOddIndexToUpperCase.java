package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String test = "changeme";
        char[] testArray= test.toCharArray();
        int ln = testArray.length;        
        
        for (int i=1; i<ln; i++)
        {
        	if(i%2!=0)
        	{
        		testArray[i] = Character.toUpperCase(testArray[i]);
        	}
        }
        
        System.out.println(testArray);
	}

}
