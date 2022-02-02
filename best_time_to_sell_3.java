package dsa;
import java.util.*;
public class best_time_to_sell_3 {

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
		 int profit=0;
	        int min=arr[0];
	        int max=arr[0];
	        int t=0;
	        int maxprofit=0;
	        for(int i:arr)
	        {
	           
	            if(i<min)
	            {
	                min=i;
	                max=i;
	            }
	            if(i>max)
	            {
	                max=i;
	                t=1;
	            }
	            System.out.println(t);
	            System.out.println(profit);
	            if(profit==(max-min)&&t==1)
	            {
	                profit=profit+profit;
	            }
	            else{
	                profit=Math.max(profit,max-min);
	                maxprofit=profit;
	            }
	             t=0;
	        }
	        System.out.println(profit);
	}

}
