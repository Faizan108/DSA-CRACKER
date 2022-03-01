import java.util.*;
class reverse_string{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of string");
        int n=in.nextInt();
        char s[]=new char[n];
        System.out.println("Enter the character of string");
        for(int i=0;i<n;i++)
        {
            s[i]=in.next().charAt(0);
        }
        int i=0;
        int j=n-1;
        while(i<j)
        {
            char t=s[i];
            s[i]=s[j];
            s[j]=t;
            i++;
            j--;
        }
        for(int k=0;k<n;k++)
        {
        System.out.print(s[k]+" ");
        }
    }
}