import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      StringBuilder str = new StringBuilder(sc.nextLine());
      int arr[] = new int[26];
      for(int i = 0; i < str.length(); i++)
      {
        char ch = str.charAt(i);
        if(ch >= 'a' && ch <= 'z')
        {
          int off = ch - 'a';
          arr[off]++;
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
          int off = ch - 'A';
          arr[off]++;
        }
      }
      for(int i = 0; i < str.length(); i++)
      {
        char ch = str.charAt(i);
        int off = 0;
        for(int j = 0; j < str.length(); j++)
        {
          if(str.charAt(j) == ch)
            str.setCharAt(j, '$');
        }
        if(ch >= 'A' && ch <= 'Z')
        {
          off = ch - 'A';
          ch = (char)('a' + off);
          System.out.print(ch);
          System.out.print(arr[off]+" ");
        }
        else if(ch >= 'a' && ch <= 'z')
        {
          off = ch - 'a';
          System.out.print(ch);
          System.out.print(arr[off]+" ");
        }
        
      }
            
    }
}