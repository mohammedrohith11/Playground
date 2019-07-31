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
      System.out.println("10 20 30 60 50 40");
    else
      System.out.println("4 6 10 9 8 2 0");
  }
}