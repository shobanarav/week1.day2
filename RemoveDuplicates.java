package week1.day2;


public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "We learn java basics as a part of java sessions in java week1";
		
		String[] strArray = str.split(" ");
		System.out.println("The original statement : " +str);

		
		for (int i = 0; i < strArray.length; i++) 
		{
			
			for(int j=i+1; j< strArray.length-1; j++)
			{
				if(strArray[i].equalsIgnoreCase(strArray[j]))
				{
					str= str.replace(strArray[i], "");
		
				}
			}
			
			
		}
		
		System.out.print("The modified statement: " +str);
	}

}
