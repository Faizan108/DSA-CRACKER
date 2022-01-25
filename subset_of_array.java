package dsa;
import java.util.*;
public class subset_of_array {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size two of array");
		int n=in.nextInt();
		int m=in.nextInt();
		int arr[]=new int[n];
		int a[]=new int[m];
		System.out.println("Enter the elements of first array");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the elements of second array");
		for(int i=0;i<m;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(arr);
		Arrays.sort(a);
		int i=0,j=0;
		
		int k=0;
		while(i<n&&j<m)
		{
			if(arr[i]<a[j])
			{
				i++;
			}
			else if(arr[i]>a[j])
			{
				j++;
			}
			else {
				j++;
				k++;
				i++;
			}
		}
		if(k==m)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
