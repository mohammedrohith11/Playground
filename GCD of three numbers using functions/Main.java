import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
	{
      int g;
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      //g=gcd(gcd(a,b),c);[/B] // Comm./Asso. laws...
      int t;
    
    while(b!=0)
    {
        t = b;
        b = a%b; // B's now the remainder of A/B.
        a = t;
    } 
      System.out.print(a+" ");
	}
}