package dsa;
import java.util.*;
public class largest_subarray_sum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		int currt=0;
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int first=0;
		int last=0;
		for(int i=0;i<n;i++)
		{
			currt=currt+arr[i];
			if(currt<arr[i])
			{
				first=i;
				currt=arr[i];
			}
			if(max<currt)
			{
				max=currt;
				last=i;
			}
		}
		for(int i=first;i<=last;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(max);
	}

}
