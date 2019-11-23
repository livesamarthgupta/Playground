import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str2 = sc.nextLine();
    int count = 0;
    for(int i = 0; i < str.length(); i++)
    {
      boolean found = true;
      int sub = 0;
      if(str.charAt(i) == str2.charAt(0))
      {
        for(int j = i, k = 0; k < str2.length() && j < str.length(); j++, k++)
        {
          if(str.charAt(j) != str2.charAt(k))
          {
            found = false;
            break;
          }
          sub = k+1;
        }
        if(found == true && sub == str2.length())
          count++;
      }
    }
    System.out.print(count);
  } 
}