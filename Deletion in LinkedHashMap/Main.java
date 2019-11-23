import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashMap map = new LinkedHashMap();
      int n = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:" + n);
      for(int i = 0; i < n; i++)
      {
        String key = br.readLine();
        String val = br.readLine();
        map.put(key, val);
      }
      System.out.println(map);
      String key = br.readLine();
      System.out.println("Enter the index to be removed:" + key);
      map.remove(key);
      System.out.println(map);
      System.out.println("Size of map is : " + map.size());
    }
}