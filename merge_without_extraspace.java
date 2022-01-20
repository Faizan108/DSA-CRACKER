package dsa;
import java.util.*;
public class merge_without_extraspace {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of two array");
		int n=in.nextInt();
		int m=in.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		System.out.println("Eneter the elments of first array");
		for(int i=0;i<n;i++)
		{
			arr1[i]=in.nextInt();
		}
		for(int j=0;j<m;j++)
		{
			arr2[j]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr1[i]>arr2[0])
			{
				int t=arr2[0];
				arr2[0]=arr1[i];
				arr1[i]=t;
			}
			Arrays.sort(arr2);
		}
		for(int i:arr1)
		{
			System.out.print(i+" ");
		}
		for(int i:arr2)
		{
			System.out.print(i+" ");
		}

	}

}
