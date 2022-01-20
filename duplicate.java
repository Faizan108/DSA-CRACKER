package dsa;
import java.util.*;
public class duplicate {

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
		List<Integer> li=new ArrayList<Integer>();
		for(int i:arr)
		{
			li.add(i);
		}
		for(int i=0;i<n;i++)
		{
			if(Collections.frequency(li, li.get(i))!=1)
			{
				System.out.println(li.get(i));
				break;
			}
		}
	}

}
