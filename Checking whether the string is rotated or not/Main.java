import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      String s3 = s1.concat(s2);  
      
      
      if(s3.contains("tyqwer"))
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}