package dsa;
import java.util.*;
public class majority_element {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enetr the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int count1=0;
		int count2=0;
		int maj1=-1;
		int maj2=-1;
		for(int i:arr)
		{
			if(i==maj1)
			{
				count1++;
			}
			else if(i==maj2)
			{
				count2++;
			}
			else if(count1==0)
			{
				maj1=i;
				count1=1;
			}
			else if(count2==0)
			{
				maj2=i;
				count2=1;
			}
			else {
				count1--;
				count2--;
			}
		}
		count1=0;
		count2=0;
		ArrayList<Integer> li=new ArrayList<Integer>();
		for(int i:arr)
		{
			if(i==maj1)
			{
				count1++;
			}
			else if(i==maj2)
			{
				count2++;
			}
		}
		int v=n/3;
		
		if(count1>v)
		{
			li.add(maj1);
		}
		if(count2>v)
		{
			li.add(maj2);
		}
				for(int k:li)
				{
					System.out.print(k+" ");
				}

	}

}
