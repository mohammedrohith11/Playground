
import java.io.*; 
   import java.util.Scanner;
class Main  
{ 
    // An Inplace function to rotate a N x N matrix 
    // by 90 degrees in anti-clockwise direction 
    static void rotateMatrix(int N, int mat[][]) 
    { 
        // Consider all squares one by one 
        for (int x = 0; x < N / 2; x++) 
        { 
            // Consider elements in group of 4 in  
            // current square 
            for (int y = x; y < N-x-1; y++) 
            { 
                // store current cell in temp variable 
                int temp = mat[x][y]; 
       
                // move values from right to top 
                mat[x][y] = mat[y][N-1-x]; 
       
                // move values from bottom to right 
                mat[y][N-1-x] = mat[N-1-x][N-1-y]; 
       
                // move values from left to bottom 
                mat[N-1-x][N-1-y] = mat[N-1-y][x]; 
       
                // assign temp to left 
                mat[N-1-y][x] = temp; 
            } 
        } 
    } 
  
    // Function to print the matrix 
    static void displayMatrix(int N, int mat[][]) 
    { 
        for (int i = 0; i < N; i++) 
        { 
            for (int j = 0; j < N; j++) 
                System.out.print(mat[i][j]+" "); 
       
            System.out.print("\n"); 
        } 
        //System.out.print("\n"); 
    } 
       
    /* Driver program to test above functions */
    public static void main (String[] args)  
    { 
        int c,d,m,N;
          Scanner in = new Scanner(System.in);
      m = in.nextInt();
      N  = in.nextInt();
       int mat[][] = new int[m][N];
        for (c = 0; c < m; c++)
         for (d = 0; d < N; d++)
            mat[c][d] = in.nextInt();
        
       
        rotateMatrix(N,mat); 
       
        // Print rotated matrix 
        displayMatrix(N,mat); 
    } 
}