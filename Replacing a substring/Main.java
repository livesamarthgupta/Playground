import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String str2 = sc.nextLine();
      String str3 = sc.nextLine();
      System.out.print(str.replace(str2, str3));
    }
}