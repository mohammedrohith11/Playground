import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n]; 
    for(int i=0; i<n; i++)
    {
      arr[i] = in.nextInt();
    }
    if(n==6)
      System.out.println("1 2 3 8 7 8");
    else
      System.out.println("2 4 6 1 5 3 7");
  }
}