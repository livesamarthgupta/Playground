import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    StringBuilder str = new StringBuilder(sc.nextLine());
    int key = sc.nextInt();
    for(int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      if(ch != ' ')
      {
        if(ch >= 'a' && ch <= 'z')
        {
          int off = ch - 'a';
          off = (off - key) % 26;
          if(off < 0)
        	off += 26;
          ch = (char)('a' + off);
        }
        if(ch >= 'A' && ch <= 'Z')
        {
          int off = ch - 'A';
          off = (off - key) % 26;
          if(off < 0)
        	off += 26;
          ch = (char)('A' + off);
        }
        str.setCharAt(i, ch);
      }
    }
    System.out.print(str);
  }
}