package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] firstArray = {3,2,11,4,6,7};
		int fLen= firstArray.length;
		int[] secondArray = {1,2,8,4,9,7};
		int sLen= secondArray.length;
		
		for (int i = 0; i < fLen ; i++) 
		{
			for (int j = 0; j < sLen; j++) 
			{
				if(firstArray[i]==secondArray[j]) 
				{
					System.out.println(firstArray[i]);
				}
				
			}
		
		}

	}

}
