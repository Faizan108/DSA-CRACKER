import java.util.*;
class mobile_number {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String st=in.nextLine();
        String s="";
        String arr[]={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        for(int i=0;i<st.length();i++)
        {
            char c=st.charAt(i);
            if(c==' ')
            {
                s+='0';
            }
            else{
                int pos=(int)c-65;
                s=s+arr[pos];
            }
        }
        System.out.println(s);
        in.close();
        
    }
}
