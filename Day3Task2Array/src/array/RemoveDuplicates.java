package array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void removeDuplicates(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j>arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=null;
				}
			}
		}
	}

}
