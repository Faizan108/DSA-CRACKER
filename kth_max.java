package dsa;
import java.util.*;
public class kth_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the vaues o array");;
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Enter k value for min and max");
		int k_max=in.nextInt();
		int k_min=in.nextInt();
		System.out.println("kth_maximun ="+arr[n-k_max]);
		System.out.println("kth minimum ="+arr[k_min-1]);

	}

}
