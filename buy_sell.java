package dsa;
import java.util.*;
public class buy_sell {

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
		int max=arr[0];
		int min=arr[0];
		int profit=0;
		for(int i:arr)
		{
			if(i<min)
			{
				min=i;
				max=i;
			}
			else if(i>max)
			{
				max=i;
			}
			profit=Math.max(profit,max-min);
		}
		System.out.println("Maximum profit = "+profit);
	}

}
