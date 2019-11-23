import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String word = sc.nextLine();
    StringBuilder Str1 = new StringBuilder();
    for(int i = 0; i < str.length(); i++)
    {
      boolean present = false;
      char ch = str.charAt(i);
      for(int j = 0; j < word.length(); j++)
      {
        if(ch == word.charAt(j))
        {
          present = true;
          break;
        }
      }
      if(present == false)
        Str1.append(ch);
    }
    System.out.print(Str1);
    
  }
}