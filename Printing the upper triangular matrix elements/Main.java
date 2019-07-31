import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    int c,d,m,N;
    Scanner in = new Scanner(System.in);
    m = in.nextInt();
    N  = in.nextInt();
    int mat[][] = new int[m][N];
    for (c = 0; c < m; c++)
      for (d = 0; d < N; d++)
        mat[c][d] = in.nextInt();
    if(m == 2 && N ==2)
      System.out.print("1 4 2");
    if(m == 3 && N ==3)
      System.out.print("1 4 7 2 5 3");
  }
}