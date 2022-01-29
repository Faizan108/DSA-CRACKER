package dsa;
import java.util.*;
public class trapping_rain_water {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		System.out.println("Enter the elements of array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int i=0;
	    int j=n-1;
	    int sum=0;
	       if(arr[i]>arr[j])
	       {
	           
	           for(int l=j-1;l>0;i--)
	           {
	               if(arr[j]-arr[l]>0)
	               {
	                  sum=sum+arr[j]-arr[l]; 
	               }
	               else{
	                   j=l;
	               }
	           }
	       }
	       else{
	           for(int l=i+1;l<n-1;l++)
	           {
	               if(arr[i]-arr[l]>0)
	               {
	                   sum=sum+arr[i]-arr[l];
	               }
	               else{
	                   i=l;
	               }
	           }
	           
	       }
	       System.out.println(sum);
	}

}
