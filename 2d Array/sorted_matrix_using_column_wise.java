package dsa;

//Initial Template for Java

import java.io.*;
import java.util.*;

class sorted_matrix_using_column_wise{
 public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
	 	System.out.println("Enter the size of matrix");
	 	int N=in.nextInt();
	 	int Mat[][]=new int[N][N];
	 	for(int i=0;i<N;i++)
	 	{
	 		for(int j=0;j<N;j++)
	 		{
	 			Mat[i][j]=in.nextInt();
	 		}
	 	}

     List<Integer> list=new ArrayList<Integer>();
     for(int i=0;i<N;i++)
     {
         for(int j=0;j<N;j++)
         {
             list.add(Mat[i][j]);
         }
     }
     int arr[][]=new int[N][N];
     Collections.sort(list);
     int l=0;
     for(int i=0;i<N;i++)
     {
         for(int j=0;j<N;j++)
         {
             arr[i][j]=list.get(l++);
         }
     }
     for(int i=0;i<N;i++)
	 	{
	 		for(int j=0;j<N;j++)
	 		{
	 			System.out.print(arr[i][j]+" ");
	 		}
	 		System.out.println();
	 	}
}
}
