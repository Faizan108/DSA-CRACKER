package dsa;
import java.util.*;
public class minimum_maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
