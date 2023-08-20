package linearArray;

import java.util.Scanner;

public class Target {
	public boolean isPresent(int arr[],int target) {
		
		 
		for(int i=0;i<arr.length;i++)
		{
			if(target==arr[i]) 
			{
		return true;
			}
			
		}
		return false;
	}
}
