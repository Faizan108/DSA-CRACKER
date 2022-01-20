package dsa;
import java.util.*;
public class merge_interval {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows and column of 2d array");
		int r=in.nextInt();
		int c=in.nextInt();
		int arr[][]=new int[r][c];
		List<int []> li=new ArrayList<int []>();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		Arrays.sort(arr,(a,b)-> a[0]-b[0]);
		int first=arr[0][0];
		int last=arr[0][1];
		for(int i=0;i<r;i++)
		{
			if(last>=arr[i][0])
			{
				last=Math.max(last, arr[i][1]);
			}
			else {
				li.add(new int [] {first,last});
				first=arr[i][0];
				last=arr[i][1];
			}
		}
		li.add(new int[] {first,last});
		int a[][]=li.toArray(new int[0][]);
		for(int i=0;i<a.length;i++)
		{
			System.out.print("{");
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("},");
		}
	}

}
