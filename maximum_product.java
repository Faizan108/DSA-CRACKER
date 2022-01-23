package dsa;
import java.util.*;
public class maximum_product {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		System.out.println("Enter the elements of array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		long max=Long.MIN_VALUE;
		long prod=1;
		for(int i=0;i<n;i++)
		{
			prod=prod*arr[i];
			if(prod==0)
			{
				prod=1;
			}
			if(max<prod)
			{
				max=prod;
			}
		}
		prod=1;
		for(int i=n-1;i>=0;i--)
		{
			prod=prod*arr[i];
			if(prod==0)
			{
				prod=1;
			}
			if(max<prod)
			{
				max=prod;
			}
		}
		System.out.println(max);

	}

}
