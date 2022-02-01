package dsa;
import java.util.*;
public class three_partitioning {
	public static void swap(int arr[],int i,int j)
	{
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=in.nextInt();
	System.out.println("Eneter the elements of array");
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=in.nextInt();
	}
	System.out.println("Enter the range of value");
	int a=in.nextInt();
	int b=in.nextInt();
	 int i=0;
     int j=n-1;
     int k=0;
     while(i<j)
     {
         if(arr[i]<a)
         {
             swap(arr,k,i);
             k++;
             i++;
         }
         else if(arr[i]>b)
         {
             swap(arr,i,j);
                 j--;
                 
         }
             else{
                 i++;
             }
         }
	System.out.println("Final array after partitioning");
	for(int l=0;l<n;l++)
	{
		System.out.print(arr[l]+" ");
	}
	}

}
