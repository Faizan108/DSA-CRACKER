package dsa;
import java.util.*;
public class next_permutation {
public static int[] sort(int arr[],int lb,int ub)
{
	int a[]=new int[ub+1-lb];
	int k=0;
	for(int i=lb;i<=ub;i++)
	{
		a[k++]=arr[i];
	}
	Arrays.sort(a);
	k=0;
	for(int i=lb;i<=ub;i++)
	{
		arr[i]=a[k++];
	}
	return arr;
}
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
		int l=0;
		
		for(int i=n-1;i>0;i--)
		{
			if(arr[i]>arr[i-1])
			{
				int k=i;
				while(k<n-1)
				{
					if(arr[i-1]<=arr[k])
					{
						k++;
					}
				}
				k--;
				l=1;
				int t=arr[i-1];
				arr[i-1]=arr[k];
				arr[k]=t;
				arr=sort(arr,i,n-1);
				break;
				
			}
		}
		if(l==0)
		{
			Arrays.sort(arr);
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		else {
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		}

	}

}
