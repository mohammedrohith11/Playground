import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int side=in.nextInt();
    int area=side*side;
    System.out.println(area);
  }
}