import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String rep = sc.nextLine(); 
      String inc = sc.nextLine();
      System.out.println(str.replace(rep, inc));
    }
}