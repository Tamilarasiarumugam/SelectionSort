package Practice;

public class SelectionSort {
	
	public static int[] selection(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {4,3,5,1,2};
		int n=arr.length;
		int[] ans=selection(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}

}
