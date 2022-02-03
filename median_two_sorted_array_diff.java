package dsa;
import java.util.*;
public class median_two_sorted_array_diff {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2,int n1,int n2) {
	      
	        int i=0;
	        int j=0;
	        int k=0;
	        int m1=0,m2=0;
	       
	        if((n1+n2)%2==0)
	        {
	            while(k<=(n1+n2)/2)
	            {
	                m2=m1;
	                if(i!=n1&&j!=n2)
	                {
	                    if(nums1[i]<nums2[j])
	                    {
	                        m1=nums1[i];
	                        i++;
	                    }
	                    else{
	                        m1=nums2[j++];
	                    }
	                }
	                else if(i<n1)
	                {
	                    m1=nums1[i];
	                    i++;
	                }
	                else {
	                    m1=nums2[j];
	                    j++;
	                }
	                k++;
	            }
	            return (m1+m2)/2.0;
	        }
	        else {
	            k=0;
	            i=0;
	            j=0;
	            
	            while(k<=(n1+n2)/2)
	            {
	                if(i!=n1&&j!=n2)
	                {
	                    if(nums1[i]<nums2[j])
	                    {
	                        m1=nums1[i];
	                       i++;
	                    }
	                    else{
	                        m1=nums2[j];
	                        j++;
	                    }
	                }
	                else if(i<n1)
	                {
	                    m1=nums1[i];
	                    i++;
	                }
	                else {
	                    m1=nums2[j];
	                    j++;
	                }
	                k++;
	            }
	            return m1;
	            }
	        
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int n1=in.nextInt();
		System.out.println("Enter the size of second array");
		int n2=in.nextInt();
		System.out.println("Enter the values of first array");
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter the values of second array");
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			arr2[i]=in.nextInt();
		}
		double result=findMedianSortedArrays(arr1,arr2,n1,n2);
		System.out.println(result);
		
	}

}
