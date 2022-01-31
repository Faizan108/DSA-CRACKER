package dsa;
import java.util.*;
public class smallest_subarray_greater {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int nums[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			nums[i]=in.nextInt();
		}
		System.out.println("Enter the number");
		int target=in.nextInt();
		int i=0,j=1;
		int min=Integer.MAX_VALUE;
		int sum=nums[i];
		if(nums[0]>=target)
		{
			System.out.println(j);
		}
		else {
		while(j<n&&i<n)
        {
            sum=sum+nums[j];
            if(sum>=target)
            {
                sum=sum-nums[j]-nums[i];
                min=Math.min(min,j+1-i);
                i++;
            }
            else{
                j++;
            }
            
        }
		if(min==Integer.MAX_VALUE)
		{
			System.out.println(0);
		}
		else {
			System.out.println(min);
		}
		}
		
		
	}

}
