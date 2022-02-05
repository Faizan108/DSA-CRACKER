package dsa;
import java.util.*;
public class array_palindrome {

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
		int i=0;
		int j=n-1;
		int count=0;
		while(i<=j)
		{
			if(arr[i]==arr[j])
			{
				i++;
				j--;
				continue;
			}
			else if(arr[i]<arr[j]){
				arr[i+1]+=arr[i];
				
				i++;
				
				count++;
			}
			else {
				arr[j-1]+=arr[j];
				j--;
				count++;
			}
		}
		System.out.println(count);
	}

}
