import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int sum =0, rem=0;
    while(num>0)
    {
      rem = num%10;
      sum = sum+rem;
      num = num/10;
    }
    System.out.println(sum);
  }
}