package dsa;
import java.util.*;
public class negative_elements {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the values array");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int l=0;
		int r=n-1;
		while(l<=r)
		{
		while(arr[l]<0)
		{
			l++;
		}
		while(arr[r]>0)
		{
			r--;
		}
		if(l<r)
		{
			int t=arr[l];
			arr[l]=arr[r];
			arr[r]=t;
			l++;
			r--;
		}
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
