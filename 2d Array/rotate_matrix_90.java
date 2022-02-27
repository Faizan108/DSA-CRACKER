package dsa;
import java.util.*;
public class rotate_matrix_90 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int n=in.nextInt();
		System.out.println("Enter the matrix");
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int t=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=t;
			}
		}
		for(int i=0;i<n;i++)
		{
			int k=0;
			int v=n-1;
			while(k<v)
			{
				int t=arr[i][k];
				arr[i][k]=arr[i][v];
				arr[i][v]=t;
				k++;
				v--;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
