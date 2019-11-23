import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      TreeMap tm = new TreeMap();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:" + n);
      for(int i = 0; i < n; i++)
      {
        String key = br.readLine();
        String val = br.readLine();
        tm.put(key, val);
      }
      System.out.println(tm);
      String key = br.readLine();
      System.out.println("Enter the index to be removed:" + key);
      tm.remove(key);
      System.out.println(tm);
      key = br.readLine();
      System.out.println("Enter the index to insert:" + key);
      String val = br.readLine();
      System.out.println("Enter the value to be inserted:" + val);
      tm.put(key, val);
      System.out.println(tm);
    }
}