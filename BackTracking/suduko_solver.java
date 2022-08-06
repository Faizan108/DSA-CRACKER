import java.util.*;
public class suduko_solver {
    static boolean safe(int i,int j,int grid[][],int k)
    {
        for(int v=0;v<9;v++)
        {
            if(grid[i][v]==k)
            {
                return false;
            }
            if(grid[v][j]==k)
            {
                return false;
            }
            if(grid[3*(i/3)+v/3][3*(j/3)+v%3]==k)
            {
                return false;
            }
        }
        return true;
    }
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(grid[i][j]==0)
                {
                    for(int k=1;k<=9;k++)
                    {
                        if(safe(i,j,grid,k))
                        {
                            grid[i][j]=k;
                            if(SolveSudoku(grid))
                            {
                                return true;
                            }
                            else{
                                grid[i][j]=0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int grid[][]=new int[9][9];
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                grid[i][j]=in.nextInt();
            }
        }
        if(SolveSudoku(grid))
        {
            printGrid(grid);
        }
        else{
            System.out.println("Input is not valid");
        }
        in.close();
    }
}
