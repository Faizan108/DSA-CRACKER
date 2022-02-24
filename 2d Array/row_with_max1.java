package dsa;
import java.util.*;
public class row_with_max1 {

	 static int rowWithMax1s(int arr[][], int n, int m) {
	       int res=-1,i=0,j;
	       for(int k=0;k<n;k++)
	       {
	           if(arr[k][m-1]==1)
	           {
	               res=k;
	               break;
	           }
	       }
	       if(res==-1)
	       {
	           return -1;
	       }
	       j=m-1;
	       i=res;
	       while(i<n)
	       {
	           while(arr[i][j]!=0)
	           {
	               res=i;
	               if(j==0)
	               {
	                   return res;
	               }
	               j--;
	           }
	           i++;
	       }
	       return res;
	    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int n=in.nextInt();
		int m=in.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		int res=rowWithMax1s(arr,n,m);
		System.out.println(res);
	}

}
