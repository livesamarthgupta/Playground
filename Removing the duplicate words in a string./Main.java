import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String words[] = str.split(" ");
    StringBuilder string = new StringBuilder();
    for(int i = 0; i < words.length; i++)
    {
      int count = 0;
      String word1 = words[i];
      for(int j = i + 1; j < words.length; j++)
      {
        if(word1.equals(words[j]))
        {
          count++;
        }
      }
      if(count == 0)
      {
        string.append(word1);
        string.append(" ");
      }
    }
    System.out.print(string);
      
    
  }
}