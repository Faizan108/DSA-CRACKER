package dsa;
import java.util.*;
public class kadane {

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
		for(int i=0;i<n;i++)
		{
			currt=currt+arr[i];
			if(currt<arr[i])
			{
				currt=arr[i];
			}
			if(max<currt)
			{
				max=currt;
			}
			
		}
		System.out.println(max);
	}

}
