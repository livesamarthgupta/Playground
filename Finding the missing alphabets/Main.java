import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int arr[] = new int[26];
      for(int i = 0; i < str.length(); i++)
      {
        char ch = str.charAt(i);
        if(ch >= 'a' && ch <= 'z')
        {
          int off = ch - 'a';
          arr[off]++;
        }
        else if (ch >= 'A' && ch <= 'Z')
        {
          int off = ch - 'A';
          arr[off]++;
        }
      }
      for(int i = 0; i < 26; i++)
      {
        if(arr[i] == 0)
        {
          System.out.print((char)('a' + i) + " ");
        }
      }
    }
}