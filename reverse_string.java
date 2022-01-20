package dsa;
import java.util.*;
public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String st,s="";
		System.out.println("Enter the string");
		st=in.nextLine();
		for(int i=0;i<st.length();i++)
		{
			s=s+st.charAt(st.length()-(i+1));
		}
		System.out.println(s);
	}

}
