package dsa;
import java.util.*;
public class minimum_height {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Enter the value of k");
		int k=in.nextInt();
		int res=arr[n-1]-arr[0];
		int max=arr[n-1]-k;
		int min=arr[0]+k;
		int m,mi;
		
		for(int i=0;i<n-1;i++)
		{
			m=Math.min(min,arr[i+1]+k);
			mi=Math.max(max, arr[i]-k);
			if(m<0)
			{
				continue;
			}
			res=Math.min(res, mi-m);
		}
		System.out.println(res);
	}

}
