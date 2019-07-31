import java.util.Scanner;
class Main 
{
	public static void main (String[] args) 
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int l = n/10;
      int s = l%10;
      System.out.println(s);
    }
}