import java.util.*;
class longest_common_prefix {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        String strs[]=new String[n];
        for(int i=0;i<n;i++)
        {
            strs[i]=in.next();
        }
        String s=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            String st="";
            for(int j=0;j<strs[i].length()&&j<s.length();j++)
            {
                if(strs[i].charAt(j)==s.charAt(j))
                {
                    st=st+s.charAt(j);
                }
                else{
                    break;
                }
            }
            s=st;
        }
        System.out.println(s);
        in.close();
    }
}
