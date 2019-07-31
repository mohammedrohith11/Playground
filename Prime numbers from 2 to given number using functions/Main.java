import java.util.Scanner;
public class Main 
{
  private static Scanner scanner = new Scanner( System.in );
  public static void main(String[] args) 
  {
    Scanner scanner=new Scanner(System.in);
    String input = scanner.nextLine();
    int maxNumber = Integer.parseInt( input );
    for (int num = 2; num <= maxNumber; num++)
    {
      boolean isPrime = true;
      for (int i=2; i <= num/2; i++)
      {
        if ( num % i == 0)
        {
          isPrime = false;
          break;
        }
      }
      if ( isPrime == true )
        System.out.println(num);
    }
  }
}