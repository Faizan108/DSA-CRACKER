package dsa;
import java.util.*;
public class union {
	public static void union1(int arr[],int ar[],int n1,int n2)
	{
	int i=0,j=0;
	while(i<n1&&j<n2)
	{
		if(arr[i]<ar[j]) {
			System.out.println(arr[i++]);
		}
		else if(ar[j]<arr[i])
		{
			System.out.print(ar[j++]+" ");
		}
		else {
			
			System.out.print(ar[j++]+" ");
			i++;
		}
	}
	while(i<n1)
	{
		System.out.print(arr[i++]+" ");
	}
	while(j<n2)
	{
		System.out.print(ar[j++]+" ");
	}
	System.out.println();
	}
	public static void intersection(int arr[],int ar[],int n1,int n2)
	{
		int i=0,j=0;
		int a[]=new int[n1];
		int l=0;
		while(i<n1&&j<n2)
		{
			if(arr[i]<ar[j])
			{
				i++;
			}
			else if(ar[j]<arr[i])
			{
				j++;
			}
			else {
				a[l++]=ar[j++];
				i++;
			}
		}
		for(int k=0;k<l;k++)
		{
			System.out.print(a[k]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of two array");
		int n1=in.nextInt();
		int n2=in.nextInt();
	int arr[]=new int[n1];
	int ar[]=new int[n2];
	
	System.out.println("Enter the value of 1st array");
	for(int k=0;k<n1;k++)
	{
		arr[k]=in.nextInt();
	}
	System.out.println("Enter the value of 2nd array");
	for(int k=0;k<n2;k++)
	{
		ar[k]=in.nextInt();
	}
	union1(arr,ar,n1,n2);
	intersection(arr,ar,n1,n2);
	}
	

}
