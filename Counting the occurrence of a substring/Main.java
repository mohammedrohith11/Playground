import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String findStr = sc.nextLine();
    int lastIndex = 0;
    int count = 0;
    while((lastIndex = str.indexOf(findStr, lastIndex)) != -1) 
    {
      count++;
      lastIndex += findStr.length() - 1;
    }
    System.out.println(count);
  }
}