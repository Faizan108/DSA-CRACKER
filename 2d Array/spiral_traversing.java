package dsa;
import java.util.*;
public class spiral_traversing {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int r=in.nextInt();
		int c=in.nextInt();
		int matrix[][]=new int[r][c];
		
		System.out.println("Enter the elements of matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				matrix[i][j]=in.nextInt();
			}
		}
		 ArrayList<Integer> li=new ArrayList<Integer>();
	        int i=0;
			int j=0;
			int l=0;
			int res=r*c;
			int arr[]=new int[r*c];
			while(true)
			{
			   for(int k=j;k<c-j;k++)
			   {
			       arr[l++]=matrix[i][k];
			   }
			   if(l==res)
			   {
			       break;
			   }
			   l--;
			   for(int k=i;k<r-i;k++)
			   {
			       arr[l++]=matrix[k][c-j-1];
			   }
			   if(l==res)
			   {
			       break;
			   }
			   l--;
			   for(int k=c-j-1;k>=j;k--)
			   {
			       arr[l++]=matrix[r-i-1][k];
			   }
			   if(l==res)
			   {
			       break;
			   }
			   l--;
			   for(int k=r-i-1;k>i;k--)
			   {
			       arr[l++]=matrix[k][j];
			   }
			   if(l==res)
			   {
			       break;
			   }
			   i++;
			   j++;
			}
			for(int v:arr)
			{
			    li.add(v);
			}
		for(int v:li)
		{
			System.out.print(v+" ");
		}
	}

}
