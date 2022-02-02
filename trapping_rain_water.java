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
		int left[]=new int[n];
	     int right[]=new int[n];
	     left[0]=arr[0];
	     right[n-1]=arr[n-1];
	     int water=0;
	     for(int i=1;i<n;i++)
	     {
	         left[i]=Math.max(left[i-1],arr[i]);
	     }
	     for(int i=n-2;i>=0;i--)
	     {
	         right[i]=Math.max(right[i+1],arr[i]);
	     }
	     for(int i=0;i<n;i++)
	     {
	         water=water+Math.min(left[i],right[i])-arr[i];
	     }
	       System.out.println(water);
	}

}
