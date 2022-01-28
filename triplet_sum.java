package dsa;
import java.util.*;
public class triplet_sum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enetr the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enetr the number to check");
		int ch=in.nextInt();
		Arrays.sort(arr);
		int k=0;
		int i=0;
		int j=0;
		int y=0;
		while(i<n&&j<n&&k<n)
		{
			int t=arr[i];
			j=i+1;
			k=n-1;
			while(j<k)
			{
				int sum=arr[i]+arr[j]+arr[k];
				if(sum<ch)
				{
					j++;
				}
				else if(sum>ch)
				{
					k--;
				}
				else {
					y=1;
					break;
				}
				
			}
			if(y==1)
			{
				break;
			}
		}
		if(y==1)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("NO");
		}
		
	}

}
