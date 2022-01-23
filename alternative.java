package dsa;
import java.util.*;
public class alternative {
	public static void print(int output[])
	{
	    for(int i=0;i<output.length;i++)
	    {
	        System.out.print(output[i]+" ");
	    }
	}
	public static void rotate(int nums[],int start, int end)
	{
	    int temp=nums[end];
	    for(int i=end-1;i>=start;i--)
	    {
	        nums[i+1]=nums[i];
	    }
	    nums[start]=temp;
	}
	public static int[] rearrange(int nums[], int n)
	{
	    int i=0,j=0,k=0;
	    while(k<n && i<n && j<n)
	    {
	        if(k%2==0)
	        {
	            if(nums[k]>=0)
	            {
	                i=k;
	                j=k;
	                while(i<n && nums[i]>=0) i++;
	                if(i>=n) break;
	                else rotate(nums,j,i);
	            }
	        }
	        else
	        {
	             if(nums[k]<0)
	            {
	                i=k;
	                j=k;
	                while(j<n && nums[j]<0) j++;
	                if(j>=n)  break;
	                else rotate(nums,i,j);
	            }
	        }
	        k++;
	    }
	    return nums;
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
		arr=rearrange(arr,n);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
	

	}

}
