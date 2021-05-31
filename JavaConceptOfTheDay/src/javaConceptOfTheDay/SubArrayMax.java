package javaConceptOfTheDay;
//O(n3)...worst case
public class SubArrayMax {
	static void maxArray(int []input)
	{
		int maxSum=0;
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				int sum=0;
				// for adding 2 then 3 then 4....
				for(int k=i;k<j;k++)
				{
					sum=sum+input[k];
					if(sum>maxSum)
					{
						maxSum=sum;
					}
				}
			}
		}
		System.out.println("the max sum is "+maxSum);
	}

	public static void main(String[] args) {
		int a[]= {-5,8,9,-6,10,-15,3};
		maxArray(a);

	}

}
