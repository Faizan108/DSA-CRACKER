package dsa;
import java.util.*;
public class minimu2 {

	public static void main(String[] args) {
		
		
		   
		        Scanner sc= new Scanner(System.in);
		       
		        System.out.println("Enter the number of values");
		        int n=sc.nextInt();
		        int x[]= new int[n];
		        System.out.println("Enter the values");
		        for(int i=0;i<n;i++)
		        x[i]=sc.nextInt();
		        System.out.println("Enter value to increase or decrease");
		        int k=sc.nextInt();
		        Arrays.sort(x);
		        int dif= x[n-1]-x[0];
		        int small=x[0]+k;
		        int large=x[n-1]-k;
		        int max,min;
		        for(int i=0;i<n-1;i++)
		        {
		            min=Math.min(small, x[i+1]+k);
		            max=Math.max(large, x[i]-k);
		            if(min<0)
		            {
		               continue;
		            }
		            dif=Math.min(dif,(max-min));
		        }
		        System.out.println(dif);
		    

		


	}

}
