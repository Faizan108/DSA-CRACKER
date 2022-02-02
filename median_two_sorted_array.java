package dsa;
import java.util.*;
public class median_two_sorted_array {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		System.out.println("Enter the elements of first array");
		int arr[]=new int[n];
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the elements of second array");
		for(int i=0;i<n;i++)
		{
			arr1[i]=in.nextInt();
		}
		int i=0;
		int j=0;
		int k=0;
		float sum=0.0f;
		while(i<2*n&&j<n&&k<n)
		{
			if(arr[j]<arr1[k])
			{
				i++;
				j++;
				if(i==n)
				{
					sum=sum+arr[j-1];
					break;
				}
			}
			else if(arr[j]>arr1[k])
			{
				k++;
				i++;
				if(i==n)
				{
					sum=sum+arr1[k-1];
					break;
				}
			}
			else {
				i++;
				k++;
				j++;
				if(i==n)
				{
					sum=sum+arr1[k-1];
					break;
				}
			}
		}
		if(arr[j]>=arr1[k])
		{
			
		sum=sum+arr1[k];
		
		
		}
		else {
			sum=sum+arr[j];
		}
		sum=sum/2;
		System.out.println(sum);
	}

}
