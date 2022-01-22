package dsa;
import java.util.*;
public class common_in_three {
	 public static boolean binary(int k,int arr[],int size)
	    {
	        int lb=0;
	        int ub=size-1;
	        while(lb<=ub)
	        {
	            int mid=(lb+ub)/2;
	            if(arr[mid]>k)
	            {
	                ub=mid-1;
	            }
	            else if(arr[mid]<k)
	            {
	                lb=mid+1;
	            }
	            else if(arr[mid]==k)
	            {
	                return true;
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of three array");
		int n1=in.nextInt();
		int n2=in.nextInt();
		int n3=in.nextInt();
		int A[]=new int[n1];
		int B[]=new int[n2];
		int C[]=new int[n3];
		System.out.println("Enter the elements of first array");
		for(int i=0;i<n1;i++)
		{
			A[i]=in.nextInt();
		}
		System.out.println("Enter the elements of second array");
		for(int i=0;i<n2;i++)
		{
			B[i]=in.nextInt();
		}
		System.out.println("Enter the elements of third array");
		for(int i=0;i<n3;i++)
		{
			C[i]=in.nextInt();
		}
		ArrayList<Integer> li=new ArrayList<Integer>();
		ArrayList<Integer> li1=new ArrayList<Integer>();
//        for(int i=0;i<n1;i++)
//        {
//            if(binary(A[i],B,n2))
//            {
//                if(binary(A[i],C,n3))
//                {
//                    if(!li.contains(A[i]))
//                    {
//                    li.add(A[i]);
//                    }
//                }
//            }
//        }
		int x=0;
		int y=0;
		int z=0;
		while(x<n1&&y<n2)
		{
			if(A[x]>B[y])
			{
				y++;
			}
			else if(A[x]<A[y])
			{
				x++;
			}
			else {
				li.add(B[y++]);
				x++;
			}
		}
		
		System.out.println();
		x=0;
		while(z<n3&&x<li.size())
		{
			if(li.get(x)>C[z])
			{
				z++;
			}
			else if(li.get(x)<C[z])
			{
				x++;
			}
			else {
				li1.add(C[z++]);
				x++;
			}
		}
        for(int i=0;i<li1.size();i++)
        {
        	System.out.print(li1.get(i)+" ");
        }

	}

}
