import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int i=1; i<=n; i=i+1)
    {
      if(i%2==1)
      {
        System.out.println(i);
      }
    }
  }
}