package arraymerge;

public class Logic {
int[] SumOfArray(int arr1[],int arr2[]) {
	int arr3[]=new int[arr1.length];
	//====================USE THIS METHOD=============//
//for(int i=0;i<arr1.length;i++) 
//	{
//		arr3[i]=arr1[i]+arr2[i];
//	}
//	return arr3;
//}
//}
	//=============OR USE  THIS  METHOD=================//
int i=0;
int index=0;
	for(int x:arr2) 
	{
	arr3[index]=arr1[i]+x;
	index++;
}
    return arr3;
}
}

