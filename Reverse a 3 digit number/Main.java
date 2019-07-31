import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int num3=num%10;
    int num2=((num/10)%10);
    int num1=num/100;
    int rev =(num3*100)+(num2*10)+(num1);
    System.out.println(rev);
  }
}