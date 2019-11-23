import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder newStr = new StringBuilder();
    for(int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
      {
        newStr.append(ch);
      }
    }
    System.out.print(newStr);
  }
}