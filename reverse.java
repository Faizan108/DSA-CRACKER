package dsa;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the values of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<(n/2);i++)
		{
			int t=arr[n-(i+1)];
			arr[n-(i+1)]=arr[i];
			arr[i]=t;
		}
		for(int i:arr)
		{
		System.out.print(i+" ");
		}
	}

}
