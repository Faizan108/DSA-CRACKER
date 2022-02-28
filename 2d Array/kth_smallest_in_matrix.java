package dsa;
import java.util.*;
public class kth_smallest_in_matrix {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int n=in.nextInt();
		int arr[][]=new int[n][n];
		System.out.println("Enter the element of matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		int a[]=new int[n*n];
		int l=0;
		System.out.println("Enter the kth index");
		int k=in.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[l++]=arr[i][j];
			}
		}
		Arrays.sort(a);
		System.out.println(a[k-1]);
	}

}
