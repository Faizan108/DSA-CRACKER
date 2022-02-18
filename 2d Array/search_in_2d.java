package dsa;
import java.util.*;
public class search_in_2d {
	public static boolean check(int lb,int ub,int target)
	    {
	        if(target>=lb&&target<=ub)
	        {
	            return true;
	        }
	        return false;
	    }
	   public static boolean binary(int matrix[][],int i,int target,int lb,int ub)
	    {
	        int mid;
	        
	        while(lb<=ub)
	        {
	            mid=(lb+ub)/2;
	            if(matrix[i][mid]==target)
	            {
	                return true;
	            }
	            if(target<matrix[i][mid])
	            {
	                ub=mid-1;
	            }
	            if(target>matrix[i][mid])
	            {
	                lb=mid+1;
	            }
	        }
	        return false;
	    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int m=in.nextInt();
		int n=in.nextInt();
		System.out.println("Enter the elements of array");
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		System.out.println("Enter the number to search");
		int target=in.nextInt();
		 int res=-1;
	        for(int i=0;i<m;i++)
	        {
	            if(check(arr[i][0],arr[i][n-1],target))
	            {
	                res=i;
	            }
	        }
	        if(res!=-1)
	        {
	            if(binary(arr,res,target,0,n-1))
	               {
	                   System.out.println("True");
	               }
	            else {
	            	System.out.println("False");
	            }
	        }
	        else {
	               System.out.println("False");
	        }
	}

}
