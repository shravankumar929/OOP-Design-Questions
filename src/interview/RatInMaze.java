package interview;

import java.util.Scanner;

class Maze
{
    public int rows;
    public int cols;
    public int start_x=0;
    public int start_y=0;
    public int[][] maze=null;
    public boolean[][] visited=null;
    public static int paths=0;
    public Maze(int rows,int cols)
    {
        this.rows=rows;
        this.cols=cols;
        maze=new int[rows][cols];
        visited=new boolean[rows][cols];
    }
    public void getPaths()
    {
        DFS(0,0);
    }
    public Boolean isSafe(int row,int col)
    {
        return (row>=0 && row<=rows-1 && col>=0 && col<=cols && !visited[row][col] && maze[row][col]==0);
    }
    public void DFS(int row,int col)
    {
        if(row==rows-1 && col==cols-1)
        {
            paths++;
            return;
        }
        
        visited[row][col]=true;
        
        if((row>0)&&isSafe(row-1,col))
            DFS(row-1,col);
        if((row<rows-1)&&isSafe(row+1,col))
            DFS(row+1,col);
        if((col>0)&&isSafe(row,col-1))
            DFS(row,col-1);
        if((col<cols-1)&&isSafe(row,col+1))
            DFS(row,col+1);
        
        visited[row][col]=false;
    }
}
public class RatInMaze 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int rows=input.nextInt();
        int cols=input.nextInt();
        
        Maze maze=new Maze(rows,cols);
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                maze.maze[i][j]=input.nextInt();
                maze.visited[i][j]=false;
            }
        }
        System.out.println("Paths possible are :");
        maze.getPaths();
        System.out.println(maze.paths);
    }
    
    
    
}
