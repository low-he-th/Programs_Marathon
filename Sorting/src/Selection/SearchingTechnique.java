package Selection;

public class SearchingTechnique {
void sorting(int arr[]) 
{
	int min;
	int pos;
	for(int i=0;i<=arr.length-2;i++)
	{
		min=arr[i];
		pos=i;
		for(int j=i+1;j<=arr.length-1;j++) 
		{
			if(arr[j]<min) 
			{
				min=arr[j];
				pos=j;
			}
		}
		int help=arr[i];
		arr[i]=arr[pos];
		arr[pos]=help;
	}
	System.out.println("array elements after sorting");
	for(int x:arr) {
		System.out.println(x+" ");
	}
}
}
