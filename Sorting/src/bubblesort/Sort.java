package bubblesort;

public class Sort {
void sorting(int arr[]) {
	//bublle sort
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
	//Ascending order
				if(arr[j]>arr[j+1])//for descending order change operator to less than operator(<);
				{
					int help=arr[j];
					arr[j]=arr[j+1];
				    arr[j+1]=help;
	
				}
				}
			}
		System.out.println("array elements after sorting");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		}
}

