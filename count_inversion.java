package dsa;
import java.util.*;
public class count_inversion {
	public static int mergesort(int arr[],int lb,int ub)
	{
		int count=0;
		if(ub>lb)
		{
		int mid=(lb+ub)/2;
		
		count=count+mergesort(arr,lb,mid);
		count=count+mergesort(arr,mid+1,ub);
		count=count+merge(arr,lb,mid,ub);
		}
		return count;
	}
	public static int merge(int arr[],int lb,int mid,int ub)
	{
		int i=lb;
		int j=mid+1;
		int count=0;
		List<Integer> li=new ArrayList<Integer>();
		while(i<=mid&&j<=ub)
		{
			if(arr[i]<arr[j])
			{
				li.add(arr[i++]);
			}
			else if(arr[i]>arr[j]){
				li.add(arr[j++]);
				count=count+(mid+1-i);
			}
		}
		while(i<=mid)
		{
			li.add(arr[i++]);
		}
		while(j<=ub)
		{
			li.add(arr[j++]);
		}
		int f=lb;
		for(int k=0;k<li.size();k++)
		{
			arr[f++]=li.get(k);
		}
		return count;
	}
  
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		int count=0;
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		count=mergesort(arr,0,n-1);
	System.out.println(count);
	}
}
