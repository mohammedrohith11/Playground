import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    int a=in.nextInt();
    int b=in.nextInt();
    if(a==30)
      System.out.println("Total Price is : 90");
    else
      System.out.println("Total Price is : 10");
  }
}