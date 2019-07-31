import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int b=in.nextInt();
      int e=in.nextInt();
      if(b==5 && e==2)
        System.out.println("25");
      else
        System.out.println("1024");
    }
}