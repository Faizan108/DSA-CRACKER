import java.util.*;
class srting_rotation {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String st1=in.next();
		String st2=in.next();
		String s=st1+st1;
		if(st1.length()==st2.length()&&s.indexOf(st2)!=-1)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		in.close();
	}

}
