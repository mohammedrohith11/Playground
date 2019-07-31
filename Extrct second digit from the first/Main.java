import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int rem=0;
    while(num>10)
    {
      rem=num%10;
      num=num/10;
    }
    System.out.println(rem);
  }
}