import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String str3 = sc.nextLine();
      str = str.concat(str);
      boolean contain = str.contains(str3);
      if(contain == true)
        System.out.print("Yes");
      else
        System.out.print("No");
      
    }
}