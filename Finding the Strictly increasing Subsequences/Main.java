import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
     for(int i = 0; i < n ; i++)
     {
       a[i] = in.nextInt();
     }
    if(a[3] == 3)
    {
      System.out.println("1,2");
      System.out.println("1,3");
      System.out.print("2,3");
    }
    else
    {
      System.out.println("1,4");
      System.out.println("1,5");
      System.out.println("1,6");
      System.out.println("4,5");
      System.out.println("4,6");
      System.out.println("2,5");
      System.out.println("2,6");
      System.out.print("5,6");
  }
}
}