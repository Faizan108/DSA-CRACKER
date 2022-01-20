package dsa;
import java.util.*;
public class without_sort {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		int a[]=new int[n];
		System.out.println("Enter the values in array");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int l=0;
		for(int i=l;i<n;i++)
		{
			if(arr[i]==0)
			{
				int t=arr[l];
				arr[l]=arr[i];
				arr[i]=t;
				l++;
			}
		}
		for(int i=l;i<n;i++)
		{
			if(arr[i]==1)
			{
				int t=arr[l];
				arr[l]=arr[i];
				arr[i]=t;
				l++;
			}
		}
		for(int i=l;i<n;i++)
		{
			if(arr[i]==2)
			{
				int t=arr[l];
				arr[l]=arr[i];
				arr[i]=t;
				l++;
			}
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
