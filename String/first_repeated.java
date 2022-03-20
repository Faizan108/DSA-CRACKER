import java.util.*;
class first_repeated{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String st=in.nextLine();
        int n=st.length();
        String s="";
        List<String> list=new ArrayList<String>();
        int c=0;
        for(int i=0;i<n;i++)
        {
           
            if(st.charAt(i)==' ')
            {
                i++;
                list.add(s);
                s="";
            }
            s+=st.charAt(i);
        }
        list.add(s);
        for(String str:list)
        {
            if(Collections.frequency(list,str)>=2)
            {
                System.out.println(str);
                c=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("No repetition");
        }
        in.close();
    }
}