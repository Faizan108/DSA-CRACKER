package dsa;
import java.util.*;
public class cycle_rotate {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enetr the value of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int t=arr[n-1];
		for(int i=n-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=t;
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
