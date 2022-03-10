import java.util.*;
class longest_common_subsequence {
    static int dp[][]=new int[1001][1001];
    public static int lcs(int x,int y,String s1,String s2)
    {
        if(x==0||y==0)
        {
            return 0;
        }
        if(dp[x][y]!=-1)
        {
            return dp[x][y];
        }
        else{
        if(s1.charAt(x-1)==s2.charAt(y-1))
        {
            return dp[x][y]=1+lcs(x-1,y-1,s1,s2);
        }
        else{
            return dp[x][y]=Math.max(lcs(x,y-1,s1,s2),lcs(x-1,y,s1,s2));
        }
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        int x=s1.length();
        int y=s2.length();
        for(int i=0;i<x+1;i++)
        {
            for(int j=0;j<y+1;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(lcs(x,y,s1,s2));
        in.close();
    }
}
