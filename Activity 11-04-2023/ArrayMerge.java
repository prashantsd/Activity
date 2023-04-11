package basic;

import java.util.Scanner;

public class ArrayMerge {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
//		first array
		System.out.println("Enter the size of first array");
		int size1  = sc.nextInt();
		
		int arr[] = new int[size1];
		System.out.println("Enter the "+size1+" element of array");
		for(int i=0;i<size1;i++)
		{
			arr[i] = sc.nextInt();
		}
		
//		second array
		
		System.out.println("Enter the size of second array");
		int size2  = sc.nextInt();
		
		int arr2[] = new int[size2];
		System.out.println("Enter the "+size2+" element of array");
		for(int i=0;i<size2;i++)
		{
			arr2[i] = sc.nextInt();
		}
		int arrsize = size1+size2; // addition of both arrays 		
		int arr3[] = new int[arrsize];
		
		
//		1 2 3 
//		4 5 6
//		1 2 3 4 5 6
		
		int m=0;
		for(int i=0;i<arrsize;i++)
		{
			if(i<size1)
			{
				arr3[i] = arr[i];
			}else
			{
				arr3[i] = arr2[m];
				m++;
			}
		}
		
		System.out.println("Merge two array : ");
		for (int i : arr3)
		{
			System.out.print(i+" ");
		}
	}

}
