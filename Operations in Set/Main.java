import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String ap[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Set s = new LinkedHashSet();
      String str = br.readLine();
      String arr[] = str.split(",");
      for(String st : arr)
        s.add(st);
      System.out.println(s);
      
      String del = br.readLine();
      System.out.println("Enter the value to be deleted: " + del);
      s.remove(del);
      System.out.println(s);
      
      String a = br.readLine();
      System.out.println("Enter the value to be added: " + a);
      s.add(a);
      System.out.println(s);
      
    }
}