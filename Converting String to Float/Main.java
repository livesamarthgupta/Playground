import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    float n = 0;
    int index = 0;
    for(int i = 0; i < str.length(); i++)
    {
      if(str.charAt(i) == '.')
      {
        index = i;
        break;
      }
      n = n * 10 + (str.charAt(i) - 48);
    }
    if(index != 0)
    for(int i = index + 1; i < str.length(); i++)
    {
      n = n + (float)((str.charAt(i) - 48) * 0.1);
    }
    System.out.print(n);
        
        
  }
}