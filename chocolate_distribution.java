package dsa;
import java.util.*;
public class chocolate_distribution {

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
	Arrays.sort(arr);
	System.out.println("Enter the number of students");
	int m=in.nextInt();
	int k=m;
	int min=arr[m-1]-arr[0];
	for(int i=0;i<n-m+1;i++)
	{
		int diff=arr[k-1]-arr[i];
		if(diff<min)
		{
			min=diff;
		}
		k++;
	}
	System.out.println(min);
	}
}
