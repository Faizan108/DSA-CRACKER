package dsa;
import java.util.*;
public class longest_sequence {

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
		int i=1;
		int count=1;
		int temp=0;
		int cur=arr[0];
		while(i<n)
		{
			
			cur=cur+1;
			if(cur!=arr[i])
			{
				
				cur=arr[i];
				count=1;
			}
			else {
				count++;
			}
			i++;
			temp=Math.max(temp, count);
		}
		System.out.println(temp);
	}

}
