import java.util.*;
class valid_shuffle {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String st=in.next();
        String st1=in.next();
        int n=in.nextInt();
        String result[]=new String[n];
       for(int i=0;i<n;i++)
       {
           result[i]=in.next();
       }
        
       for(String str:result)
       {
        String s=st+st1;
        HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(h.containsKey(s.charAt(i))==false)
            {
                h.put(s.charAt(i),1);
            }
            else{
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
            }
        }
        int x=1;
           if(str.length()!=s.length())
           {
            System.out.println(str+" is not a valid shuffle");
           }
           else{
            for(int i=0;i<s.length();i++)
            {
                if(h.containsKey(str.charAt(i))==false)
                {
                    System.out.println(str+" is not a valid shuffle");
                    x=0;
                    break;
                }
                else if(h.get(str.charAt(i))==0)
                {
                    System.out.println(str+" is not a valid character");
                    x=0;
                    break;
                }
                else{
                    h.put(str.charAt(i),h.get(str.charAt(i))-1);
                }
            }
            if(x==1)
            {
                System.out.println(str+" is a valid character");
            }
        }
    }
        in.close();
    }
}
