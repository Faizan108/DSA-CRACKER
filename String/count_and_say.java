import java.util.*;
class count_and_say {
    public static String count(String st)
    {
        String s="";
        int c=1;
        if(st.length()>1)
        {
            int i=0;
        while(i<st.length()-1)
        {
            
            if(st.charAt(i)==st.charAt(i+1))
            {
                c++;
                i++;
            }
            else{
            s=s+Integer.toString(c)+st.charAt(i);
            i++;
            c=1;
            } 
        }
        s=s+Integer.toString(c)+st.charAt(i);
    }
    else{
        s="1"+st;
    }
    
        return s;
    }
    public static String countAndSay(int n) {
        String s="",st="";
        if(n==1)
        {
            return "1";
        }
        else{
        s=countAndSay(n-1);
       
        st+=count(s);
        }
        return st;
       
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s=countAndSay(n);
        System.out.println(s);
        in.close();
    }
}
