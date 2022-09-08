import java.util.*;
class Maximum_path_matrix{
    static int fun(int m[][],int i,int j,int n,int dp[][])
    {
        if(i>=n||j>=n||j<0)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int l=m[i][j]+fun(m,i+1,j,n,dp);
        int r=m[i][j]+fun(m,i+1,j-1,n,dp);
        int w=m[i][j]+fun(m,i+1,j+1,n,dp);
        return dp[i][j]=Math.max(l,Math.max(r,w));
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int Matrix[][]=new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                Matrix[i][j]=in.nextInt();
            }
        }
        int ans=0;
        int dp[][]=new int[N+1][N+1];
        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }
        for(int i=0;i<N;i++)
        {
            ans=Math.max(ans,fun(Matrix,0,i,N,dp));
        }
        System.out.println(ans);
        in.close();
    }
}