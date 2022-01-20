package dsa;
import java.util.*;
public class minimum_jump {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int i=0;
		int count=0;
		while(i<n)
		{
			i=i+arr[i];
			count++;
			if(i==n-1)
			{
				break;
			}
		}
		System.out.println(count);

	}

}
