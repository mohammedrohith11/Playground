import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int sum=(num/100)+(num%10);
      System.out.println(sum);
    }
}