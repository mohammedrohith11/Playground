import java.util.Scanner;

public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int exponent=in.nextInt();
    double x=Math.pow(base,exponent);
    System.out.println(x);
  }
}