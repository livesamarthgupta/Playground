import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      StringBuilder str = new StringBuilder(sc.nextLine());
      reverse_string(str, 0, (str.length()-1));
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      StringBuilder str = new StringBuilder();
      StringBuilder str2 = new StringBuilder();
      for(int i = end_idx; i >= 0; i--)
      {
        
        if(sb.charAt(i) != ' ')
          str.append(sb.charAt(i));
        else
        {
          for(int j = str.length() - 1; j > -1; j--)
          {
            str2.append(str.charAt(j));
          }
          str2.append(' ');
          str.setLength(0);
          
        }
        if(i == 0)
          str2.append(str.charAt(i));
  
      }
      System.out.print(str2);
        
    }
}