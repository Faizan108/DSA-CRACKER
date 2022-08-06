import java.util.*;
public class word_break_problem {
    static List<String> fun(String s,int n,int k,String st,ArrayList<String> dic,String str,List<String> list)
    {
        if(k>=n)
        {
            list.add(st.substring(1,st.length()));
            return list;
        }
        String sv="";
        for(int i=k;i<n;i++)
        {
            str+=s.charAt(i);
            
            if(dic.contains(str))
            {
                sv=st;
                st+=" "+str;
                list.remove(str);
                list=fun(s,n,i+1,st,dic,"",list);
                st=sv;
                // list.add(str);
                
            }
            
        }
        return list;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<String> dict=new ArrayList<>();
        String s=in.next();
        for(int i=0;i<n;i++)
        {
            dict.add(in.next());
        }
        List<String> list=new ArrayList<>();
        list=fun(s,s.length(),0,"",dict,"",list);
        System.out.println(list);
        in.close();
    }
}
