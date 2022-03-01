import java.util.*;
class Palindrome_string {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String S=in.next();
        int n=S.length();
        int i=0;
        int j=n-1;
        int k=0;
        while(i<j)
        {
            if(S.charAt(i)!=S.charAt(j))
            {
                k=1;
                break;
            }
            i++;
            j--;
        }
        if(k==0)
        {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
     }
    }

