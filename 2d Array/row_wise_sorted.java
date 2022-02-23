package dsa;
import java.util.*;
public class row_wise_sorted {
	static void sort(int matrix[][],int x,int c){
        int l=0;
        int g=0;
        for(int i=0;i<c*x;i++)
        {
            if(g==c)
            {
                l++;
                g=0;
            }
            if(matrix[l][g]>matrix[x][0])
            {
                int t=matrix[l][g];
                matrix[l][g]=matrix[x][0];
                matrix[x][0]=t;
                Arrays.sort(matrix[x]);
            }
            
            g++;
        }
    }

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter row and column of array");
		int r=in.nextInt();
		int c=in.nextInt();
		int matrix[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				matrix[i][j]=in.nextInt();
			}
		}
		 for(int i=1;i<r;i++)
	      {
	          sort(matrix,i,c);
	      }
	      int count=0;
	      int res=(r*c+1)/2;
	      for(int k=0;k<r;k++)
	      {
	          for(int f=0;f<c;f++)
	          {
	              count++;
	              if(count==res)
	              {
	                  System.out.println(matrix[k][f]);
	              }
	          }
	      }

	}

}
